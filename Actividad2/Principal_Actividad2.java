package ficheros.Actividad2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal_Actividad2 {

    public static void main(String[] args) {

        Persona p = new Persona();
        File dir = new File("C:\\Users\\O007985\\Documents\\cursoJava\\ficheros\\Actividad2\\actividad2.txt");

        try {
            if (dir.createNewFile()) {

                System.out.println("archivo creado correctamente");
            } else {
                System.out.println("Archivo no creado");
            }

            FileWriter fw = new FileWriter(dir);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(p.toString());
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
