import java.util.Scanner;

public class IdentificaEstacionAnio {
    public static void main(String[] args) {
        System.out.println("*** Identifica la Estación del Año ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa el número del mes: ");
        var mesEstacion = Integer.parseInt(consola.nextLine());

      /*  if (mesEstacion == 1 || mesEstacion == 2 || mesEstacion == 12)
            System.out.print("Es invierno");
        else if (mesEstacion == 3 || mesEstacion == 4 || mesEstacion == 5)
            System.out.print("Es Primavera");
        else if (mesEstacion == 6 || mesEstacion == 7 || mesEstacion == 8)
            System.out.print("Es Verano");
        else if (mesEstacion == 9 || mesEstacion == 10 || mesEstacion == 11)
            System.out.print("Es Otoño");
        else
            System.out.print("Estación desconocida");*/

        var estacionNum = mesEstacion <= 12 && mesEstacion >1 ? true : false;

        var invierno = (mesEstacion == 1 || mesEstacion == 2 || mesEstacion == 12);
        var primavera = (mesEstacion == 3 || mesEstacion == 4 || mesEstacion == 5);
        var verano = (mesEstacion == 6 || mesEstacion == 7 || mesEstacion == 8);
        var otonio = (mesEstacion == 9 || mesEstacion == 10 || mesEstacion == 11);

        var estacion = invierno == estacionNum ? "Invierno":
                primavera == estacionNum ? "Primavera":
                        verano == estacionNum ? "Verano":
                                otonio == estacionNum ? "Otoño" : "Estación desconocida";

        System.out.println("Estación = " + estacion);
    }
}
