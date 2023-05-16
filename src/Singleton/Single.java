/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import Consultor.Consulta;
import Entidad.Raza;
import Servicio.AlumnoServicio;
import Servicio.CineServicio;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;

import java.util.Scanner;


/**Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 *
 * @author denis
 */
public class Single {
    private static  Single INSTANCE = null ;
    private static ArrayList<Raza> Entidades;
    private static Scanner leer ;
    

    // El constructor privado no permite que se genere un constructor por defecto.
    // (con mismo modificador de acceso que la definición de la clase) 
    private Single() {}
    //CREA UNA INSTANCIA DE PUNTO UNICO DE ACCESO A LOS EJERCICIOS
    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new Single();
            Entidades = new ArrayList<>();
            leer = new Scanner(System.in).useDelimiter("\n");
        }
    }
    
     public static Single getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }  
     
     
     // EJERCICIO 1 "REGISTRO DE RAZAS"
    private void mostrarPerros(){
        System.out.println("___ MOSTRAR RAZAS____");
        Entidades.forEach((e) ->{ System.out.println(e.toString());} );
    }
     
    
     private void agregarRazas(){
         Consulta consultor = new Consulta();
         boolean repetir = true;
         do{
         System.out.println("Ingrese una Raza");
         String raza = leer.next();
         Entidades.add(new Raza(raza));
             repetir = consultor.deseaIngresar("Raza");
             
         }while(repetir);
         
         
     }
     
     //al usuario se le pedirá un perro y se recorrerá la lista con un Iterator
     private void eliminarPerro(){
         System.out.println("Ingrese el perro que quiere eliminar");
         String raza = leer.next();
         for (int i = 0; i < Entidades.size(); i++) {
             Raza ItRaza = Entidades.get(i);
             if(ItRaza.getRaza().equalsIgnoreCase(raza)){
                 Entidades.remove(i);
                 System.out.println("Perro removido con Exito");
             }
         }
         
         
     }
     //EJERCICIO 1 EN SINGLETRON
     private void ejercicio1Y2(){
         agregarRazas();
         mostrarPerros();
         eliminarPerro();
         Entidades.sort(Raza.compararRaza);
         mostrarPerros();
         limpiarPantalla();
     }
    
     private void ejercicio3(){
         AlumnoServicio ej3 = new AlumnoServicio();
         ej3.menu();
         limpiarPantalla();
     }
     
     private void ejercicio4() throws ParseException{
         CineServicio cine = new CineServicio();
         cine.IniciarCine();
     }
     
     
     public void EjerciciosEgg() throws ParseException{
         boolean on = true;
         
         while(on){
            System.out.println("-------- BIENVENIDO A EJERCICIOS EGG GUIA 10 COLLECTIONS----------");
            System.out.println("-----------SELECCIONE UNO DE LOS SIGUIENTES EJERCICIOS------------ ");
             mostrarMenu();
         int opcion = leer.nextInt();
        
         switch(opcion){
             
             case 1 : System.out.println("INICIANDO EJERCICIO 1 'REGISTRO DE RAZAS'");
             ejercicio1Y2();
             break;
             case 2 : System.out.println("INICIANDO EJERCICIO 3 'REGISTRO DE ALUMNOS'");
             ejercicio3();
             break;
             case 3 : System.out.println("INICIANDO EJERCICIO 4 'CINE'");
             ejercicio4();
             break;
             case 4 : System.out.println("INICIANDO EJERCICIO 5");
             break;
             case 5 : System.out.println("INICIANDO EJERCICIO 6");
             break;
             case 6 : System.out.println("SALIENDO");
             on = false;
             break;
             default: System.out.println("Opcion ingresada es Incorrecta");
             
         
         }
         }
     }
    
     private void mostrarMenu(){
         System.out.println(" 1. Ejercicio 1 y 2 'Razas' \n 2. Ejercicio 'Registor de Alumnos' \n 3. Ejercicio 'Cine' \n 4. Ejercicio 5 \n 5. Ejercicio 6 \n 6. Salir ");
     }
     
     public static void limpiarPantalla() {
        try {
            System.out.print("\n Presiona ENTER para continuar... ");
            new java.util.Scanner(System.in).nextLine();
            Robot pressbot = new Robot();
            pressbot.keyPress(KeyEvent.VK_CONTROL);
            pressbot.keyPress(KeyEvent.VK_L);
            pressbot.keyRelease(KeyEvent.VK_CONTROL);
            pressbot.keyRelease(KeyEvent.VK_R);
            pressbot.delay(10);
        } catch (AWTException ex) {
            System.out.print("" + ex.getMessage());
        }
    }
     
    
}
