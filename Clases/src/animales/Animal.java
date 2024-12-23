package animales;

public class Animal {
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal{

    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace ¡Wauf!");
    }

}

class Gato extends Animal{

    @Override
    protected void hacerSonido() {
        System.out.println("El gato hace ¡Miau!");
    }
}

class PruebaAnimal{
    //Método polímorfico
    static void imprimirSonido (Animal animal){
        animal.hacerSonido();
    }
    public static void main(String[] args) {
        //Objeto de la clase Padre (Animal)
       // var animal = new Animal();
         var animal = new Perro();
       // var animal = new Gato();

        imprimirSonido(animal);

    }
}

