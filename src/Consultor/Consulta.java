/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultor;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class Consulta {
    Scanner leer = new Scanner(System.in);
    
    public Consulta() {
    }
    public boolean deseaIngresar(String elemento){
        System.out.println("Desea Ingresar otro "+elemento+ "Y/N");
        String respuesta = leer.next();
        if(respuesta.equalsIgnoreCase("N")){
            return false;
        }else if(respuesta.equalsIgnoreCase("Y")){
            return true;
        }else{
            System.out.println("Letra Ingresada es Incorrecta");
            return false;
        }
         
    }
    
}
