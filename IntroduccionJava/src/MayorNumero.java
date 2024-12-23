import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {
        System.out.println("*** El Mayor de 2 Números ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        var num1 = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese el segundo número: ");
        var num2 = Integer.parseInt(consola.nextLine());

        var mayor = num1 > num2 ? "El número mayor es " + num1 : "El número mayor es " + num2;

        System.out.println(mayor);
    }
}
