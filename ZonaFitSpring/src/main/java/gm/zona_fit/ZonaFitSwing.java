package gm.zona_fit;

import com.formdev.flatlaf.FlatDarculaLaf;
import gm.zona_fit.gui.ZonaFitForma;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

//@SpringBootApplication
public class ZonaFitSwing {
    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        //Instanciar la fabrica de Spring
        ConfigurableApplicationContext contextSpring =
                new SpringApplicationBuilder(ZonaFitSwing.class)//Indicar la clase a ejecutar(Clase que se está trabajando)
                        .headless(false)//Agregar contenido front, pero indicar que será para escritorio y no web
                        .web(WebApplicationType.NONE)//Indicar que no será una app web
                        .run(args);//Recibir los argumentos
        //Crear un objeto de Swing
        SwingUtilities.invokeLater(()->{//Ejecutar después de levantar el servidor
            ZonaFitForma zonaFitForma = contextSpring.getBean(ZonaFitForma.class);//Recuperar el objeto
            zonaFitForma.setVisible(true);
        });
    }
}
