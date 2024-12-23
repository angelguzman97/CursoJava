import java.util.Scanner;

public class FuncionPar {

    static boolean esPar(int numero){
        return (numero % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.print("Proporciona un valor númerico: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("¿Número par? "+esPar(numero));
    }
}
