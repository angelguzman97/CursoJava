public class ArgumentosVariables {
    public static void main(String[] args) {
       // imprimirNumeros(1, 2, 3, 4, 5); //varargs
        variosParametros("Karla", 10, 20, 30);//Colocar primero las cadenas u objetos
    }

    static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: "+nombre);
        //imprimirNumeros(numeros);
    }

    static void imprimirNumeros(int... numeros) {
         for (int i = 0; i < numeros.length; i++) {
             System.out.print(numeros[i] + " ");
         }
    }
}
