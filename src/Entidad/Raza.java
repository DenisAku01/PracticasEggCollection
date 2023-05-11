/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;

/**Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 *
 * @author denis
 */
public class Raza {
    private String Raza;

    public Raza() {
    }

    public Raza(String Raza) {
        this.Raza = Raza;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "Raza{" + "Raza=" + Raza + '}';
    }
    
    public static Comparator<Raza> compararRaza = (Raza t, Raza t1) -> t.getRaza().compareTo(t1.getRaza());
    
    
}
