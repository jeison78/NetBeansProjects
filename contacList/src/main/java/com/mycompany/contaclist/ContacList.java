/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contaclist;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dilvi
 */
public class ContacList {

    public static void main(String[] args) {
        //crear un HashMap para almacenar una lista de contactos
        Map<String, String> contacts = new HashMap<>();
        
        //Agregar contactos al Map
        contacts.put("carlos", "+51659078");
        contacts.put("Ana", "+97856325");
        contacts.put("Pedro", "+27559666");
        contacts.put("Yamileth", "+98759663");
        
        //Acceder a un número de telefono mediante el nombre
        String anaphone = contacts.get("Ana");
        
        //Imprimir
        System.out.println("El numero de Ana es : " + anaphone);
        
        //Eliminar un contacto
        contacts.remove("Pedro");
        
        //Mostrar todos los contactos
        System.out.println("Lista de contactos");
        for(Map.Entry<String,String> contact: contacts.entrySet()){
            System.out.println(contact.getKey()+": " + contact.getValue());
        }
        
 
        
        
    }
    
}
