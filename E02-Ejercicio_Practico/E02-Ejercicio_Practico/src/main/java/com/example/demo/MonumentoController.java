package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/monumento"})
public class MonumentoController {
    private final MonumentoRepository repository;



    /*Busca todos los monumentos que se encuentren en el repositorio y los devuelve*/
    @GetMapping({"/"})
    public List<Monumento> findAll() {
        return this.repository.findAll();

    }
    /*Busca un monumento por su id y lo devuelve y si no lo encuentra lo devuelve vacio*/
    @GetMapping({"/{id}"})
    public Monumento findOne(@PathVariable("id") Long id) {
        return (Monumento)this.repository.findById(id).orElse(null);

    }

    /*Crea un nuevo monumento y si es creado devuelve el valor 201 (código de respuesta de estado de éxito creado)*/
    @PostMapping({"/"})
    public ResponseEntity<Monumento> create(@RequestBody Monumento monumento) {
        return ResponseEntity.status(HttpStatus.CREATED).body((Monumento)this.repository.save(monumento));
        /*
        return ResponseEntity.status(201).body((Monumento)this.repository.save(monumento));
        */
    }


    /*Busca un monumento por su id para modificarlo, cambia sus datos y lo devuelve cambiado */
    @PutMapping({"/{id}"})
    public Monumento edit(@RequestBody Monumento monumento, @PathVariable Long id) {
        /*
        return ResponseEntity.of(
        repository.findById(id).map(m -> {
            m.setCodigoPais(monumento.getCodigoPais());
            m.setNombrePais(monumento.getNombrePais());
            m.setNombreCiudad(monumento.getNombreCiudad());

            ...

        });
        repository.save(monumento);
            return monumento;);
        */


        Monumento antiguo = (Monumento)this.repository.findById(id).orElse(monumento);
        antiguo.setNombrePais(monumento.getNombrePais());
        antiguo.setCodigoPais(monumento.getCodigoPais());
        antiguo.setNombreCiudad(monumento.getNombreCiudad());
        antiguo.setDescripcion(monumento.getDescripcion());
        antiguo.setLocalizacion(monumento.getLocalizacion());
        antiguo.setUrl(monumento.getUrl());
        antiguo.setNombreMonumento(monumento.getNombreMonumento());
        return (Monumento)this.repository.save(antiguo);
    }

    /*Borrado de un objeto de un repositorio por id*/
    @DeleteMapping({"/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        this.repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    public MonumentoController(final MonumentoRepository repository) {
        this.repository = repository;
    }
}
