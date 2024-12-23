public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        var c = true;

        //Operador unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);
        //Operador unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        //Operadores unarios incremento/decremento
        //Pre-incremento
        a = 3;
        resultado = ++a;
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incrmentó= " + a);

        //Post-incremento
        a = 3;
        resultado = a++; //Primero se usa el valor y después se incrementa
        System.out.println("resultado a++= " + resultado);
        System.out.println("a en este momento se incrementa = " + a);

        //Pre-decremento
        b = -2;
        resultado = --b;
        System.out.println("resultado --b = " + resultado);
        System.out.println("b en este momento ya se decrementa= " + b);

        //Post-decremento
        b = -2;
        resultado = b--;
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b en este momento ya se decrementa = " + b);


    }
}
