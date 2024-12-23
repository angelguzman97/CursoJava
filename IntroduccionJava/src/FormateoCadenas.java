public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Matías";
        var edad = 25;
        var salario = 21000.50;

        //String.format
        //%s - Devuelve el valor de la cadena.
        //%d - Devuelve un valor entero
        //%.2f - Devuelve los decimales
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f",nombre,edad,salario);
        System.out.println("mensaje = " + mensaje);

        //Método printf - resume el String.format y formatea las cadenas
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n",nombre,edad,salario);
    }
}
