
package Servicio;

import Consultor.Consulta;
import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 *
 * @author denis
 */
public class AlumnoServicio {
    protected ArrayList<Alumno> Alumnos = new ArrayList<>();
    Scanner leer = new Scanner(System.in);
    Consulta con = new Consulta();
    
    private void crearAlumnos(){
        boolean on = true;
        while(on){
        System.out.println("Ingrese el Nombre del Alumno");
        Alumno x = new Alumno(leer.next());
        ingresarNotas(x);
        Alumnos.add(x);
        on = con.deseaIngresar("alumno");
        }
    }
    
    
    private void ingresarNotas(Alumno x){
        System.out.println("Ingrese la primer Notas del Alumno " + x.getNombre());
        ArrayList<Integer> notas = new ArrayList();
        notas.add(leer.nextInt());
        System.out.println("Ingrese la Segunda Notas del Alumno " + x.getNombre());
        notas.add(leer.nextInt());
        System.out.println("Ingrese la Tercer Notas del Alumno " + x.getNombre());
        notas.add(leer.nextInt());
        x.setNotas(notas);
        x.toString();
    }
    
    
   
    private Integer notaFinal(String x){
        Integer notaFinal = 0 ;
        
        for (int i = 0; i < Alumnos.size(); i++) {
            Alumno s = Alumnos.get(i);
            System.out.println("x:"+ x + " s.getNombre():"+ s.getNombre());
            if (x.equalsIgnoreCase(s.getNombre())) {
                Integer sumaNotas = 0 ;
                for (int j = 0; j < s.getNotas().size() ; j++) {
                    sumaNotas = sumaNotas + s.getNotas().get(j);
                }
                notaFinal = (sumaNotas/3);
                System.out.println("suma De Notas = "+ sumaNotas);
                Alumnos.get(i).setPromedio(notaFinal);
                System.out.println("notaFinal dentro el Bucle for "+ notaFinal);
                s.setPromedio(notaFinal);
                return notaFinal;
            }
        }
        return notaFinal;
        
    }
    
    private void buscarAlumno(){
        System.out.println("Desea saber la nota final de algun Alumno en Especifico?");
        Integer notaFinal = notaFinal(leer.next());
        System.out.println("notaFinal :"+ notaFinal);
        if(notaFinal <= 0){
            System.out.println("No se Encontro A Este Alumno, porfavor Intente Denuevo");
        }else{
            System.out.println("La nota final del Alumno es "+ notaFinal);
        }
        
    }
    
    private void mostrarAlumnos(){
        Alumnos.forEach((alumno) -> System.out.println(alumno.toString()));
    }
   
    
    public void menu(){
        boolean on  = true;
        System.out.println("______ BIENVENIDO AL EJERCICIO 3");
        while(on){
            crearAlumnos();
            mostrarAlumnos();
            buscarAlumno();
            mostrarAlumnos();
            System.out.println("PRESIONE 9 PARA SALIR, sino presione cualquier tecla");
            con.apagar(leer.nextInt());
        }
    }
   
    
    
    
}

    
    
    
    
    
    
    
    
    
    
    
    
    



