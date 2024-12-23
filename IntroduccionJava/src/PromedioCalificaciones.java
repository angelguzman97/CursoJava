import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String arg[]){
        System.out.println("*** Promedio de Calificaciones ***");
        //Declarar las variable de consola para pedir datos
        var consola = new Scanner(System.in);
        //Declarar la variable para calcular el promedio
        double sumaCalificaciones = 0, promedio = 0;
        //Pedir la cantidad de calificaciones
        System.out.print("¿Cuántas calificaciones deseas agregar?: ");
        var cantidadCalificacion = Integer.parseInt(consola.nextLine().strip());

        //Declarar e inicializar el arrays
        var calificacion = new double[cantidadCalificacion];
        //Pedir las calificaciones de cada índice
        for (var i = 0; i < cantidadCalificacion; i++){
            System.out.print("Calificación ["+i+"] = ");
            calificacion[i] = Double.parseDouble(consola.nextLine().strip());
        }
        for (var i = 0; i < cantidadCalificacion; i++){
            sumaCalificaciones+= calificacion[i];
        }
        promedio = sumaCalificaciones/cantidadCalificacion;

        System.out.printf("Promedio de las calificaciones: %.2f", promedio);
    }
}
