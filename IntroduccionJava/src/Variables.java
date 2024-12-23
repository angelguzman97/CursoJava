public class Variables {
    public static void main(String[] args) {
        //Variables
        int edad = 31;
        double precio = 300.40;
        boolean disponible = true; //true/false
        char genero;
        genero = 'M';

        //Acceder a las variables
        System.out.println(edad);
        //Modificar el valor
        edad = 35;
        System.out.println("Edad: "+edad);
        System.out.println("Precio: "+precio + "\n¿Disponible? " + disponible + "\nGénero: "+ genero);
    }
}
