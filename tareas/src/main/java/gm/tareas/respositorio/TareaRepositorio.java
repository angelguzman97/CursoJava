package gm.tareas.respositorio;

import gm.tareas.modelo.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepositorio extends JpaRepository<Tarea,Integer> {
}
