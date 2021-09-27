package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private Long CodigoPais;
    private String NombrePais;
    private String NombreCiudad;
    private String Localizacion;
    private String NombreMonumento;
    private @Lob /*@Lob hace que el striing sea mas grande*/ String Descripcion;
    private String URL;

    public Task(Long codigoPais, String nombrePais, String nombreCiudad, String localizacion, String nombreMonumento, String descripcion, String URL) {
        CodigoPais = codigoPais;
        NombrePais = nombrePais;
        NombreCiudad = nombreCiudad;
        Localizacion = localizacion;
        NombreMonumento = nombreMonumento;
        Descripcion = descripcion;
        this.URL = URL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigoPais() {
        return CodigoPais;
    }

    public void setCodigoPais(Long codigoPais) {
        CodigoPais = codigoPais;
    }

    public String getNombrePais() {
        return NombrePais;
    }

    public void setNombrePais(String nombrePais) {
        NombrePais = nombrePais;
    }

    public String getNombreCiudad() {
        return NombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        NombreCiudad = nombreCiudad;
    }

    public String getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(String localizacion) {
        Localizacion = localizacion;
    }

    public String getNombreMonumento() {
        return NombreMonumento;
    }

    public void setNombreMonumento(String nombreMonumento) {
        NombreMonumento = nombreMonumento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (id != null ? !id.equals(task.id) : task.id != null) return false;
        if (CodigoPais != null ? !CodigoPais.equals(task.CodigoPais) : task.CodigoPais != null) return false;
        if (NombrePais != null ? !NombrePais.equals(task.NombrePais) : task.NombrePais != null) return false;
        if (NombreCiudad != null ? !NombreCiudad.equals(task.NombreCiudad) : task.NombreCiudad != null) return false;
        if (Localizacion != null ? !Localizacion.equals(task.Localizacion) : task.Localizacion != null) return false;
        if (NombreMonumento != null ? !NombreMonumento.equals(task.NombreMonumento) : task.NombreMonumento != null)
            return false;
        if (Descripcion != null ? !Descripcion.equals(task.Descripcion) : task.Descripcion != null) return false;
        return URL != null ? URL.equals(task.URL) : task.URL == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (CodigoPais != null ? CodigoPais.hashCode() : 0);
        result = 31 * result + (NombrePais != null ? NombrePais.hashCode() : 0);
        result = 31 * result + (NombreCiudad != null ? NombreCiudad.hashCode() : 0);
        result = 31 * result + (Localizacion != null ? Localizacion.hashCode() : 0);
        result = 31 * result + (NombreMonumento != null ? NombreMonumento.hashCode() : 0);
        result = 31 * result + (Descripcion != null ? Descripcion.hashCode() : 0);
        result = 31 * result + (URL != null ? URL.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", CodigoPais=" + CodigoPais +
                ", NombrePais='" + NombrePais + '\'' +
                ", NombreCiudad='" + NombreCiudad + '\'' +
                ", Localizacion='" + Localizacion + '\'' +
                ", NombreMonumento='" + NombreMonumento + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }

    public Task() {
    }

    public Task(Long id, Long codigoPais, String nombrePais, String nombreCiudad, String localizacion, String nombreMonumento, String descripcion, String URL) {
        this.id = id;
        CodigoPais = codigoPais;
        NombrePais = nombrePais;
        NombreCiudad = nombreCiudad;
        Localizacion = localizacion;
        NombreMonumento = nombreMonumento;
        Descripcion = descripcion;
        this.URL = URL;
    }
}
