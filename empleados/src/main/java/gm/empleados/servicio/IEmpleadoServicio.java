package gm.empleados.servicio;

import gm.empleados.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {
    List<Empleado> listarEmpleado();
    Empleado buscarEmpleadoPorId(Integer idEmpleado);
    void guardarEmpleado(Empleado empleado);
    void eliminarEmpleado(Empleado empleado);
}
