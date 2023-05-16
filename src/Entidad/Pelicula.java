/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.Duration;
import java.util.Comparator;

/**
 *
 * @author denis
 */
public class Pelicula {
    private String pelicula;
    private String autor;
    private Duration duracion;
    //Aqui se agrega el Comparator
    public Pelicula() {
    }

    public Pelicula(String pelicula, String autor, Duration duracion) {
        this.pelicula = pelicula;
        this.autor = autor;
        this.duracion = duracion;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        
        return "+PORTADA\n"+"Pelicula : "+pelicula + "\nAutor : " +autor+"\nDuracion : "+duracion;
    }
    
    public static Comparator<Pelicula> compararTitulo = (Pelicula p1, Pelicula p2) -> p1.getPelicula().compareTo(p2.getPelicula());
    
    public static Comparator<Pelicula> compararAutor = (Pelicula p1, Pelicula p2) -> p1.getAutor().compareTo(p2.getAutor());
    
    
    
}
