package archivos;

import java.io.File;
import java.io.*;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()) {//comprobar si existe en la maquina o proyecto
                System.out.println("El archivo ya existe");
            } else {
                //Creamos el archivo
                //PrintWriter() --- Escribir inf. en el nombre del archivo
                //FileWriter() -- Crea el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();//Para crearlo por completo
                System.out.println("Se ha creado el archivo");
            }
        }catch (IOException e){
            System.out.println("Error al crear archivo: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
