import java.util.Scanner;

public class SistemaDescuentoVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Descuento VIP ***");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuántos productos compraste hoy?: ");
        var cantidadProducto = Integer.parseInt(consola.nextLine());

        System.out.print("¿Tienes la membresía de la tienda (true/false)?: ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProducto >= NO_PRODUCTOS_DESCUENTO && tienesMembresia;
        System.out.print("¿Tienes acceso al descuento VIP?: " + esElegibleDescuento);

    }
}
