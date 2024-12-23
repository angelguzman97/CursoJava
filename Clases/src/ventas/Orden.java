package ventas;

import java.util.Arrays;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    public Orden() {
        //Constructor sin parámetros para inicializar el id de la orden y los productos
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        //Validamos que no sean más de 10 productos al agregar
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            //Se agregan los productos al arreglo
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo de productos: "
                    + MAX_PRODUCTOS);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (var i = 0; i < this.contadorProductos; i++){
            var producto = this.productos[i];
            total += producto.getPrecio(); //total = total + producto.getPrecio();
        }
        return total;
    }

//    public void mostrarOrden(){
//        System.out.println("Id Orden: "+this.idOrden);
//        var totalOrden = this.calcularTotal();
//        System.out.println("\tTotal de la orden: $"+totalOrden);
//        System.out.println("\tProductos de la Orden: ");
//        for (var i = 0; i < this.contadorProductos; i++){
//            System.out.println("\t\t"+this.productos[i]);
//        }
//    }

    @Override
    public String toString() {
        var resultado = "ID Orden: "+this.idOrden + "\n";
        var totalOrden = this.calcularTotal();
        resultado += "\tTotal de la orden: $"+totalOrden+"\n";
        resultado += "\tProductos de la Orden: "+"\n";
        for (var i = 0; i < this.contadorProductos; i++){
           resultado += "\t\t"+this.productos[i]+"\n";
        }
        return resultado;
    }
}
