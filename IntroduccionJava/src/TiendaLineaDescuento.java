import java.util.Scanner;

public class TiendaLineaDescuento {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Línea de Descuentos ***");

        Scanner consola =  new Scanner(System.in);
        final var DESCUENTO_10 = 10;
        final var DESCUENTO_5 = 5;

        System.out.print("¿Cuál fue el monto de la compra? $");
        var monto = Double.parseDouble(consola.nextLine());
        System.out.print("¿Eres miembro de la tienda (true/false)? ");
        var miembro = Boolean.parseBoolean(consola.nextLine());



        if (monto >= 1000.0 && miembro == true) {
            var montoDescuento = monto * DESCUENTO_10 / 100;
            var montoTotal = monto - montoDescuento;
            System.out.printf("""
                    Felicidades!! Has obtenido un descuento del 10%%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f
                    """,monto,montoDescuento,montoTotal);


        } else if (monto < 1000.0 && miembro == true) {
            var montoDescuento = monto * DESCUENTO_5 / 100;
            var montoTotal = monto - montoDescuento;
            System.out.printf("""
                    Felicidades!! Has obtenido un descuento del 5%%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f
                    """,monto,montoDescuento,montoTotal);

        }else {
            var montoDescuento = monto * 0 / 100;
            var montoTotal = monto - montoDescuento;
            System.out.printf("""
                    No obtuviste ningún tipo de descuento.
                    Te invitamos a hacerte mienbro de la tienda
                    Monto final de la compra: $%.2f
                    """,montoTotal);
        }


    }
}
