/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fastfood.servlet;

import com.fastfood.model.Cliente;
import com.fastfood.model.Orden;
import com.fastfood.model.Producto;
import com.fastfood.service.ClienteService;
import com.fastfood.service.OrdenService;
import com.fastfood.service.ProductoService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dilvi
 */
@WebServlet("/RegistrarOrden")
public class RegistrarOrdenServlet extends  HttpServlet{
    private ClienteService clienteService = ClienteService.getInstance();
    private ProductoService productoService = ProductoService.getInstance();
    private OrdenService ordenService = OrdenService.getInstance();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int clienteId = Integer.parseInt(request.getParameter("clienteId"));
        String[] productoIds = request.getParameterValues("productoId");
        
        Cliente cliente = clienteService.listarCliente().stream()
                .filter(c -> c.getId() == clienteId)
                .findFirst().orElse(null);
        
        List<Producto> productos = new ArrayList<>();
        for (String productoId : productoIds){
            Producto producto = productoService.listarProductos().stream()
                    .filter(p -> p.getId() == Integer.parseInt(productoId))
                    .findFirst().orElse(null);
            if(producto != null) {
                productos.add(producto);
            }
        }
        
        if(cliente != null && !productos.isEmpty()) {
            Orden orden = new Orden(cliente, productos, new Date());
            ordenService.registrarOrden(orden);
        }
        
        response.sendRedirect("listaOrdenes.jsp");
    }
}
