package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaArirmetica {

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmética ***");
        var aritmetica1 = new Aritmetica(5,7);
        System.out.println("Operando 1: "+aritmetica1.getOperando1());
       // aritmetica1.setOperando1(3);
       // aritmetica1.setOperando2(4);
        aritmetica1.sumar();
       // aritmetica1.restar();

        System.out.println("\n");
       // var aritmetica2 = new Aritmetica();
       // aritmetica2.sumar();
    }
}
