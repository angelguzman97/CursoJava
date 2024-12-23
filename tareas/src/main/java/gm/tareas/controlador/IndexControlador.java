package gm.tareas.controlador;
import gm.tareas.modelo.Tarea;
import gm.tareas.servicio.TareaServicio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;
@Component
public class IndexControlador implements Initializable {
    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @Autowired
    private TareaServicio tareaServicio;

    @FXML
    private TableView<Tarea> tareaTabla;

    //Columnas
    @FXML
    private TableColumn<Tarea, Integer> idTareaColumna;

    @FXML
    private TableColumn<Tarea, String> nombreTareaColumna;

    @FXML
    private TableColumn<Tarea, String> responsableTareaColumna;

    @FXML
    private TableColumn<Tarea, String> estatusTareaColumna;

    private final ObservableList<Tarea> tareaList = FXCollections.observableArrayList();
    @FXML
    private TextField nombreTareaTexto;
    @FXML
    private TextField responsableTareaTexto;
    @FXML
    private TextField estatusTareaTexto;

    private Integer idTareaInterno;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tareaTabla.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        configurarColumna();
        listarTareas();
    }

    private void configurarColumna(){
        idTareaColumna.setCellValueFactory(new PropertyValueFactory<>("idTarea"));
        nombreTareaColumna.setCellValueFactory(new PropertyValueFactory<>("nombreTarea"));
        responsableTareaColumna.setCellValueFactory(new PropertyValueFactory<>("responsable"));
        estatusTareaColumna.setCellValueFactory(new PropertyValueFactory<>("estatus"));
    }

    private void listarTareas(){
        logger.info("Ejecutando la lista de tarea");
        tareaList.clear();
        tareaList.addAll(tareaServicio.listarTareas());//Obtencion de la bd
        //Relacionar lo de la bd a la tabla de la vista
        tareaTabla.setItems(tareaList);
    }

    public void agregarTarea(){
        if (nombreTareaTexto.getText().isEmpty()){
            mostrarMensaje("Error Validación", "Debe proporcionar una tarea");
            nombreTareaTexto.requestFocus();
            return;
        }else {
            var tarea = new Tarea();
            recolectarDatosFormulario(tarea);
            tarea.setIdTarea(null);
            tareaServicio.guardarTarea(tarea);
            mostrarMensaje("Información", "Tarea Agregada");
            limpiarFormulario();
            listarTareas();
        }
    }

    public void cargarTareaFormulario(){
        var tarea = tareaTabla.getSelectionModel().getSelectedItem();
        if(tarea != null){
            idTareaInterno = tarea.getIdTarea();
            nombreTareaTexto.setText(tarea.getNombreTarea());
            responsableTareaTexto.setText(tarea.getResponsable());
            estatusTareaTexto.setText(tarea.getEstatus());
        }
    }

    private void recolectarDatosFormulario(Tarea tarea){
        if (idTareaInterno != null){
            tarea.setIdTarea(idTareaInterno);
        }
        tarea.setNombreTarea(nombreTareaTexto.getText());
        tarea.setResponsable(responsableTareaTexto.getText());
        tarea.setEstatus(estatusTareaTexto.getText());
    }

    public void modificarTarea(){
        if (idTareaInterno == null){
            mostrarMensaje("Información", "Debes seleccionar un registro");
            return;
        }
        if (nombreTareaTexto.getText().isEmpty()) {
            mostrarMensaje("Error Validación", "Debe proporcionar una tarea");
            nombreTareaTexto.requestFocus();
        }
        var tarea = new Tarea();
        recolectarDatosFormulario(tarea);
        tareaServicio.guardarTarea(tarea);
        mostrarMensaje("Información", "Tarea Modificada");
        limpiarFormulario();
        listarTareas();

    }

    public void eliminarTarea(){
        var tarea = tareaTabla.getSelectionModel().getSelectedItem();
        if(tarea != null){
            logger.info("Registro a eliminar: " + tarea.toString());
            tareaServicio.eliminarTarea(tarea);
            mostrarMensaje("Información", "Tarea eliminada: " + tarea.getIdTarea());
            limpiarFormulario();
            listarTareas();
        }else {
            mostrarMensaje("Erro", "No se ha seleccionado ninguna tarea");
        }
    }

    public void limpiarFormulario(){
        idTareaInterno = null;
        nombreTareaTexto.clear();
        responsableTareaTexto.clear();
        estatusTareaTexto.clear();
    }

    private void mostrarMensaje(String titulo, String mensaje){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
