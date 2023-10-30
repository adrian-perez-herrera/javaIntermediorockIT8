package ficheros.Examen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {

        Libro libro1 = new Libro(1, "libro1", "fantasia", 2025, "ENTREGADO");
        Libro libro2 = new Libro(2, "libro2", "aventuras", 2043, "ENTREGADO");
        Libro libro3 = new Libro(3, "libro3", "romantica", 2010, "PASO FECHA DE ENTREGA");
        Thread hiloNoDemonio = new Thread(new Hilo(libro1, libro2, libro3));
        Thread hiloDemonio = new Thread(new Hilo2("HiloNoDemonio"));
        hiloDemonio.setDaemon(true);
        hiloNoDemonio.setPriority(Thread.MAX_PRIORITY);
        hiloDemonio.setPriority(Thread.MIN_PRIORITY);
        hiloDemonio.start();
        try {
            hiloNoDemonio.start();
            hiloNoDemonio.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Hilo no demonio para escribir en fichero
    static class Hilo implements Runnable {
        Libro lib;
        Libro lib2;
        Libro lib3;

        public Hilo(Libro lib, Libro lib2, Libro lib3) {
            this.lib = lib;
            this.lib2 = lib2;
            this.lib3 = lib3;
        }

        @Override
        public void run() {

            try {
                String ruta = "C:\\Users\\O007985\\Documents\\cursoJava\\ficheros\\Examen\\salidaLibros.txt";
                File fich = new File(ruta);
                FileWriter fw = new FileWriter(fich, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(lib.toString());
                bw.write("\n");
                bw.write(lib2.toString());
                bw.write("\n");
                bw.write(lib3.toString());
                bw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    // Hilo demonio que saca numeros por pantalla hasta el 500 pero que acaba antes
    // porque es demonio

    static class Hilo2 implements Runnable {

        private String nombre;

        public Hilo2(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public void run() {
            for (int i = 0; i < 500; i++) {

                System.out.println(nombre + " ejecutandose en segundo plano");
            }

        }
    }
}
