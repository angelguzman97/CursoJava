package gm.tareas.servicio;

import gm.tareas.modelo.Tarea;

import java.util.List;

public interface ITareaServicio {
    List<Tarea> listarTareas();
    Tarea buscarTareaPorId(Integer idTarea);
    void guardarTarea(Tarea tarea);
    void eliminarTarea(Tarea tarea);
}
