/*Una interface es un tipo similar a unaclase abstacta. Sin embargo la interface se enfoca
    más en el comportamiento, y la clase abstracta se enfoca en abstraer características en común.
    La interface es más cómo cumplir con un contrato.
 */
public interface Traductor {
    //public y abstract
    void traducir();

    //Métodos con implementación por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduzco a Inglés");
    }
}

class Frances implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduzco a Francés");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en Francés...");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();


    }
}


