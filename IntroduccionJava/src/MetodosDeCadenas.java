public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Método de cadenas
        var cadena1 = "Hola Mundo";

        //Obtener el lardo de una cadena
        var longintud = cadena1.length();
        System.out.println("longintud = " + longintud);
        
        //Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Convertir a mayúsculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //Convertir a minúsculas
        System.out.println("cadena1 = " + cadena1.toLowerCase());

        //Eliminar espacios al inicio y al final
        var cadena2 = " Leo Reyes   ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 = " + cadena2.trim());
    }
}
