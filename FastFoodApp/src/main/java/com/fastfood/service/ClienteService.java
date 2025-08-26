/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fastfood.service;

import com.fastfood.model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dilvi
 */
public class ClienteService {
    private static ClienteService instance = null;
    private List<Cliente> clientes = new ArrayList<>();

    public ClienteService() {
        clientes.add(new Cliente(1, "Oscar Jeison", "oscar@gmail.com", "123456789"));
        clientes.add(new Cliente(2, "Bianca Yaneth", "bianca@gmail.com", "987654321"));
    }

    public static ClienteService getInstance() {
        if(instance == null) {
            instance = new ClienteService();
        }
        return instance;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarCliente() {
        return clientes;
    }

    
}
