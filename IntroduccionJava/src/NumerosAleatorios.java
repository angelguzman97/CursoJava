import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Números Aleatorios ***");
        var random = new Random();

        //Número aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio entre 0 y 9 = " + numeroAleatorio);

        //Número aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio entre 1 y 10 = " + numeroAleatorio );

        //Número aleatorio entre 0.0 y 1.0
        var floatAleatorio = random.nextFloat();
        System.out.println("floatAleatorio = " + floatAleatorio);

        //Simular lanzamiento de un dado
        var dado = random.nextInt(6)+1;
        System.out.println("Resultado de lanzamiendo de un dado = " + dado);
    }
}
