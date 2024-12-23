import java.util.Scanner;

public class DibujoTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un triángulo ***");
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el número de filas: ");
        var numeroFilas = consola.nextInt();

        //Iteramos sobre cada fila del triángulo
        for (var fila = 1; fila <= numeroFilas; fila++){
            var espacioBlanco = " ".repeat(numeroFilas - fila);
            var asterisco = "*".repeat(fila+fila-1);//2*fila-1
            System.out.println(espacioBlanco+asterisco);
        }
    }
}
