public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparación de Cadenas (Pool de cadenas)

        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //Comparación de cadenas (==) comparan la referencia
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);

        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        //Comparar contenido usaremos el método equals
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1.equals(cadena3));


    }
}
