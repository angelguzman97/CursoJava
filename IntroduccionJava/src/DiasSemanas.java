public class DiasSemanas {
    public static void main(String[] args) {
        System.out.println("*** Días de la semana  con Switch ***");

        //case 1 -> System.out.println("Lunes"); Se puede utilizar así.
        // En caso de llevar más líneas de códigos se usan las llaves
        // case 1 ->{
        //            System.out.println("Lunes");
        //            System.out.println("Lunes");
        // }

        var dia = 4; //Suponiendo que 1 es Lunes, 2 martes, etc.

        switch (dia){
            case 1 -> System.out.println("Lunes");

            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día inválido: "+dia);
        }
    }
}
