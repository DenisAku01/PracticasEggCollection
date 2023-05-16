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
    boolean entrar;
    
    public void verCatalogo(boolean entrada){
        if(entrada){
        Cliente yo = new Cliente();
        boolean repetir = true;
        do{
            con.menuGenerico6("CLIENTE", "TODAS LAS PELICULAS", "PELICULAS MAYOR A UNA HORA", "PELICULAS DE MAYOR A MENOR DURACION", "PELICULAS DE MENOR A MAYOR", "MOSTRAR PELICULAS POR TITULO ALFABETICAMENTE", "MOSTRAR PELICULA POR AUTOR ALFABETICAMENTE");
            int respuesta = leer.nextInt();
            switch(respuesta){
                case 1 : peliculaOrdenadaPorTitulo();
                break;
                case 2 : peliculasLargaDuracion1h();
                break;
                case 3 : peliculasOrdenadaPorCortaAMayor();
                break;
                case 4 : peliculaOrdenadaPorDuracion();
                break;
                case 5 : peliculaOrdenadaPorTitulo();
                break;
                case 6 : peliculaOrdenadaPorAutor();
                break;
                case 7 : repetir = false;
                break;
                default : 
                    System.out.println("Opcion ingresada es Incorrecta , try Again");
            }
        }while(repetir);
        }else{
            System.out.println("Saliendo del ejercicio 4 'cine' ");
        }
    
    }
    
    
    public void peliculaOrdenadaPorTitulo(){
       ArrayList<Pelicula> orden = catalogo.peliculaOrdenadaPorTitulo();
        for (Pelicula pelicula : orden) {
            System.out.println(pelicula.toString());
        }
       
       
    }
    public void peliculasLargaDuracion1h(){
        ArrayList<Pelicula> DuracionmenoraHora;
        ArrayList<Pelicula> cortaAMayor = catalogo.peliculaOrdenadaPorDuracion();
        for (Pelicula pelicula : cortaAMayor) {
            
            if(pelicula.getDuracion().toMinutes()>60){
                System.out.println(pelicula.toString());
            }
        }
    }
    public void  peliculasOrdenadaPorCortaAMayor(){
        ArrayList<Pelicula> cortaAMayor = catalogo.peliculasDuracionPorCortaAMayor();
        for (Pelicula pelicula : cortaAMayor) {
            System.out.println(pelicula.toString());
        }
    
    }
    public void peliculaOrdenadaPorDuracion(){
        ArrayList<Pelicula> ordenDuracion = catalogo.peliculaOrdenadaPorDuracion();
        for (Pelicula pelicula : ordenDuracion) {
            System.out.println(pelicula.toString());
        }
    
    }
    
    public void peliculaOrdenadaPorAutor(){
        ArrayList<Pelicula> ordenAutor = catalogo.peliculaOrdenadaPorAutor();
        for (Pelicula pelicula : ordenAutor) {
            System.out.println(pelicula.toString());
        }
    
    }
    
    
    
}
