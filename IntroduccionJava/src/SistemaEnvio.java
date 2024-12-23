import java.util.Scanner;

public class SistemaEnvio {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");
        var consola = new Scanner(System.in);

        final var NACIONAL = 10.0;
        final var INTERNACIONAL = 20.0;

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();
        System.out.print("Ingresa el peso del paquete (en Kg): ");
        var paquete = Double.parseDouble(consola.nextLine());

        var costo = switch (destino) {
            case "nacional" -> NACIONAL * paquete;
            case "internacional" -> INTERNACIONAL * paquete;
            default -> {
                System.out.println("Destino inválido");
                yield null; //yield es para retornar en el default del switch
            }
        };

        if (costo != null)
        System.out.println("El costo de envío del paquete es: $"+costo);
    }
}
