public class SentenciaIf {
    public static void main(String[] args) {
        //Use de la sentencia if
        var edad = 16;

     /*   if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }

        //Sentencia if-else
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }*/

        //else-if
        if (edad >= 18){
            System.out.println("Mayor de edad");
        } else if (edad >= 13 && edad < 18) {
            System.out.println("Eres un adolescente");
        }else {
            System.out.println("Eres un niño");
        }


    }
}
