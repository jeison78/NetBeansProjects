package com.miapp.service;

import com.miapp.model.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dilvi
 */
public class VehiculoService {
    //Instancia única de la clase
    private static VehiculoService instance = null;
    
    //Lista de vehiculos
    private List<Vehiculo> vehiculos = new ArrayList<>();
    
    //Constructor privado para evitar que se instancie desde fuera
    private VehiculoService() {
        //Agregar algunos vehiculos de prueba
        vehiculos.add(new Vehiculo(1, "Toyota", "corolla", 20000));
        vehiculos.add(new Vehiculo(2, "Ford", "Fiesta", 18000));
    }
    
    //Método publico y estatico para obtener la instancia única
    public static VehiculoService getInstance() {
        if (instance == null) {
            instance = new VehiculoService();
        }
        return instance;
    }
    
    public List<Vehiculo> ListarVehiculos() {
        return vehiculos;
    }
}
