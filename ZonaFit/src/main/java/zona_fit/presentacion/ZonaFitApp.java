package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();
    }
    private static void zonaFitApp(){
        var salir = false;
        var consola = new Scanner(System.in);
        // Creamos un objeto de la clase ClienteDAO
        IClienteDAO clienteDao = new ClienteDAO();
        while (!salir){
            try {
               var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(consola, opcion, clienteDao);

            }catch (Exception e){
                System.out.println("Error al ejecutar opciones: " + e.getMessage());
            }
            System.out.println();
        }
    }
    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                *** Zona Fit (GYM) ***
                1. Listar Clientes
                2. Buscar Cliente
                3. Agregar Cliente
                4. Modificar Cliente
                5. Eliminar Cliente
                6. Salir
                Elige una opción:\s""");

        return Integer.parseInt(consola.nextLine());
    }
    private static boolean ejecutarOpciones(Scanner consola, int opcion,
                                            IClienteDAO clienteDAO){
        var salir = false;
        switch (opcion){
            case 1 ->{// 1. Listar Cliente
                System.out.println("--- Listado de clientes ---");
                var clientes = clienteDAO.listarClientes();
                clientes.forEach(System.out::println);

            }
            case 2 ->{//Buscar Cliente por id
                System.out.print("Introduce el id del cliente a buscar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDAO.buscarClientePorId(cliente);
                if(encontrado){
                    System.out.println("Cliente encontrado: " + cliente);
                }else {
                    System.out.println("Cliente no encontrado: " + cliente);
                }
            }
            case 3 -> {//Agregar Cliente
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                //Creamos el objeto cliente (sin el id)
                var cliente = new Cliente(nombre,apellido,membresia);
                var agregado = clienteDAO.agregarCliente(cliente);
                if (agregado){
                    System.out.println("Cliente agregado: " + cliente);
                }else {
                    System.out.println("Error al agregar cliente: " + cliente);
                }

            }
            case 4 -> {//Modificar cliente
                System.out.println("--- Modificar Cliente ---");
                System.out.print("Id Cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                //Creamos el objeto
                var cliente = new Cliente(idCliente,nombre,apellido,membresia);
                var modificado = clienteDAO.modificarCliente(cliente);
                if (modificado){
                    System.out.println("Cliente modificado: " + cliente);
                }else {
                    System.out.println("Error al modificar cliente: " + cliente);
                }
            }
            case 5 ->{//Eliminar Cliente
                System.out.println("--- Eliminar Cliente ---");
                System.out.print("Id Cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var eliminado = clienteDAO.eliminarCliente(cliente);
                if (eliminado){
                    System.out.println("Cliente eliminado: " + cliente);
                }else {
                    System.out.println("Error al eliminar cliente: " + cliente);
                }
            }
            case 6 ->{//Salir
                System.out.println("Hasta luego!!");
                salir = true;
            }
            default -> {
                System.out.println("Opción no reconocida");
            }

        }

        return salir;
    }
}
