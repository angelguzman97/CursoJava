public class FuncionRecursiva {
    /*
    1.- Es una función que se llama así misma
    2.- Debe avanzar hacia un caso base, de lo contrari cae en un ciclo infinito
     */
    //Imprimir 1 al 5 usando función recursiva
    static void funcionRecursiva(int numero){
        //Caso base
        if (numero == 1)
            System.out.print(numero + " ");
        else{
            //Caso recursivo
        funcionRecursiva(numero - 1);
        System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
