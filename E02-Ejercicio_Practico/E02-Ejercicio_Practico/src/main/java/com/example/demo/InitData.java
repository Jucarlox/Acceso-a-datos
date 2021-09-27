package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class InitData {
    private final MonumentoRepository repository;

    @PostConstruct
    public void init() {
        this.repository.saveAll(Arrays.asList(new Monumento("SP", "España","Sevilla", "52° 31' 28'' N; 13° 24' 38'' E", "Meninas","El cuadro Las meninas representa el ambiente familiar, hogareño e íntimo de la realeza, cuyo centro es el retrato de la Infanta Margarita rodeada de su pequeña corte", "https://www.museodelprado.es/coleccion/obra-de-arte/las-meninas/9fdc7800-9ade-48b0-ab8b-edee94ea877f")));
    }

    public InitData(final MonumentoRepository repository) {
        this.repository = repository;
    }
}
