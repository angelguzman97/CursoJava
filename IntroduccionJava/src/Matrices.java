import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        //Definimos una matríz
        //int [][] matriz = new int[2][3];
      /*  final var RENGLONES = 2;
        final var COLUMNAS = 3;
        var matriz = new int [RENGLONES][COLUMNAS];
        //Modifcar valores de la matríz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        //Recorrer una matriz
        //1. Ciclo más externo. Recorrer los renglones
        for (var ren = 0; ren < RENGLONES; ren++){
            //2. Ciclo interno. Recorrer las columnas.
            for (var col = 0; col < COLUMNAS; col++){
                System.out.println("Valor ["+ren+"]["+col+"] = "+matriz[ren][col]);
            }
        }


        var matriz = new int [][]{{100,200,300},{400,500,600}};
        //Recorrer una matriz
        //1. Ciclo más externo. Recorrer los renglones
        for (var ren = 0; ren < matriz.length; ren++) {
            //2. Ciclo interno. Recorrer las columnas.
            for (var col = 0; col < matriz[ren].length; col++) {
                System.out.println("Valor [" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }*/
        matrizDinamicaPorConsola();
    }

    public static void matrizDinamicaPorConsola(){
        //Introducir valores a una matriz
        int renglones, columnas;
        var consola = new Scanner(System.in);
        //Definir la matriz
        System.out.print("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[renglones][columnas];
        //Solicitar los valores
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.print("Valor["+ren+"]["+col+"] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        //Iterar los valores de la matriz
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.println("Matriz["+ren+"]["+col+"] = "+ matriz[ren][col]);
            }
        }
    }
}
