import java.util.Scanner;

public class CalculadoraJava {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        double numero1 = 0, numero2 = 0, resultado;
        var salir = false;

        while (!salir){
            System.out.printf("""
                    *** Calculadora en Java ***
                    Operaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoge una opción:\s""");

            var opcion = consola.nextInt();

            if (opcion >= 1 && opcion <= 4){
                System.out.print("Ingresa el primer número: ");
                numero1 = consola.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                numero2 = consola.nextDouble();
            }

            switch (opcion){
                case 1 -> {
                    resultado = numero1 + numero2;
                    System.out.printf("El resultado de la suma es: %.2f%n%n",resultado);
                }
                case 2 -> {
                    resultado = numero1 - numero2;
                    System.out.printf("El resultado de la resta es: %.2f%n%n",resultado);
                }
                case 3 -> {
                    resultado= numero1 * numero2;
                    System.out.printf("El resultado de la multiplicación es: %.2f%n%n",resultado);
                }
                case 4 -> {
                    if (numero2 == 0) {
                        System.out.println("Error en la división\n");
                    }else{
                        resultado= numero1 / numero2;
                        System.out.printf("El resultado de la suma es: %.2f%n%n",resultado);
                    }
                }
                default -> {
                    if (opcion == 5){
                        System.out.println("Saliendo del programa de Calculadora...\n");
                    salir = true;
                    }else {
                        System.out.println("Opción inválida, selecciona otra opción...\n");
                    }
                }
            }
        }
    }
}
