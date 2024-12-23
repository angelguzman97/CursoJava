import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo While ***");
        var contador = 1;
        while (contador <= 5){
            System.out.print((contador++)+", ");
        }

        //Números Pares
        while (contador <= 20){
            //Revisamos si es un num. par.
            if (contador % 2 == 0)
                System.out.print(contador+" ");
            contador++;
        }

    }
}
