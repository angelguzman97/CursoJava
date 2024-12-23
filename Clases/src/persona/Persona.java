package persona;

public class Persona{
    private static int contadorPersonas = 0;//Atributo estático
    private int idPersona;
    private String nombre, apellido;

    public Persona(){
        System.out.println("\nConstructor vacío...");
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        //Incrementar el atributo estático
        //Persona.contadorPersonas++;
        //Asignar el id único con la variable estática
        this.idPersona = ++Persona.contadorPersonas;
    }

    @Override
    public String toString() {
        return "ID: "+this.idPersona
                +", Nombre: " + this.nombre
                + ", Apellido: " + this.apellido
                +", Dir. Memoria: "+ super.toString();
    }

    public int getIdPersona() {
        return idPersona;
    }

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

    public static int getContadorPersonas() {
        return Persona.contadorPersonas;//Acceder con el nombre de la clase
    }
}
