package ficheros.filesJava;

import java.nio.file.Files;
import java.nio.file.Paths;

public class crearFichero2 {

    public static void main(String[] args) {

        String contenido = "hola hola manola, que tal te va";
        try {
            Files.write(Paths.get(("archivito.txt")), contenido.getBytes()); // Crea el fichero en la carpeta del
                                                                             // proyecto
            // Files.Write se encarga de declarar la acción
            // Paths.get es el metodo que construye la interfaz Paths
            // Paths representa la ubicacion de un archivo y proporciona metodos de
            // manipulacion
            // Si no existe el archivo te lo crea
            // Si le pone sun directorio que no exista no crea nada
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

}
