/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author denis
 */
public class CatalogoServicio {
    ArrayList<Pelicula> peliculas = new ArrayList();
    
    
    // el admin lo usa para Ingresar las Peliculas al Catalogo
    public void ingresarPeli(Pelicula x){
       boolean registrado = peliculas.add(x);
        if(registrado){
            System.out.println("Ingresado al Catologo con Exito");
        }else{
            System.out.println("Error al Ingresar la pelicula al Catologo");
        }
    }
    
    
    // DEVOLVER ARRAYLIST CON LA LISTA ORDENADA DE LA FORMA QUE LO PIDIO EL CLIENTE
    public ArrayList<Pelicula> peliculaOrdenada(){
        ArrayList<Pelicula> x = new ArrayList();
        peliculas.sort(Pelicula.compararTitulo);
        
        return peliculas;
    
    }
    public ArrayList<Pelicula> peliculasLargaDuracion(){
        return null;
    
    }
    public ArrayList<Pelicula> peliculasCortaDuracion(){
        return null;
    
    }
    public ArrayList<Pelicula> peliculaOrdenadaPorDuracion(){
        return null;
    
    }
    public ArrayList<Pelicula> peliculaOrdenadaPorTitulo(){
        return null;
    
    }
    public ArrayList<Pelicula> peliculaOrdenadaPorAutor(){
        return null;
    
    }
    
}
