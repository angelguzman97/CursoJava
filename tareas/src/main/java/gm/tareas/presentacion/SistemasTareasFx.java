package gm.tareas.presentacion;

import gm.tareas.TareasApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class SistemasTareasFx extends Application {
    //Importar
    private ConfigurableApplicationContext applicationContext;
    //Inicialización del programa. Se coloca la clase de raíz
    @Override
    public void init(){
        this.applicationContext = new SpringApplicationBuilder(TareasApplication.class).run();
    }

    //Crear el escenario
    @Override
    public void start(Stage stage) throws Exception {
        //Crea el objeto FXMLLoader y se indica de donde toma el archivo fxml
        FXMLLoader loader = new FXMLLoader(TareasApplication.class.getResource("/templates/index.fxml"));
        loader.setControllerFactory(applicationContext::getBean); //Indica donde lo correrá. Manda a llamar
        Scene escena = new Scene(loader.load());//Crea la escena
        stage.setScene(escena);//Envía la escena
        stage.show();//Muestra la escena
    }

    @Override
    public void stop(){
        applicationContext.close(); //Cierra la ventana
        Platform.exit();//Cierra la fábrica de Spring
    }
}
