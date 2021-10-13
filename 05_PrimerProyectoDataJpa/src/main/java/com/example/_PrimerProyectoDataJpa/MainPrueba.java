package com.example._PrimerProyectoDataJpa;

import com.example._PrimerProyectoDataJpa.model.Alumno;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainPrueba {

    private final AlumnoRepository repository;
    @PostConstruct

    public void test(){
        Alumno alumno= Alumno.builder()
                .apellidos("Lopez")
                .nombre("Luismi")
                .email("@aaa")
                .build();
        repository.save(alumno);
        repository.findAll().forEach(System.out::println);

    }
}
