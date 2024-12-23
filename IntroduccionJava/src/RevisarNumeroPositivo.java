import java.util.Scanner;

public class RevisarNumeroPositivo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese cualquier número ");
        var numero = consola.nextInt();

        if (numero > 0) {
            System.out.println("Es positivo: " + numero);
        } else if (numero < 0) {
            System.out.println("Es negativo: " + numero);
        }else {
            System.out.println("Es cero: " + numero);
        }
    }
}
