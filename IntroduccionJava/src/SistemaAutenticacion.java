import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");
        Scanner consola = new Scanner(System.in);
        final var USUARIO = "admin";
        final var PASSWORD = "123";

        System.out.print("¿Cuál es tu usuario? ");
        var user = consola.nextLine().strip().toLowerCase();

        System.out.print("¿Cuál es tu contraseña? ");
        var pass = consola.nextLine();

       /* boolean datos = user.equals(USUARIO) && pass == PASSWORD ? true : false;
        System.out.println("¿Los datos son correctos? " + datos);]*/

        var mensajeAutenticacion = switch (user){
            case USUARIO -> {
                if (PASSWORD.equals(pass))
                    yield "¡Bienvenido al Sistema!";
                else
                    yield "¡Password incorrecto, favor de corregirlo!";
            }
            default -> {
                if (PASSWORD.equals(pass))
                    yield "¡Usuario incorrecto, favor de corregirlo!";
                else
                    yield "¡Usuario y Password incorrecto, favor de corregirlos!";
            }
        };

        System.out.println(mensajeAutenticacion);
    }

}
