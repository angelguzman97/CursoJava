package aritmetica;

public class Aritmetica {
   private int operando1, operando2;

    //Constructor vacío
    public Aritmetica(){
        System.out.println("Estoy en el constructor vacío...");
    }

    //Constructor con parámetros
    public Aritmetica(int operando1, int operando2){
        System.out.println("Estoy en el constructor con parámetros...");
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void sumar(){
        var resultado = operando1+operando2;
        System.out.println("Resultado Suma: " + resultado);
    }
    public void restar(){
        var resultado = operando1-operando2;
        System.out.println("Resultado Resta: " + resultado);
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
