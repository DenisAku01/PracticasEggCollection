
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
    public boolean deseaIngresar(String elemento){
        System.out.println("Desea Ingresar otro "+elemento+ "Y/N");
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
    public boolean apagar(int valor){
        
        return valor != 9 ;
    }
}
