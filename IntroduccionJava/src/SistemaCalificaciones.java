import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese la calificacón: ");
        var calificacion = Double.parseDouble(consola.nextLine());
        var nota = "";

    /* var nota =   switch (calificacion){
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            case 0,1,2,3,4,5 -> "F";
            default ->  "Valor desconocido";
        };
        System.out.println("Su nota es: "+ nota);*/

        if (calificacion >= 9 && calificacion < 10 )
            nota = "A";
        else if (calificacion >= 8 && calificacion < 9)
            nota = "B";
        else if (calificacion >= 7 && calificacion < 8)
            nota = "C";
        else if (calificacion >= 6 && calificacion < 7)
            nota = "D";
        else if (calificacion >= 0 && calificacion < 6)
            nota = "F";
        else
            nota = "Valor desconocido";

        System.out.println("La calificación de "+calificacion + " " +
                "corresponde a una "+ nota);


    }
}
