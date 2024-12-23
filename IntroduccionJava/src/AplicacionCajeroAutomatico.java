import java.util.Scanner;

public class AplicacionCajeroAutomatico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        var saldo = 1000.0;

        while (!salir){
            System.out.print("""
                    *** Aplicación de Cajero Automático ***
                    Operaciones que puedes realizar:
                    1. Consultar saldo.
                    2. Retirar.
                    3. Depositar.
                    4. Salir.
                    Escoge una opción:\s""");

            var opcion = Integer.parseInt(consola.nextLine());
            switch (opcion){
                case 1 -> System.out.printf("Tu saldo es de: $%.2f%n%n",saldo);
                case 2 -> {
                    System.out.printf("Ingrese la cantidad a retirar: $");
                    var retiro = Double.parseDouble(consola.nextLine());

                    if (retiro <= saldo){
                        saldo -= retiro;
                    }else {
                        System.out.println("Saldo insuficiente para realizar el retiro\n");
                    }
                    System.out.printf("Su saldo es de: $%.2f%n%n",saldo);
                }
                case 3 -> {
                    System.out.print("Ingrese la cantidad a depositar: ");
                    var deposito = Double.parseDouble(consola.nextLine());
                    saldo += deposito;
                    System.out.printf("Tu nuevo saldo es: $%.2f%n%n", saldo);
                }
                case 4 ->{
                    System.out.println("Saliendo del sistema. ¡Hasta pronto! :)\n");
                    salir = true;
                }
                default -> {
                    System.out.println("Opción inválida\n");
                }
            }

        }
    }
}
