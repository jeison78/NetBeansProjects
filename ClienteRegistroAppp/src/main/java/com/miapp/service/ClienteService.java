
package com.miapp.service;

import com.miapp.model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dilvi
 */
public class ClienteService {
    private static ClienteService instance = null;
    private List<Cliente>clientes = new ArrayList<>();

    public ClienteService() {
        //Agregar algunos clientes de prueba
        clientes.add(new Cliente(1, "Juan Perez", "Juan@example", "123456789"));
        clientes.add(new Cliente(2, "Maria Lopez", "maria@example.com", "987654321"));
        
    }

    public static ClienteService getInstance() {
        if (instance == null) {
            instance = new ClienteService();
        }
        return instance;
    }
    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> ListarClientes() {
        return clientes;
    }
    
}
