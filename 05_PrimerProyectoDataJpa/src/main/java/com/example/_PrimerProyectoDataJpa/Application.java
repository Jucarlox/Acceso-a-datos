package com.example._PrimerProyectoDataJpa;

import com.example._PrimerProyectoDataJpa.model.Alumno;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	/*@Bean
	public CommandLineRunner test(){
		return args -> {
			Alumno alumno= Alumno.builder()
					.apellidos("Lopez")
					.nombre("Luismi")
					.email("@aaa")
					.build();
		};
	}*/
}
