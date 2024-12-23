import java.util.HashMap;
import java.util.Map;

//Se compone de Llave, valor. No se permiten duplicados y no tiene orden
public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre","Diego");
        persona.put("apellido","Flores");
        persona.put("edad","31");

        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);
        persona.put("edad","35");//Modificar el valor de la llave existente
        persona.entrySet().forEach(System.out::println);
        persona.remove("apellido");
        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        //Iterar sobre los elementos por separado
        System.out.println("\nIterando los elementos(llave,valor)");
        persona.forEach((llave, valor)-> {
            System.out.println("Llave = " + llave + ",Valor = "+ valor);
        });
    }
}
