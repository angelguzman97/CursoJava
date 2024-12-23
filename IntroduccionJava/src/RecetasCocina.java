import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");
        var consola = new Scanner(System.in);

        //Datos de la receta
        System.out.print("Ingrese el nombre: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingrese los ingredientes: ");
        var ingredientes = consola.nextLine();
        System.out.print("Ingrese el tiempo de duración (min): ");
        var tiempo = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese la dificultad (Fácil/Medio/Difícil): ");
        var dificultad = consola.nextLine();

        //Imprimir la receta
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre receta: "+nombreReceta);
        System.out.println("\tIngredientes: "+ingredientes);
        System.out.println("\tTiempo de preparación: "+tiempo+" min.");
        System.out.println("\tDificultad: "+dificultad);




    }
}
