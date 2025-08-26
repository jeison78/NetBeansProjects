/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.contaclist;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dilvi
 */
public class ProductInventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear MAP
        Map<String, Integer> Inventory = new HashMap<>();
        
        //Agregar productos al inventario:
        Inventory.put("Laptop", 10);
        Inventory.put("Smartphone", 22);
        Inventory.put("Tablet S.", 7);
        Inventory.put("TV 75 p.", 5);
        
        //Obtener la cantidad de productos
        System.out.println("Cantidad de Smartphones " + Inventory.get("Smartphone"));
        
        //Conocer la cantidad de cada producto en el invetario
        System.err.println("Lista de la cantidad de cada producto del inventario");
        for(Map.Entry<String, Integer> entry: Inventory.entrySet()){
            System.out.println("Producto:" + entry.getKey()+ ": " + entry.getValue());
    }}
    
}
