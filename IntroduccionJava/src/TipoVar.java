public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Usa de var en Java ***");
        //Sin el uso de var
        String nombre1 = "Angel";
        System.out.println("nombre1 = " + nombre1);
        //Con el uso de var
        var nombre2 = "Teodoro";
        System.out.println("nombre2 = " + nombre2);
        //Definir otras variables usando var
        var edad = 30; //Se infiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 500.5F; //Se infiere el tipo float
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; //Se infiere el tipo boolean
        esCasado = true;
       // esCasado = "no"; No podemos asignar un tipo distinto


        //Se dede definir su valor
        //var precio; Lanza un error, asignar un valor al inicio
        //precio = 10;

        //Se debe poder inferir el tipo de dato
        //var apellido = null; //No se puede inferir el tipo de datos
    }
}
