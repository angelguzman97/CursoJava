package gm.zona_fit.gui;

import com.formdev.flatlaf.FlatDarculaLaf;
import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

//@Component
public class ZonaFitForma extends JFrame{
    private JPanel panelPrincipal;
    private JTable clientesTabla;
    private JTextField nombreTexto;
    private JTextField apellidoTexto;
    private JTextField membresiaTexto;
    private JButton guardarButton;
    private JButton eliminarButton;
    private JButton limpiarButton;
    private DefaultTableModel tablaModeloClientes;
    private Integer idCliente;

    IClienteServicio clienteServicio;

    //Se inyecta al constructor para poder ocupar los servicios.
    // Ya no se inyecta la interfaz, solo al constructor
    @Autowired
    public ZonaFitForma(ClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
        iniciarForma();
        guardarButton.addActionListener(e -> guardarCliente());
        clientesTabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //Método para
                cargarClienteSeleccionado();
            }
        });
        eliminarButton.addActionListener(e -> eliminarCliente());
        limpiarButton.addActionListener(e -> limpiarFormulario());
    }

    private void iniciarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //this.tablaModeloClientes = new DefaultTableModel(0,4);// registros 0 y columnas 4
        this.tablaModeloClientes = new DefaultTableModel(0,4){
            @Override
            public boolean isCellEditable(int row, int column) {//Inhailitar escribir directamente de la tabla
                return false;
            }
        };
        String[] cabeceros = {"Id", "Nombre", "Apellido", "Membresia"}; //Crear el arreglo para las columnas
        this.tablaModeloClientes.setColumnIdentifiers(cabeceros);//Indicar las columnas
        this.clientesTabla = new JTable(tablaModeloClientes); //Crear el objeto tabla
        //Restringir la selección de la tabla a un solo registro.
        this.clientesTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //Cargar listado de clientes
        listarClientes();
    }

    private void listarClientes(){
        this.tablaModeloClientes.setRowCount(0); //Inicializa el contenido de la tabla
        var clientes = this.clienteServicio.listarCliente();
        clientes.forEach(cliente -> {
            Object[] renglonCliente = {//Crear un arreglo de tipo Object, para traer el contenido de la bd
                    cliente.getId(),
                    cliente.getNombre(),
                    cliente.getApellido(),
                    cliente.getMembresia()
            };
            this.tablaModeloClientes.addRow(renglonCliente);//Pasa el arreglo o contenido a la tabla inicializada
        });

    }

    private void guardarCliente(){
        if(nombreTexto.getText().equals("")){
            mostrarMensaje("Proporciona un nombre");
            nombreTexto.requestFocusInWindow();
            return;
        }else if (membresiaTexto.getText().equals("")) {
            mostrarMensaje("Proporciona la membresia y que no se repita");
            membresiaTexto.requestFocusInWindow();
            return;
        }

        //Recuperar los valores del formulario
        var nombre = nombreTexto.getText();
        var apellido = apellidoTexto.getText();
        var membresia = Integer.parseInt(membresiaTexto.getText());
        Cliente cliente = new Cliente(this.idCliente, nombre, apellido, membresia);//This.idCliente es para recuperar el id
        this.clienteServicio.guardarCliente(cliente);//Insertar datos / Modificar
        if (this.idCliente == null){
            mostrarMensaje("Se agregó el nuevo Cliente");
        }else {
            mostrarMensaje("Se actualizó el Cliente");
        }
        limpiarFormulario();//Limpia los campos
        listarClientes();//Refresca la lista
    }

    private void cargarClienteSeleccionado(){
        var renglon = clientesTabla.getSelectedRow();

        if (renglon != -1){//Selecciona un registro antes. el valor -1 no es ningún registro
            //Selecciona la tabla.
            //Evalúa el registro comenzando del indice 0
            //Toma como cadena
            var id =  clientesTabla.getModel().getValueAt(renglon, 0).toString();
            this.idCliente = Integer.parseInt(id);

            var nombre = clientesTabla.getModel().getValueAt(renglon, 1).toString();
            this.nombreTexto.setText(nombre);

            var apellido = clientesTabla.getModel().getValueAt(renglon,2).toString();
            this.apellidoTexto.setText(apellido);

            var membresia = clientesTabla.getModel().getValueAt(renglon,3).toString();
            this.membresiaTexto.setText(membresia);
        }
    }

    private void eliminarCliente(){
        var renglon = clientesTabla.getSelectedRow();
        if (renglon != -1){
            var idClienteStr = clientesTabla.getModel().getValueAt(renglon, 0).toString();
            this.idCliente = Integer.parseInt(idClienteStr);
            Cliente cliente = new Cliente();
            cliente.setId(this.idCliente);
            this.clienteServicio.eliminarCliente(cliente);
            mostrarMensaje("Cliente con id " + this.idCliente + " eliminado");
            limpiarFormulario();
            listarClientes();

        }else {
            mostrarMensaje("Debe seleccionar un cliente a eliminar");
        }

    }

    private void limpiarFormulario(){
        nombreTexto.setText("");
        apellidoTexto.setText("");
        membresiaTexto.setText("");
        //Limpiar el Id cliente seleccionado
        this.idCliente = null;
        //Deseleccionar el registro de la tabla
        this.clientesTabla.getSelectionModel().clearSelection();
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }
}
