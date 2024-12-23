package zona_fit.datos;

import zona_fit.conexion.Conexion;
import zona_fit.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static zona_fit.conexion.Conexion.getConexion;

/* Patrón de Diseño
Un patrón de diseño son soluciones ya conocidas a problemas que nos
encontramos comunmente al crear aplicaciones.

Cada patrón es como un plano que podemos usar y personalizar para resolver
problema al diseñar una aplicación.
 */
public class ClienteDAO implements IClienteDAO{
    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs; //Permite recibir el estado de la consulta
        Connection con = getConexion();
        var sql = "SELECT * FROM cliente ORDER BY id";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){//next es para posicionarse en el primer registro a iterar
                var cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                clientes.add(cliente);
            }
        }catch (Exception e){
            System.out.println("Error al listar clientes: "+e.getMessage());
        }finally {
            try {
                con.close();

            }catch (Exception e){
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
        return clientes;
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        var con = getConexion();
        var sql = "SELECT * FROM cliente WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            rs = ps.executeQuery();
            if (rs.next()){
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                return true;
            }
        }catch (Exception e){
            System.out.println("Error al recuperar cliente por id: " + e.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexión: "+e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "INSERT INTO cliente(nombre, apellido, membresia) " +
                "VALUES(?, ?, ?)";
        try {
          ps = con.prepareStatement(sql);
          ps.setString(1, cliente.getNombre());
          ps.setString(2, cliente.getApellido());
          ps.setInt(3, cliente.getMembresia());
          ps.execute();
          return true;
        }catch (Exception e){
            System.out.println("Error al insertar cliente: "+e.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }

        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        var sql = "UPDATE cliente SET nombre = ?, apellido = ?, membresia = ?" +
                " WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.setInt(4, cliente.getId());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al modificar cliente: " + e.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "DELETE FROM cliente WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,cliente.getId());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al eliminar cliente: "+e.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexión: "+e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //Listar clientes
//        System.out.println("*** Listar clientes ***");
        IClienteDAO clienteDAO = new ClienteDAO();
//        var clientes = clienteDAO.listarClientes();
//        clientes.forEach(System.out::println);

        //Buscar por id
//        var cliente1 = new Cliente(3);
//        System.out.println("Cliente antes de la búsqueda: "+cliente1.getId());
//        var encontrado = clienteDAO.buscarClientePorId(cliente1);
//        if (encontrado){
//            System.out.println("Cleiente encontrado: "+ cliente1);
//        }else {
//            System.out.println("No se encontró cliente: "+ cliente1.getId());
//        }

        //Agregar Cliente
//        var nuevoCliente = new Cliente("Daniel", "Ortiz", 300);
//
//        var agregado = clienteDAO.agregarCliente(nuevoCliente);
//        if (agregado){
//            System.out.println("Cliente agregado: " + nuevoCliente);
//        }else {
//            System.out.println("No se agregó el cliente: " + nuevoCliente);
//        }

        //Modificar cliente
//        var modificarCliente = new Cliente(5, "Carlos Daniel", "Ortiz", 300);
//        var modificado = clienteDAO.modificarCliente(modificarCliente);
//        if (modificado){
//            System.out.println("Cliente modificado: " + modificarCliente);
//        }else {
//            System.out.println("Error al modificar cliente: " + modificarCliente);
//        }

        //Eliminar Cliente
        var clienteEliminar = new Cliente(5);
        var eliminado = clienteDAO.eliminarCliente(clienteEliminar);
        if (eliminado){
           System.out.println("Cliente eliminado: " + clienteEliminar);
        }else {
            System.out.println("Error al eliminar cliente: " + clienteEliminar);
        }


        System.out.println("*** Listar clientes ***");
      //  IClienteDAO clienteDAO = new ClienteDAO();
       var clientes = clienteDAO.listarClientes();
       clientes.forEach(System.out::println);
    }
}
