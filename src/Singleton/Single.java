/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import Consultor.Consulta;
import Entidad.Raza;
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
    
    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new Single();
            Entidades = new ArrayList<>();
            leer = new Scanner(System.in);
        }
    }
     public static Single getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }  
     
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
     
     private void ejercicio1Y2(){
         agregarRazas();
         mostrarPerros();
         eliminarPerro();
         mostrarPerros();
     }
     
     
     public void EjerciciosEgg(){
         boolean on = true;
         System.out.println("-------- BIENVENIDO A EJERCICIOS EGG GUIA 10 COLLECTIONS----------");
         System.out.println("Ingrese cual de los siguientes Ejercicio Ejecutar");
         while(on){
             mostrarMenu();
         int opcion = leer.nextInt();
         switch(opcion){
             case 1 : System.out.println("EJECUTANDO EJERCICIO 1 y 2 ");
             ejercicio1Y2();
             break;
             case 2 : System.out.println("EJECUTANDO EJERCICIO 3");
             break;
             case 3 : System.out.println("EJECUTANDO EJERCICIO 4");
             break;
             case 4 : System.out.println("EJECUTANDO EJERCICIO 5");
             break;
             case 5 : System.out.println("EJECUTANDO EJERCICIO 6");
             break;
             case 6 : System.out.println("SALIENDO");
             on = false;
             break;
             default: System.out.println("Opcion ingresada es Incorrecta");
             
         
         }
         }
     }
    
     private void mostrarMenu(){
         System.out.println(" 1. Ejercicio 1 y 2 \n 2. Ejercicio 3 \n 3. Ejercicio 4 \n 4. Ejercicio 5 \n 5. Ejercicio 6 \n 6. Salir ");
     }
     
     
     
    
}
