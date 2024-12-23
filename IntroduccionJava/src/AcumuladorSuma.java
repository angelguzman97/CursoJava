public class AcumuladorSuma {
    public static void main(String[] args) {
        System.out.println("*** Acumulador Suma ***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;
        //Iterar los valores
        var numero = 1;
/*
        while (numero <= MAXIMO){
            //Imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) -> "
            + acumuladorSuma + " + " + numero);

            //Realizar la suma acumulativa
            acumuladorSuma += numero++; //acumuladorSuma = acumuladorSuma + numero

            //Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");

        }
        System.out.println("Suma de los primeros " +
                +MAXIMO+ " números = " + acumuladorSuma);


        do {
            //Imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) -> "+
                    acumuladorSuma + " + " + numero);

            //Realizar la suma acumulativa
            acumuladorSuma += numero++;

            //Imprimir la suma parcial acumulada
            System.out.println("La suma parcial acumulada es: " + acumuladorSuma + "\n");

        }while (numero <= MAXIMO);

        System.out.println("Suma de los primeros " +
                +MAXIMO+ " números = " + acumuladorSuma);
                */

        for (;numero <= MAXIMO;numero++){
            //Imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) -> "+
                    acumuladorSuma + " + " + numero);

            //Realizar la suma acumulativa
            acumuladorSuma += numero;

            //Imprimir la suma parcial acumulada
            System.out.println("La suma parcial acumulada es: " + acumuladorSuma + "\n");
        }

        System.out.println("Suma de los primeros " +
                +MAXIMO+ " números = " + acumuladorSuma);

    }
}
