import java.util.Scanner;

public class EstacionAnioSwitch {
    public static void main(String[] args) {
        System.out.println("*** Identifica la Estación del Año ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa el número del mes: ");
        var mesEstacion = Integer.parseInt(consola.nextLine());

        switch (mesEstacion){
            case 1, 2, 12 -> System.out.print("Invierno");
            case 3, 4, 5 -> System.out.print("Primavera");
            case 6, 7, 8 -> System.out.print("Verano");
            case  9, 10, 11 -> System.out.print("Otoño");
            default -> System.out.print("Estación desconocida");
        }
    }
}
