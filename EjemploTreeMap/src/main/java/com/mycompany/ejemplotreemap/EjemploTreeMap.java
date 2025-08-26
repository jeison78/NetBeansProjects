/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemplotreemap;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author dilvi
 */
public class EjemploTreeMap {

    public static void main(String[] args) {
        //TreeMap
        Map<String, Integer> edades = new TreeMap<>();
        
        //Agregar valores
        edades.put("Eyder",18);
        edades.put("Cristina",20);
        edades.put("Luis",21);
        
        //Imprimir el mapa
        System.out.println("Mapa ordenado : " + edades);
        
        //Obtener un valor especifico
        System.out.println("Edad de Eyder : " + edades.get("Eyder"));
        
        //Eliminar un valor
        edades.remove("Eyder");
        System.out.println("TreeMap después de eliinar a Eyder : " + edades);
    }
}
