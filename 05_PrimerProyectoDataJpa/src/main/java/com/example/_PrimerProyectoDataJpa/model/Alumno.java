package com.example._PrimerProyectoDataJpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data /*geter, setter, EqualsAndHashCode*/
@NoArgsConstructor
@Entity
@Builder
@AllArgsConstructor
public class  Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre, apellidos, email;

    public Alumno(String n, String a, String e) {
        this.nombre = n;
        this.apellidos = a;
        this.email = e;
    }
}
