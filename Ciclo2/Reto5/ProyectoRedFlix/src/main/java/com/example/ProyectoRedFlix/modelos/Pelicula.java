/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProyectoRedFlix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author earm5
 */
@Entity
@Table(name = "pelicula")
public class Pelicula {
    @Id
    //@GeneratedValue
    @Column(name="id_Pelicula")
    private int idpelicula;
    
    @Column(name="titulo")
    private String titulo;
    
    @Column(name="resumen")
    private String resumen;
    
    @Column(name="anio")
    private int anio;
    
    @Column(name="director")
    private String director;

    public int getId_pelicula() {
        return idpelicula;
    }
    
    public void setId_pelicula(int idPelicula) {
        this.idpelicula = idPelicula;
    }

    /*public void setIdpelicula(int idpelicula) {
        this.idpelicula = idpelicula;
    }*/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
}
