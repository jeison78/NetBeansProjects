/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fastfood.service;

import com.fastfood.model.Orden;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dilvi
 */
public class OrdenService {
    private static OrdenService instance = null;
    private List<Orden> ordenes = new ArrayList<>();

    public OrdenService() {}

    public static OrdenService getInstance() {
        if(instance == null) {
            instance = new OrdenService();
        }
        return instance;
    }

    public void registrarOrden(Orden orden) {
        ordenes.add(orden);
    }

    public List<Orden> listarOrdenes() {
        return ordenes;
    }
    
}
