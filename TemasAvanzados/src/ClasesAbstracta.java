/* Las clases abstractas son aquellas que dejan sin implementar alguno de sus métodos,
    para que las clases hijas o derivadas proporcione la implemenación.
    La utilidad de un método abstracto es definir qué se debe hacer, pero no cómo hacerlo.
 */

public class ClasesAbstracta {
    public static void main(String[] args) {
      //  FiguraGeometrica figuraGeometrica = new FiguraGeometrica(); // Error, no se puede instanciar
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

//Clase Abtracta
abstract class FiguraGeometrica{//No se pueden instanciar
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{

    @Override
    public void dibujar() {
        System.out.println("Se debe dibujar un Rectángulo");
    }
}

class Circulo extends FiguraGeometrica{

    @Override
    public void dibujar() {
        System.out.println("Se debe dibujar un Círculo");
    }
}
