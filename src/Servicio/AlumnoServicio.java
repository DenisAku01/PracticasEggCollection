
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
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
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
        // RECORER ARRAY DE ALUMNOS OBJ
        for (int i = 0; i < Alumnos.size(); i++) {
            //GUARDAR ALUMNO ACTUAL DEL FOR
            Alumno s = Alumnos.get(i);
            // COMPROBAR QUE SON Y QUE ESTOY HACIENDO
            System.out.println("x:"+ x + " s.getNombre():"+ s.getNombre());
            // CONDICIONAL SI LOS NOMBRE SON IGUALES
            if (x.equalsIgnoreCase(s.getNombre())) {
                //SUMA NOTAS
                Integer sumaNotas = 0 ;
                // RECORRER ARRAY DE NOTAS DEL ALUMNO ACTUAL
                for (int j = 0; j < s.getNotas().size() ; j++) {
                    // SUMAR NOTAS DEL ALUMNO ACTUAL
                    sumaNotas = sumaNotas + s.getNotas().get(j);
                }
                //PROMEDIANDO NOTAS
                notaFinal = (sumaNotas/3);
                // MOSTRAR PANTALLA
                System.out.println("suma De Notas = "+ sumaNotas);
                // ACTUALIZAR ALUMNO CON NOTA PROMEDIO OBTENIDA
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
            System.out.println("9. Salir \n1. Repetir ");
            on = con.apagar(leer.nextInt());
        }
    }
   
    
    
    
}

    
    
    
    
    
    
    
    
    
    
    
    
    



