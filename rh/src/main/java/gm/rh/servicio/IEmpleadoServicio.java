package gm.rh.servicio;

import gm.rh.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {
    List<Empleado> listarEmpleado();
    Empleado buscarEmpleadoPorId(Integer idEmpleado);
    Empleado guardarEmpleado(Empleado empleado);
    void eliminarEmpleado(Empleado empleado);
}
