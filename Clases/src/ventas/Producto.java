package ventas;

public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    public Producto(String nombre, double precio) {
        //Inicializar e incrementar el id del producto cada vez que se vaya a crear un producto
        this.idProducto = ++Producto.contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "ID: " + this.idProducto +
                ", Nombre: '" + this.nombre + '\'' +
                ", Precio: $" + this.precio +
                '}';
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
