package gm.inventarios.servicio;

import gm.inventarios.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    List<Producto> listarProdcucto();
    Producto buscarProductoPorId(Integer idProducto);
    Producto guardarProducto(Producto producto);
    void eliminarProductoPorId(Integer producto);
}
