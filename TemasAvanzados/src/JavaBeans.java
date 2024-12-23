import java.io.Serializable;

/*
Un JavaBeans es una clase de Java que debe cubrir ciertas características.
*Debe tener un constructor vacío.
Aunque puede tener más constructores.

*Debe aplicar el concepto de encapsulamiento. Es decir, atributos privados,
y métodos Getters/Setter para acceder a los atributos.

*Debe implementar la interface Serializable.
Permite enviar los objetos por la red o disco duro.
 */
public class JavaBeans {
    public static void main(String[] args) {
        var persona = new Persona();
        persona.setNombre("Karla");
        persona.setApellido("Lara");
        System.out.println("Persona = "+persona);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());

    }
}

class Persona implements Serializable {
    private String nombre, apellido;
    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
