
package Consultor;

import java.util.Scanner;

/** Clase para Acortar las Consultas de SI O NO EN PANTALLA
 *
 * @author denis
 */
public class Consulta {
    Scanner leer = new Scanner(System.in);
    
    public Consulta() {
    }
    
    // DEVUELVE UN BOOLEANO Y SIRVE PARA SABER SI SEGUIR EJECUTANDO O NO CON UN Y o N
    public boolean deseaIngresar(String elemento){
        System.out.println("Desea Ingresar otro/a "+elemento+ " (Y/N)");
        String respuesta = leer.next();
        if(respuesta.equalsIgnoreCase("N")){
            return false;
        }else if(respuesta.equalsIgnoreCase("Y")){
            return true;
        }else{
            System.out.println("Letra Ingresada es Incorrecta");
            return true;
        }
         
    }
    
    public boolean deseaSeguir(String accion){
        System.out.println("Estas apunto de "+accion+ "Desea Continuar? Y/N");
        String respuesta = leer.next();
        if(respuesta.equalsIgnoreCase("N")){
            return true;
        }else if(respuesta.equalsIgnoreCase("Y")){
            return false;
        }else{
            System.out.println("Letra Ingresada es Incorrecta");
            return false;
        }
    }
    
    
    // DEVUELVE UN FALSE PARA APAGAR LA MAQUINA SI APRETA 9
    public boolean apagar(int valor){
        
        return valor != 9 ;
    }
    
    
    // DIFERENTES MENU PARA MOSTRAR POR PANTALLA 
    public void menuGenerico7(String menuDe,String o1,String o2,String o3,String o4,String o5,String o6, String o7){
        System.out.println("---------- "+menuDe +" MENU -----------");
        System.out.println("1. "+o1+" \n2. "+o2+" \n3. "+o3+" \n4. "+o4+" \n5. "+o5+" \n6. "+o6+" \n7. "+o7+" \n8. Salir ");
    }
    public void menuGenerico6(String menuDe,String o1,String o2,String o3,String o4,String o5,String o6){
        System.out.println("---------- "+menuDe +" MENU -----------");
        System.out.println("1. "+o1+" \n2. "+o2+" \n3. "+o3+" \n4. "+o4+" \n5. "+o5+" \n6. "+o6+" \n7. Salir ");
    }
    public void menuGenerico2(String menuDe,String o1,String o2){
        System.out.println("---------- "+menuDe +" MENU -----------");
        System.out.println("1. "+o1+" \n2. "+o2+" \n3. Salir ");
    }
    
}
