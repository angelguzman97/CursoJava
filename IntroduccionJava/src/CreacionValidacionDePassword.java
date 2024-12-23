import java.util.Scanner;

public class CreacionValidacionDePassword {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var valido = false;
        var password = "";

        System.out.println("*** Validación de Passwprd ***");

        while (!valido){
            System.out.println("Ingresa una contraseña (Debe contener al menos 6 caracteres)");
            System.out.print("Contraseña: ");
            password = consola.nextLine();

            if (password.length() < 6){
                System.out.printf("%nVuelve a intentarlo %n%n");
            }else {
                System.out.printf("%nPassword Válido :)");
                valido = true;
            }
        }

    }
}
