/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Consultor.Consulta;
import Entidad.Cliente;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ClienteServicio {
    Consulta con = new Consulta();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CatalogoServicio catalogo = new CatalogoServicio();
    
    public void verCatalogo(){
        Cliente yo = new Cliente();
        boolean repetir = true;
        do{
            con.menuGenerico6("CLIENTE", "TODAS LAS PELICULAS", "PELICULAS MAYOR A UNA HORA", "PELICULAS DE MENOR A MAYOR DURACION", "PELICULAS DE MAYOR A MENOR", "MOSTRAR PELICULAS POR TITULO ALFABETICAMENTE", "MOSTRAR PELICULA POR AUTOR ALFABETICAMENTE");
            int respuesta = leer.nextInt();
            switch(respuesta){
                case 1 : peliculaOrdenada();
                break;
                case 2 : peliculasLargaDuracion();
                break;
                case 3 : peliculasCortaDuracion();
                break;
                case 4 : peliculaOrdenadaPorDuracion();
                break;
                case 5 : peliculaOrdenadaPorTitulo();
                break;
                case 6 : peliculaOrdenadaPorAutor();
                break;
                case 7 : repetir = false;
                default : 
                    System.out.println("Opcion ingresada es Incorrecta , try Again");
            }
        }while(repetir);
        
    
    }
    
    
    public void peliculaOrdenada(){
       ArrayList<Pelicula> orden = catalogo.peliculaOrdenada();
       orden.forEach((peli) -> System.out.println(peli.toString()));
    }
    public void peliculasLargaDuracion(){
        ArrayList<Pelicula> DuracionmenoraHora;
    
    }
    public void  peliculasCortaDuracion(){
        
    
    }
    public void peliculaOrdenadaPorDuracion(){
        
    
    }
    public void peliculaOrdenadaPorTitulo(){
        
    
    }
    public void peliculaOrdenadaPorAutor(){
        
    
    }
    
    
    
}
