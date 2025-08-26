/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.model;

import java.util.Date;

/**
 *
 * @author dilvi
 */
public class Compra {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Date fechaCompra;

    public Compra(Cliente cliente, Vehiculo vehiculo, Date fechaCompra) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaCompra = fechaCompra;
    }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Vehiculo getVehiculo() { return vehiculo; }

    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }

    public Date getFechaCompra() { return fechaCompra; }

    public void setFechaCompra(Date fechaCompra) { this.fechaCompra = fechaCompra; }
}
