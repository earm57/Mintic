package com.example.ProyectoRedFlix;

import Vista.PeliculaVista;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoRedFlixApplication {

public static void main(String[] args) {
		new PeliculaVista().setVisible(true);
	}
    
    public static void ServerSpring(String[] args) {
		SpringApplication.run(ProyectoRedFlixApplication.class, args);
	}

}
