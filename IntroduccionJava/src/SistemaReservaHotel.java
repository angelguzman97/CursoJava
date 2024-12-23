import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        //Cuarto sin vista al mar: $150.50 por día
        //Cuato con vista al mar: $190.50 por día
        //Nombre, días de estadía, cuarto con vista al mar?

        final var VISTA_AL_MAR = 190.50;
        final var SIN_VISTA_AL_MAR = 150.50;

        System.out.println("*** Sistema de Reserva de Hotel ***");
        var consola = new Scanner(System.in);

        System.out.print("Nombre del cliente: ");
        var nombre = consola.nextLine();

        System.out.print("Días de estadía: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("¿Con vista al mar (true/false)? ");
        var vistaMar = Boolean.parseBoolean(consola.nextLine());

        var habitacionVistaMar = vistaMar ? "Sí :)" : "No :(";

        var costoTotal = vistaMar ? diasEstadia * VISTA_AL_MAR : diasEstadia * SIN_VISTA_AL_MAR;

        System.out.printf("""
                %n-------- Detalles de la Reservación --------
                Cliente: %s
                Días de estadía: %d
                Costo total: $%.2f
                Habitación con vista al mar: %s
                """,nombre, diasEstadia, costoTotal, habitacionVistaMar);


    }
}
