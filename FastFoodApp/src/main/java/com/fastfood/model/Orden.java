/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fastfood.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author dilvi
 */
public class Orden {
    private Cliente cliente;
    private List<Producto> productos;
    private Date fehcaOrden;

    public Orden(Cliente cliente, List<Producto> productos, Date fehcaOrden) {
        this.cliente = cliente;
        this.productos = productos;
        this.fehcaOrden = fehcaOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Date getFehcaOrden() {
        return fehcaOrden;
    }

    public void setFehcaOrden(Date fehcaOrden) {
        this.fehcaOrden = fehcaOrden;
    }
    
    
}
