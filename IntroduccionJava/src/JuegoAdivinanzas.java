import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var random = new Random();
        var numeroEscondido = random.nextInt(5)+1;
        var intentos = 1;
        JuegoAdivinanzasSolucion();
/*
        System.out.printf("""
        *** Juego de Adivinanzas ***\n
        Adivina el número escondido
        Escribe un número:\s""");
        var numeroJugador = consola.nextInt();

        while (numeroEscondido != numeroJugador) {
            intentos++;

            if (numeroEscondido == numeroJugador){
                System.out.printf("""
                ¡Muchas Felicidades! Lo has logrado.
                El número secreto es: %d
                Números de intentos: %d
                """,numeroEscondido,intentos);
                break;
            }
                    if (intentos <= 3) {
                        var mayorMenor = numeroEscondido < numeroJugador ?
                                "mayor" : "menor";
                        System.out.printf("El número que proporcionaste es " + mayorMenor +
                                "\nVuelve a intentarlo\n" +
                                "Ingresa otro número: " +
                                "");
                        numeroJugador = consola.nextInt();
                    }else {
                        System.out.println("Se agotaron los intentos");
                        break;
                    }
        } */



    }

    public static void JuegoAdivinanzasSolucion(){
        System.out.println("*** Juego de adivinanzas ***");
        var consola = new Scanner(System.in);
        var random = new Random();

        //Generamos un número aleatorio entre 1  50
        var numeroSecreto = random.nextInt(50)+1;
        var intentos = 0;
        var adivinanzas = 0;
        final var INTENTOS_MAXIMOS = 5;

        while (adivinanzas != numeroSecreto && intentos < INTENTOS_MAXIMOS){
            System.out.print("Adivina el número secreto (1-50): ");
            adivinanzas = consola.nextInt();

            //Agregar una ayuda para orientar al jugador
            if (adivinanzas > numeroSecreto)
                System.out.println("El número secreto es mayor");
            else if (adivinanzas < numeroSecreto)
                System.out.println("El número secreto es menor");

            //Incrementamos la variable de intentos
            intentos++;
        }
        //Conclusión del juego
        if (adivinanzas == numeroSecreto){
            System.out.printf("Feliciades," +
                    "adivinaste el número secreto en %d intentos%n", intentos);
        }else {
            System.out.printf("Lo siento, has agotado tus intentos máximos: %d%n", INTENTOS_MAXIMOS);
            System.out.printf("El número secreto era: %d%n", numeroSecreto);
        }

    }
}
