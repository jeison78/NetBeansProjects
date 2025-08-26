package com.example.App_PruebaSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//Define la clase como un controlador REest para manejar las solicitudes HTTP
@RestController
public class AppPruebaSpringBootApplication {

    //Define endpoint HTTP GET que retorner un mensaje
    @GetMapping("/saludo")
    public String Saludo() {
        return "Java NetBeans con SpringBoot";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(AppPruebaSpringBootApplication.class, args);
    }

}
