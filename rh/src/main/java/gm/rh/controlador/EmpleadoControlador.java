package gm.rh.controlador;

import gm.rh.excepcion.RecursoNoEncontradoExcepcion;
import gm.rh.modelo.Empleado;
import gm.rh.servicio.IEmpleadoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rh-app") //http://localhost:8080/rh-app/
@CrossOrigin(value = "http://localhost:3000")
public class EmpleadoControlador {
    @Autowired
    private IEmpleadoServicio empleadoServicio;

    private Logger logger = LoggerFactory.getLogger(EmpleadoControlador.class);

    @GetMapping("/empleados") //http://localhost:8080/rh-app/empleados
    public List<Empleado> obtenerEmpleados(){
        var empleados = empleadoServicio.listarEmpleado();
        empleados.forEach((empleado -> logger.info(empleado.toString())));
        return empleados;
    }

    @PostMapping("/empleados")
    public Empleado agregarEmpleado(@RequestBody Empleado empleado){
        logger.info("Empleado a agregar: "+empleado);
        return empleadoServicio.guardarEmpleado(empleado);
    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> buscarEmpleadoPorId(@PathVariable Integer id){
        Empleado empleado= empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado==null){
          throw new  RecursoNoEncontradoExcepcion("No se encontró el id: "+id);
        }else {
            return ResponseEntity.ok(empleado);
        }
    }

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Integer id,
                                                       @RequestBody Empleado empleadoRecibido){
       Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
       if (empleado == null)
           throw new RecursoNoEncontradoExcepcion("El id recibido no existe: "+id);
       empleado.setNombre(empleadoRecibido.getNombre());
       empleado.setDepartamento(empleadoRecibido.getDepartamento());
       empleado.setSueldo(empleadoRecibido.getSueldo());
       empleadoServicio.guardarEmpleado(empleado);
       return ResponseEntity.ok(empleado);
    }

    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarEmpleado(@PathVariable int id){
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado==null)
            throw new RecursoNoEncontradoExcepcion("El id no existe: "+id);
        empleadoServicio.eliminarEmpleado(empleado);
        //Json {"eliminado": "true"}
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminado", Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }


}
