package ficheros.Actividad3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class principal {

    public static void main(String[] args) {

        // Creamos 3 objetos Empleado
        Empleado e1 = new Empleado("Adrian", "Perez", "Madrid", "10-11-2000", 1, "SoftwareDeveloper", 3, 2000.4);
        Empleado e2 = new Empleado("Adrian2", "Perez2", "Madrid2", "10-11-2002", 1, "SoftwareDeveloper2", 3, 0.0);
        Empleado e3 = new Empleado("Adrian3", "Perez3", "Madrid3", "10-11-2003", 1, "SoftwareDeveloper3", 3, 4000.4);

        // Ruta y nombre del archivo
        String rutaArchivo = "C:\\Users\\O007985\\Documents\\cursoJava\\ficheros\\Actividad3\\actividad3.txt";

        try {
            File archivo = new File(rutaArchivo);

            if (archivo.exists()) {
                throw new ArchivoExistenteException("Archivo ya creado anteriormente");
            }

            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(e1.toString() + "\n" + e2.toString() + "\n" + e3.toString());

            bw.close();

            System.out.println("Archivo creado correctamente");

        } catch (ArchivoExistenteException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}