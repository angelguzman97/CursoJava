import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
      /*  //Arreglos
        var enteros = new int[]{100,200,300,400,500};
        //Iterar los elementos de arreglo
        for (var i = 0; i < enteros.length; i++){
            System.out.println("Valor del índice: "+i+" = "+enteros[i]);
        }]*/
        IntroducirValores();


    }

    public static void IntroducirValores(){
        //Introducir valores a un arreglo
    var consola = new Scanner(System.in);
    //Declarar el arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        //Creamos de manera dinámica el arreglo
        var enteros = new int[largoArreglo];
        //Solicitar los valores del arreglo
        for (var i = 0; i < largoArreglo; i++){
            System.out.print("Proporcione enteros ["+i+"] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        //Imprimir los valores del arreglo
        System.out.println("\nImpresión del Arreglo: ");
        for (var i = 0; i < largoArreglo; i++)
            System.out.println("Enteros ["+i+"] = "+ enteros[i]);
    }


}

