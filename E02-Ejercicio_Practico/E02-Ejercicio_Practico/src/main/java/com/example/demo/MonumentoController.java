package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/monumento"})
public class MonumentoController {
    private final MonumentoRepository repository;

    @GetMapping({"/"})
    public List<Monumento> findAll() {
        return this.repository.findAll();
    }

    @GetMapping({"/{id}"})
    public Monumento findOne(@PathVariable("id") Long id) {
        return (Monumento)this.repository.findById(id).orElse((Monumento)null);
    }

    @PostMapping({"/"})
    public ResponseEntity<Monumento> create(@RequestBody Monumento monumento) {
        return ResponseEntity.status(HttpStatus.CREATED).body((Monumento)this.repository.save(monumento));
        /*
        return ResponseEntity.status(201).body((Monumento)this.repository.save(monumento));
        */
    }

    @PutMapping({"/{id}"})
    public Monumento edit(@RequestBody Monumento monumento, @PathVariable Long id) {
        Monumento antigua = (Monumento)this.repository.findById(id).orElse(monumento);
        antigua.setNombrePais(monumento.getNombrePais());
        antigua.setCodigoPais(monumento.getCodigoPais());
        antigua.setNombreCiudad(monumento.getNombreCiudad());
        antigua.setDescripcion(monumento.getDescripcion());
        antigua.setLocalizacion(monumento.getLocalizacion());
        antigua.setURL(monumento.getURL());
        antigua.setNombreMonumento(monumento.getNombreMonumento());
        return (Monumento)this.repository.save(antigua);
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        this.repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    public MonumentoController(final MonumentoRepository repository) {
        this.repository = repository;
    }
}
