/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author denis
 */
public class CatalogoServicio {
    private static ArrayList<Pelicula> peliculas = new ArrayList();
    private static int contador = 0 ;
    
    // el admin lo usa para Ingresar las Peliculas al Catalogo
    public void ingresarPeli(Pelicula x){
        peliculaPreCargadas();
       boolean registrado = peliculas.add(x);
       
//       for (Pelicula pelicula : peliculas) {
//            System.out.println(pelicula.toString());
//        }
        if(registrado){
            contador += 1;
            System.out.println("Ingresado al Catologo con Exito");
        }else{
            System.out.println("Error al Ingresar la pelicula al Catologo");
        }
    }
    
    
    // DEVOLVER ARRAYLIST CON LA LISTA ORDENADA DE LA FORMA QUE LO PIDIO EL CLIENTE
    public ArrayList<Pelicula> peliculaOrdenadaPorTitulo(){
        
        Collections.sort(peliculas, Pelicula.ordenPorTitulo);
        System.out.println("\n Peliculas Ordenadas por Titulo:");
        return peliculas;
    
    }
    public ArrayList<Pelicula> peliculasDuracionPorCortaAMayor(){
        Collections.sort(peliculas, Pelicula.ordenPorHoramenorAMayor);
        System.out.println("\n Peliculas Ordenadas por Menor a Mayor Duracion:");
        return peliculas;
    
    }
    public ArrayList<Pelicula> peliculaOrdenadaPorDuracion(){
        Collections.sort(peliculas, Pelicula.ordenPorHora);
        System.out.println("\n Peliculas Ordenadas por Duracion:");
        return peliculas;
    
    }
    
    public ArrayList<Pelicula> peliculaOrdenadaPorAutor(){
        Collections.sort(peliculas, Pelicula.ordenPorAutor);
        System.out.println("\n Peliculas Ordenadas por Autor:");
        return peliculas;
    }
//    public void ordenarTitulo(ArrayList<Pelicula> peliculas) {
//        Collections.sort(peliculas, Comparadores.ordenPorTitulo);
//        System.out.println("\n   PELÍCULAS ORDENADAS POR TÍTULO:");
//        verPeliculas(peliculas); 
  //  }
    
    
    // @test
    public void peliculaPreCargadas(){
        peliculas.add(new Pelicula("Piratas del Caribe","Sanderson",Duration.ofHours(1).plusMinutes(30)));
        peliculas.add(new Pelicula("Nemo","Bolivar",Duration.ofHours(0).plusMinutes(30)));
        peliculas.add(new Pelicula("Los Simpsons","Brandon",Duration.ofHours(2).plusMinutes(30)));
        peliculas.add(new Pelicula("Hierro","BradPitt",Duration.ofHours(1).plusMinutes(50)));
        peliculas.add(new Pelicula("Mayor","Ciruja",Duration.ofHours(1).plusMinutes(0)));
        
    }
    
    
    
}
