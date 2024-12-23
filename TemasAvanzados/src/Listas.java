/*
Una colección representa un grupo de objetos.
Algunas colecciones permiten elementos duplicados
y otras, no. Algunas tienen sus elementos ordenados
y otras, no.
Su paquete es de java.util
Todas heredan de la clase de Collection
ArrayList -- Permite elementos duplicados y respeta el orden
SortedSet, HashMap
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();//Colocar los picoparéntesis para específicar
        // el tipo de datos a almacenar
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");

//        for (String elemento : miLista){
//            System.out.println("Día de la semana: " + elemento);
//        }

        //Función Lambda (Función anónima de un código muy compacto). Programación funcional
        // -- primero va el parametro y después la función
//        miLista.forEach(elemento -> {
//            System.out.println("Elemento: " + elemento);
//        });

        miLista.forEach(System.out::println);//Método de referencia

        List<String> nombre = Arrays.asList("Pedro", "Ivonne", "Nohemi");
        System.out.println("\nLista de nombres: ");
        nombre.forEach(System.out::println);
    }
}
