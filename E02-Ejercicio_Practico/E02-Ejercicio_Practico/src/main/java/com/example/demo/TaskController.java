package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/task"})
public class TaskController {
    private final TaskRepository repository;

    @GetMapping({"/"})
    public List<Task> findAll() {
        return this.repository.findAll();
    }

    @GetMapping({"/{id}"})
    public Task findOne(@PathVariable("id") Long id) {
        return (Task)this.repository.findById(id).orElse((Task)null);
    }

    @PostMapping({"/"})
    public ResponseEntity<Task> create(@RequestBody Task task) {
        return ResponseEntity.status(HttpStatus.CREATED).body((Task)this.repository.save(task));
    }

    @PutMapping({"/{id}"})
    public Task edit(@RequestBody Task task, @PathVariable Long id) {
        Task antigua = (Task)this.repository.findById(id).orElse(task);
        antigua.setNombrePais(task.getNombrePais());
        antigua.setCodigoPais(task.getCodigoPais());
        antigua.setNombreCiudad(task.getNombreCiudad());
        antigua.setDescripcion(task.getDescripcion());
        antigua.setLocalizacion(task.getLocalizacion());
        antigua.setURL(task.getURL());
        antigua.setNombreMonumento(task.getNombreMonumento());
        return (Task)this.repository.save(antigua);
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        this.repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    public TaskController(final TaskRepository repository) {
        this.repository = repository;
    }
}
