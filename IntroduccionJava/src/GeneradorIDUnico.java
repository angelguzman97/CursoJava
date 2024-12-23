import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        System.out.println("*** Sistema Generador de ID único ***");
        var ramdom = new Random();
        var consola = new Scanner(System.in);

        //Datos de la persona
        System.out.print("¿Cuál es tu nombre?: ");
        var nombre = consola.nextLine();
        System.out.print("¿Cuál es tu apellido?: ");
        var apellido = consola.nextLine();
       System.out.print("¿Cuál es tu fecha de nacimiento (YYYY)?: ");
        var fechaNacimiento = consola.nextLine();

        //Normalizar los valores
        var nombreFormateado = nombre.trim().toUpperCase().substring(0,2);
        var apellidoFormateado = apellido.trim().toUpperCase().substring(0,2);
        var fechaFormateado = fechaNacimiento.substring(2);

        //Generar el valor aleatorio (1 y 9999)
        var numeroAleatorio = ramdom.nextInt(9999)+1;

        //Formato de 4 digitos
        var numeroAleatorioFormato = String.format("%04d",numeroAleatorio);

        var idAleatorio = nombreFormateado + apellidoFormateado + fechaFormateado + numeroAleatorioFormato;
      /*  System.out.println("Hola, "+nombre +".");
        System.out.println("\tTu nuevo número de identificación (ID) generado por el sistema es: ");
        System.out.println("\t" + idAleatorio);
        System.out.println("\t¡Felicidades!");*/

        System.out.printf("""
                %nHola %s,
                \tTu nuevo número de Identificación (ID) generado por el sistema es:
                \t%s
                ¡Felicidades!
                """,nombre, idAleatorio);



    }
}
