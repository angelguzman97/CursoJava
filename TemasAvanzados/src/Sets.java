import java.util.Set;
import java.util.TreeSet;

//Se les conoce como estructuras de datos o conjunto en español.
//No permite elementos duplicados
public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();

        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Víctoria");
        System.out.println("Elementos del Set: ");
        conjunto.forEach(System.out::println);

        //Remover elemento
        conjunto.remove("Karla");
        System.out.println("\nNuevos elementos del Set: ");
        conjunto.forEach(System.out::println);
    }
}
