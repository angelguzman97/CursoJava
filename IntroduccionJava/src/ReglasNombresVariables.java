public class ReglasNombresVariables {
    public static void main(String[] args) {
        //Reglas nombres variables}
        String nombreCompleto = "Angel Guzmán"; //Correcto. y aplica las buenas prácticas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Angel Guzmán 2"; //Correcto, no aplica las buenas prácticas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Angel Guzmán"; //Incorrecto
        String nombre_cliente = "Angel Guzmán"; //Correcto, no aplica las buenas prácticas
        System.out.println("nombre_cliente = " + nombre_cliente);
        String _apellido = "Guzmán"; //Correcto y aceptable
        System.out.println("_apellido = " + _apellido);
        String $apellido = "García"; //Correcto y aceptable
        System.out.println("$apellido = " + $apellido);
        int totPzs = 10; //Correcto, no aplica las buenas prácticas.
        int totalPizas = 10; //Correcto, aplica las buenas prácticas
        boolean casado = true; //Correcto, aún puede mejorar
        boolean esCasado = true; //Correcto. y aplica las buenas prácticas
        boolean isCasado = true; //Correcto. y aplica las buenas prácticas *
        boolean tieneSaldo = true; //Correcto. y aplica las buenas prácticas
        boolean hasSaldo = true; //Correcto. y aplica las buenas prácticas *

    }
}
