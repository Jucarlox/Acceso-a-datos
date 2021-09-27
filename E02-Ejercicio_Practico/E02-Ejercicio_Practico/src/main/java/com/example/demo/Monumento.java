package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@Data
@NoArgsConstructor
public class Monumento {
    @Id
    @GeneratedValue
    private Long id;
    private String CodigoPais;
    private String NombrePais;
    private String NombreCiudad;
    private String Localizacion;
    private String NombreMonumento;
    private @Lob /*@Lob hace que el striing sea mas grande*/ String Descripcion;
    private String url;

    public Monumento(String codigoPais, String nombrePais, String nombreCiudad, String localizacion, String nombreMonumento, String descripcion, String url) {
        CodigoPais = codigoPais;
        NombrePais = nombrePais;
        NombreCiudad = nombreCiudad;
        Localizacion = localizacion;
        NombreMonumento = nombreMonumento;
        Descripcion = descripcion;
        this.url = url;
    }


}
