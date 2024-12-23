public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        //Más formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);

        //Método concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 = " + cadena3);

        //StringBuilder - Constructor de cadena. Es mutable y no crea instancia de cadenas. no hace muchas cadenas.
        var constructorCadenas = new StringBuilder();
      /*  constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);*/
        constructorCadenas.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado StringBuilder = " + resultado);

        //StringBuffer. Es seguro cuando se trabaja con hilos. Varios procesos a la vez
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado StringBuffer = " + resultado);

        //Join. Con lo que se separa y después las cadenas o caracteres
        resultado = String.join(" ", cadena1, cadena2, "Adiós");
        System.out.println("resultado join= " + resultado);



    }
}
