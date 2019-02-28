package com.example.demospringbootrest.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "comentarios")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    private String nombre;
    private String comentario;
    private int atencion;
    private int facilidad;
    private int entorno;
    private int general;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getAtencion() {
        return atencion;
    }

    public void setAtencion(int atencion) {
        this.atencion = atencion;
    }

    public int getFacilidad() {
        return facilidad;
    }

    public void setFacilidad(int facilidad) {
        this.facilidad = facilidad;
    }

    public int getEntorno() {
        return entorno;
    }

    public void setEntorno(int entorno) {
        this.entorno = entorno;
    }

    public int getGeneral() {
        return general;
    }

    public void setGeneral(int general) {
        this.general = general;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    private int estado;
    private LocalDateTime fecha;


}
