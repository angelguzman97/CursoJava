import java.util.Scanner;

public class CalculoAreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Cálculo Área y Perímetro de un Rectángulo ***");
        Scanner consola = new Scanner(System.in);
        System.out.print("¿Cuál es la altura? ");
        var altura = consola.nextLine();
        System.out.print("¿Cuál es la base? ");
        var base = consola.nextLine();

        var area = Integer.parseInt(base) * Integer.parseInt(altura);
        System.out.println("area = " + area);

        var perimetro = 2 * (Integer.parseInt(base) + Integer.parseInt(altura));
        System.out.println("perimetro = " + perimetro);
    }
}
