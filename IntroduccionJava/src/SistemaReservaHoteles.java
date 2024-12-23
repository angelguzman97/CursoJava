public class SistemaReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hoteles ***");
        String nombreCliente = "Angel Guzmán";
        int diasEstancia = 5;
        double tarifaDiaria = 389.99;
        boolean vistaMar= true;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("vistaMar = " + vistaMar);

        //Modificar
        System.out.println();
        //nombreCliente = "Teodoro Muñoz";
        diasEstancia = 3;
        tarifaDiaria = 349.99;
        vistaMar = false;
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("vistaMar = " + vistaMar);
    }
}
