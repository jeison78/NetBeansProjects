/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fastfood.service;

import com.fastfood.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dilvi
 */
public class ProductoService {
    private static ProductoService instance = null;
    private List<Producto> productos = new ArrayList<>();

    public ProductoService() {
        productos.add(new Producto(1, "Hamburguesa", 10.00));
        productos.add(new Producto(2, "Papas Fritas", 5.00));
        productos.add(new Producto(1, "Refresco", 3.00));
    }

    public static ProductoService getInstance() {
        if(instance == null) {
            instance = new ProductoService();
        }
        return instance;
    }

    public List<Producto> listarProductos() {
        return productos;
    }

}
