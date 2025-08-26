/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.servlet;

import com.miapp.model.Cliente;
import com.miapp.model.Compra;
import com.miapp.model.Vehiculo;
import com.miapp.service.ClienteService;
import com.miapp.service.CompraService;
import com.miapp.service.VehiculoService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author dilvi
 */

@WebServlet("/RegistrarCompra")
public class RegistrarCompraServlet extends HttpServlet {
    //Utiliza getInstance() para obtener la instancia del servicio en lugar de craer una nueva
    private ClienteService clienteService = ClienteService.getInstance();
    private VehiculoService vehiculoService = VehiculoService.getInstance();
    private CompraService compraService = CompraService.getInstance(); //Usa el singleton

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int clienteId = Integer.parseInt(request.getParameter("clienteId"));
        int vehiculoId = Integer.parseInt(request.getParameter("vehiculoId"));
        
        Cliente cliente = clienteService.ListarClientes().stream()
                .filter(c -> c.getId() == clienteId)
                .findFirst().orElse(null);
                
        Vehiculo vehiculo = vehiculoService.ListarVehiculos().stream()
                .filter(v->v.getId() == vehiculoId)
                .findFirst().orElse(null);
        
        if (cliente != null && vehiculo != null) {
            Compra compra = new Compra(cliente, vehiculo, new Date());
            compraService.registrarCompra(compra); //Asegúrate de que esta linea agregue la compra correctamente
        }
        
        response.sendRedirect("listaCompras.jsp");
    }
}

