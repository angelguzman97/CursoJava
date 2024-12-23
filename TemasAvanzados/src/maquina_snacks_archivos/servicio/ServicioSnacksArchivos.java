package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{

    private final String NOMBRE_ARCHIVO = "snacks.txt";
    //Crear la lista de snacks
    private List<Snack> snacks = new ArrayList<>();

    //Constructor de la clase
    public ServicioSnacksArchivos(){
        //Creamos el archivo si no existe
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe = archivo.exists();
            if(existe){
               this.snacks = obtenerSnacks();
            }else {//Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                System.out.println("Se ha creado el archivo");
                salida.close(); //Guardar el archivo en disco
            }
        }catch (Exception e){
            System.out.println("Error al crear archivo: " + e.getMessage());
            e.printStackTrace();
        }
        //Si no existe, cargamos algunos snacks iniciales
        if (!existe){
            cargarSnacksIniciales();
        }
    }

    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("Papas",70));
        this.agregarSnack(new Snack("Refresco",50));
        this.agregarSnack(new Snack("Sandwich",120));

    }

    private List<Snack> obtenerSnacks(){
        var snacks = new ArrayList<Snack>();
        try {
           List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea : lineas){
                String[] lineasSnack = linea.split(","); //split() separa las lineas por comas
                var idSnack = lineasSnack[0]; //No se usa
                var nombre = lineasSnack[1];
                var precio = Double.parseDouble(lineasSnack[2]);
                var snack = new Snack(nombre, precio);
                snacks.add(snack);//Agregamos el snack leído a la lista

            }
        }catch (Exception e){
            System.out.println("Error al leer archivo snacks: " + e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public void agregarSnack(Snack snack) {
        //Agregamos el nuevo Snack,
        //1. Se guarda en la lista en memoria
        this.snacks.add(snack);
        //2. Guardamos el nuevo snack en el archivo
        this.agregarSnackArchivo(snack);

    }
    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(snack.escribirSnack());
            salida.close();//Se escribe la inf. en el archivo
        }catch (Exception e){
            System.out.println("Error al agregar snack: " + e.getMessage());
        }
    }

    @Override
    public void mostrarSnack() {
        System.out.println("--- Snacks en el inventario ---");
        //Mostramos la lista de snacks en el archivo
        var inventario = "";
        for (var snack : snacks){
            inventario += snack.toString() + "\n";
        }
        System.out.println(inventario);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
