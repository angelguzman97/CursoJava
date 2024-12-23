package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        try {
            var resultado = Aritmetica.division(2,1);
            System.out.println("resultado = " + resultado);
        }catch (Exception e){
            System.out.println("resultado = " + e);
        }finally {
            System.out.println("Se revisó la división entre 0 ");
        }
    }
}
