package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

//@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {
	@Autowired
	private IClienteServicio clienteServicio;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class); //Imprimir en consola
	String nl = System.lineSeparator();//Prorpociona el salto de lineas



	public static void main(String[] args) {
		logger.info("Iniciando la aplicación");
		//Levantar la fábrica de spring
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Aplicación finalizada");
	}

	@Override
	public void run(String... args) throws Exception {
		zonaFitApp();
	}
	private void zonaFitApp(){
		var salir = false;
		var consola = new Scanner(System.in);
		while (!salir){
			var opcion = mostrarMenu(consola);
			salir = ejecutarOpciones(consola, opcion);
			logger.info(nl);
		}
	}

	private int mostrarMenu(Scanner consola){
		logger.info("""
		\n*** Aplicacion Zona Fit (GYM) ***
				1. Listar Cliente
				2. Buscar Cliente
				3. Agregar Cliente
				4. Modificar Cliente
				5. Eliminar Cliente
				6. Salir
				Elige una opción:\s""");
		return Integer.parseInt(consola.nextLine());
	}
	private boolean ejecutarOpciones(Scanner consola, int opcion){
		var salir = false;
		switch (opcion){
			case 1 -> {
				logger.info(nl + "--- Listado de Clientes ---" + nl);
				List<Cliente> clientes = clienteServicio.listarCliente();//Crear lista de tipo Objeto
				clientes.forEach(cliente -> logger.info(cliente.toString() + nl));
			}
			case 2 ->{
				logger.info(nl + "--- Buscar Cliente Por Id ---" + nl +
						"Introduzca id Cliente: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente); //Crea el objeto llamando el metodo
				if (cliente != null){
					logger.info("Cliente encontrado: " + cliente + nl);
				}else {
					logger.info("Cliente no encontrado: " + idCliente + nl);
				}
			}
			case 3 ->{
				logger.info(nl + "--- Agregar Cliente ---" + nl);
				logger.info("Nombre: ");
				var nombre = consola.nextLine();
				logger.info(nl + "Apellido: ");
				var apellido = consola.nextLine();
				logger.info(nl + "Membresia: ");
				var membresia = Integer.parseInt(consola.nextLine());
			//	var cliente = new Cliente(null,nombre,apellido,membresia);
				var cliente = new Cliente();
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setMembresia(membresia);
				clienteServicio.guardarCliente(cliente);
				logger.info("Cliente Agregado");
			}
			case 4 -> {
				logger.info(nl + "--- Modificar Cliente ---" + nl);
				logger.info("Id Cliente: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if (cliente != null){
					logger.info("Nombre: ");
					var nombre = consola.nextLine();
					logger.info("Apellido: ");
					var apellido = consola.nextLine();
					logger.info("Membresia: ");
					var membresia = Integer.parseInt(consola.nextLine());
					cliente.setNombre(nombre);
					cliente.setApellido(apellido);
					cliente.setMembresia(membresia);
					clienteServicio.guardarCliente(cliente);
					logger.info("Cliente modificado: " + cliente + nl);
				}else {
					logger.info("Error al modificar cliente: " + cliente + nl);
				}
			}
			case 5 -> {
				logger.info(nl + "--- Eliminar Cliente ---" + nl);
				logger.info("Id Cliente: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if (cliente != null){
					clienteServicio.eliminarCliente(cliente);
					logger.info("Cliente eliminado: " + cliente + nl);
				}else {
					logger.info("Error al eliminar cliente: " + cliente + nl);
				}
			}
			case 6 -> {
				logger.info("Hasta pronto! :)" + nl + nl);
				salir = true;
			}
			default -> {
				logger.info("Opción inválida: " + opcion + nl);
			}
		}

		return salir;
	}

}
