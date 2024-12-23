public class CicloDoWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo Do-While ***");
        var contador = 1;

     /*   do {
            System.out.print(contador + " ");
            contador++;
        }while (contador <= 3);

        //Numeros inversos
        System.out.println("*** Números inversos ***");

        do {
            System.out.print(contador-- + " ");
        }while (contador > 0);
*/

        //Numeros impares
        System.out.println("*** Números impares ***");
        do {
            if (contador % 2 != 0)
                System.out.print(contador + " ");
            contador++;

        }while (contador <= 20);
    }
}
