public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de Datos en Java
        //Enteros (Valor por default 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);

        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);

        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);

        long tipoLong = 987654321098765432L; // solo hasta 9 digitos. si es más se coloca una L
        System.out.println("tipoLong = " + tipoLong);

        //Punto flotante (Valor por default 0.0) 
        float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDouble = 3.1315; //También se puede indicar una d o D
        System.out.println("tipoDouble = " + tipoDouble);

        //Primitivos
        //Caracter (Valor por default \u0000)
        char tipoChar = 'A'; //Caracteres dek juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);
        
        //Booleano (Valor por default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);
        
        //Tipos Object (Referencia) -- Valor por default null
        String nombre = null;//Valor por default
        System.out.println("nombre = " + nombre);
        nombre = "Angel Guzmán";
        System.out.println("nombre = " + nombre);
    }
}
