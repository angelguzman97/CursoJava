import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        System.out.println("*** Matríz Diagonal ***");
        var consola = new Scanner(System.in);
        int renglon = 3, columna = 3, sumaDiagonal=0;
        //Pedir renglones y columnas
      /*  System.out.print("Proporciona los renglones: ");
        renglon = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        columna = Integer.parseInt(consola.nextLine());*/

        //Definir la matriz
        var matriz = new int[][]{
                {100,200,300},
                {400,500,600},
                {700,800,900}
        };

        //Pedir los datos
     /*   for (var ren = 0; ren < renglon; ren++){
            for (var col = 0; col < columna; col++){
               System.out.println("Matriz ["+ren+"]["+col+"] = "+matriz [ren][col]);
               // matriz [ren][col]= Integer.parseInt(consola.nextLine());
            }
        }

      */
        //Iterar y sumar los valores de la diagonal de la matriz
        for (var ren = 0; ren < matriz.length; ren++){
            for (var col = 0; col < matriz[ren].length; col++){
                if (col==ren){
                   System.out.println("Matriz ["+ren+"]["+col+"] = "+matriz[ren][col]);
                    sumaDiagonal += matriz[ren][col];
                    }
            }
        }
        System.out.print("Suma = "+sumaDiagonal);
    }
}
