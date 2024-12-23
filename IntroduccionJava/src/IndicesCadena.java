public class IndicesCadena {
    public static void main(String[] args) {
        //Manejo de índices en una cadena
        var cadena1 = "Hola Mundo";
        
        //Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);

        //Recuperar el último caracter
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        
        //Recuperar el 6to caracter
        var sextoCaracter = cadena1.charAt(5);
        System.out.println("sextoCaracter = " + sextoCaracter);
    }
}
