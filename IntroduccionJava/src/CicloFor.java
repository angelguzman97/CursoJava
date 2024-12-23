public class CicloFor {
    public static void main(String[] args) {
        System.out.println("*** Ciclo For ***");

        for (var i = 1; i <= 5; i++){
           // System.out.print(i + " ");
        }

        //Números Pares
        for (var i = 0; i <= 20; i++){
            if (i % 2 == 0)
             System.out.print(i + " ");
        }
    }
}
