public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //Búsqueda de subcadenas
        //indexOf - Devuelve el índice de la primera aparición de la subcadena
        var cadena1 = "Hola Mundo";
        //Subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        //lastIndexOf - Devuelve el índice de la última aparición de la subcadena
        //Subcadena "Mundo"
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        //Subcadena no encondtrada devuelve -1
        var indice3 = cadena1.lastIndexOf("Java");
        System.out.println("indice3 = " + indice3);
    }
}
