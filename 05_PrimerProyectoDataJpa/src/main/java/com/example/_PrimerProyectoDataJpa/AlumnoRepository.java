package com.example._PrimerProyectoDataJpa;

import com.example._PrimerProyectoDataJpa.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
