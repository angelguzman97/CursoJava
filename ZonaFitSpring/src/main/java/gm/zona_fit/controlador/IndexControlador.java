package gm.zona_fit.controlador;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ViewScoped
public class IndexControlador {
    @Autowired
    IClienteServicio clienteServicio;
    private List<Cliente> clientes;
    private Cliente clienteSeleccionado;
    private static final Logger logger= LoggerFactory.getLogger(IndexControlador.class);
    @PostConstruct
    public void init(){
        cargarDatos();
    }
    public void cargarDatos(){
        if (clientes == null || clientes.isEmpty()) {
            this.clientes = this.clienteServicio.listarCliente();
            this.clientes.forEach(client -> logger.info(client.toString()));
        }
    }

    public void agregarCliente(){
        this.clienteSeleccionado = new Cliente();
    }
    public void guardarCliente(){
        logger.info("Cliente a guardar: "+this.clienteSeleccionado);
        //Agregar
        if (this.clienteSeleccionado.getId() == null){
            this.clienteServicio.guardarCliente(this.clienteSeleccionado);
            this.clientes.add(this.clienteSeleccionado);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Cliente Agregado"));
        }
        //Modificar
        else {
            this.clienteServicio.guardarCliente(this.clienteSeleccionado);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Cliente Actualizado"));
        }

        //Ocultar la ventana modal
        PrimeFaces.current().executeScript("PF('ventanaModalCliente').hide()");
        //Actualizar o refrescar ventana
        PrimeFaces.current().ajax().update("forma-clientes:mensajes",
                "forma-clientes:clientes-tabla");
        //Reset del objeto seleccionado
        this.clienteSeleccionado = null;
    }

    public void eliminarCliente(){
        logger.info("Cliente a eliminar: "+this.clienteSeleccionado);
        this.clienteServicio.eliminarCliente(this.clienteSeleccionado);
        //Eliminar el registro de la lista de clientes
        this.clientes.remove(this.clienteSeleccionado);
        //Reset del objeto del cliente seleccionado
        this.clienteSeleccionado = null;
        //Mensaje
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Cliente Eliminado"));
        //Refrescar
        PrimeFaces.current().ajax().update("forma-clientes:mensajes",
                "forma-clientes:clientes-tabla");
    }
}