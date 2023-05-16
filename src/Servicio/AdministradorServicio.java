/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Consultor.Consulta;
import Entidad.Administrador;
import Entidad.Pelicula;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author denis
 */
public class AdministradorServicio {
    ArrayList<Administrador> adnis = new ArrayList();
    Consulta consulta = new Consulta();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    // UN UNICO ADMINISTRADOR QUE SERE YO PRECARGADO
    public void activarAdmin() throws ParseException{
        String fechaTexto = "2023/05/12";
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        Date fecha = formato.parse(fechaTexto);
        
        Administrador x = new Administrador(41977439, fecha );
        adnis.add(x);
    }
    
    
    //ACTIVO EL ADMIN Y EJECUTO EL MENU DE OPCIONES PARA INGRESAR PELICULA Y Avanzar
    public void menu() throws ParseException{
        activarAdmin();
        boolean on = true;
        do{
            consulta.menuGenerico2("ADMINISTRADOR", "Cargar Pelicula", "Avanzar Menu");
            switch(leer.nextInt()){
                case 1 : cargarPelicula();
                break;
                case 2 : avanzarMenu();
                    on = false;
                break;
                case 3 :
                    on =false;
                    break;
                default:
                System.out.println("Opcion Ingresada es Incorrecta");
                        
            }
        }while(on);
    }
    
    
    //Sirve para cargar pelicula al Catalogo del Cine
    private void cargarPelicula() {
        CatalogoServicio add = new CatalogoServicio();
        boolean repetir = true;
        do{
        
        System.out.println("Ingrese el Titulo:");
        String t = leer.next();
        System.out.println("Ingrese el Autor");
        String a = leer.next();
        System.out.println("Ingrese Horas de Duracion");
        Integer h = leer.nextInt();
        System.out.println("Ingrese los minutos");
        Integer m = leer.nextInt();
        Duration duracion = Duration.ofHours(h).plusMinutes(m);
        add.ingresarPeli(new Pelicula(t,a,duracion));
        repetir = consulta.deseaIngresar("Pelicula");
        }while(repetir);
    }
    
    // Sirve para avisar que Salimos del Sistema del Admin y entramos a la del Cliente
    private void avanzarMenu(){
        System.out.println("Saliendo del Menu del Administrador Activando Maquina para Cliente");
    }
    
    
    
    
}
