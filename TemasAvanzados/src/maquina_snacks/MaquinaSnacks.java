package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }
    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);
        //Creamos la lista de productos tipo snack
        List<Snack> producto = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnack();//Mostrar inventario de Snacks disponibles

        while (!salir){
            try {
                var opcion = mostrarMenu(consola);
               salir = ejecutarOpciones(opcion,consola,producto);
            }catch (Exception e){
                System.out.println("Ocurrió un error: " + e.getMessage());
            }finally {
                System.out.println();//Imprime un salto de línea con cada iteración
            }
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                Menú:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar nuevo snack
                4. Salir
                Elige una opción:\s""");

        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos){
        var salir = false;
        switch (opcion){
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opción inválida: "+opcion);
        }

        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos){
        System.out.print("¿Qué snack desea comprar? (id): ");
        var idSnack = Integer.parseInt(consola.nextLine());
        //Validar que el snack exista en la lista de snacks
        var snackEncontrado = false;
        for (var snack : Snacks.getSnacks()){
            if (idSnack == snack.getIdSnack()){
                //Agregamos el snack a la lista de productos
                productos.add(snack);
                System.out.println("Ok, Snack agregado: "+snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado){
            System.out.print("ID de snack no encontrado: "+idSnack);
        }
    }

    private static void mostrarTicket(List<Snack> productos){
        var ticket = "*** Ticket de Venta ***";
        var total = 0.0;
        for (var producto : productos){
            ticket += "\n\t- "+producto.getNombre()+" - $"+producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> $"+total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola){
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre,precio));
        System.out.println("Tu snack se ha agregado correctamente");
        Snacks.mostrarSnack();
    }
}
