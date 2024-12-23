package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creación de clase y Objetos Persona ***");
        System.out.println("Variable estática: "
                +Persona.getContadorPersonas());

        var persona1 = new Persona("Angel","Guzmán");
        System.out.println(persona1);//Automáticamente llama a toString
        System.out.println("Variable estática: "+Persona.getContadorPersonas());

        //Segundo objeto
        var persona2 = new Persona("Bety","Guzmán");
        System.out.println(persona2);
        System.out.println("Variabe estática: "+Persona.getContadorPersonas());
        //Acceder al contador desde la clase y no desde el obejto
        //Clase: Persona. Objeto: persona1 o persona2
    }
}
