public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y Continue ***");

        //Ejemplo break, imprimir solo el primer número
        System.out.println("Palabra Break: ");
        for (var numero = 1; numero < 10; numero++){
            if (numero % 2 == 0){
                System.out.print(numero + " ");
                //break;
            }
        }

        //Ejemplo con continue. Imprimir solo números pares, ignorar impares
        System.out.println("\nPalabra Continue: ");
        for (var numero = 1; numero < 10; numero++){
            if (numero % 2 == 1){
                continue;
            }
            System.out.print(numero + " ");
        }
    }
}
