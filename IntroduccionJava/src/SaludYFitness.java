import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fitness ***");

        //Constantes
        final var METAS_PASOS_DIARIO = 1000;
        final var CALORIAS_POR_PASO = 0.04; //Valor aprox. con kilocalorias

        //Pedimos los valores al usuario
        var consola = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        var nombreUsuario = consola.nextLine();

        System.out.print("¿Cuántos pasos has caminado hoy? ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        //Verificar si el usuario alcanzó la meta de pasos diarios
        var metaAlcanzada = (pasosDiarios >= METAS_PASOS_DIARIO) ? "Sí :)" : "No :(";

        //Calcular calorias quemadas
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        //Mostramos la inf.
        System.out.printf("""
                %nUsuario: %s
                Pasos dados: %d
                Calorías quemadas: %.2f KCal.
                Meta de pasos diarios alcanzada: %s
                -----------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombreUsuario, pasosDiarios, caloriasQuemadas, metaAlcanzada,METAS_PASOS_DIARIO);

    }
}
