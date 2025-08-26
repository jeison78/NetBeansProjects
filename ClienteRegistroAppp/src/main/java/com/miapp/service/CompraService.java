/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.service;

import com.miapp.model.Compra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dilvi
 */
public class CompraService {
    //Instancia estática única de la clase
    private static CompraService instance = null;
    
    //Lista de compras
    private List<Compra> compras = new ArrayList<>();
    
    //Constructor privado para evitar instanciación desde fuera
    private CompraService(){};
    
    //Método estático para obtener la única instancia de CompraService
    public static CompraService getInstance() {
        if (instance == null ) {
            instance = new CompraService();
        }
        return instance;
    }
    
    public void registrarCompra(Compra compra) {
        compras.add(compra);
    }
    
    public List<Compra> ListarCompras() {
        return compras;
    }
}
