package ficheros.ejercicioPreExamen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

    // Leer fichero y crear objetos de aplicacion a raiz de ese fichero

    public static void main(String[] args) {
        String leido;
        int contador = 0;
        int contApp = 0;
        String rutafich = "C:\\Users\\O007985\\Documents\\cursoJava\\ficheros\\ejercicioPreExamen\\AplicacionesGoogle.txt";

        try {

            String App;
            int Cost, Users;
            FileReader fr = new FileReader(new File(rutafich));
            BufferedReader br = new BufferedReader(fr);
            Aplicacion Youtube = new Aplicacion();
            Aplicacion Android = new Aplicacion();
            Aplicacion BigQuery = new Aplicacion();
            Aplicacion LookerStudio = new Aplicacion();
            Aplicacion YoutubeKids = new Aplicacion();
            ArrayList<Aplicacion> apps = new ArrayList<>();

            while ((leido = br.readLine()) != null) {

                if (contador == 0) {
                    App = leido.substring(13, leido.length());

                    contador++;

                    switch (contApp) {

                        case 0:

                            Youtube.setNombre(App);
                            break;

                        case 1:

                            Android.setNombre(App);
                            break;

                        case 2:

                            BigQuery.setNombre(App);
                            break;

                        case 3:

                            LookerStudio.setNombre(App);
                            break;
                        case 4:

                            YoutubeKids.setNombre(App);

                    }

                } else if (contador == 1) {

                    Users = Integer.parseInt(leido.substring(19, leido.length()));

                    contador++;

                    switch (contApp) {

                        case 0:

                            Youtube.setCantidadUsuarios(Users);
                            break;

                        case 1:

                            Android.setCantidadUsuarios(Users);
                            break;

                        case 2:

                            BigQuery.setCantidadUsuarios(Users);
                            break;

                        case 3:

                            LookerStudio.setCantidadUsuarios(Users);
                            break;
                        case 4:

                            YoutubeKids.setCantidadUsuarios(Users);

                    }
                } else if (contador == 2) {

                    Cost = Integer.parseInt(leido.substring(15, leido.length()));

                    contador = 0;

                    switch (contApp) {

                        case 0:

                            Youtube.setCosteMensual(Cost);
                            contApp++;
                            break;

                        case 1:

                            Android.setCosteMensual(Cost);
                            contApp++;
                            break;

                        case 2:

                            BigQuery.setCosteMensual(Cost);
                            contApp++;
                            break;

                        case 3:

                            LookerStudio.setCosteMensual(Cost);
                            contApp++;
                            break;
                        case 4:

                            YoutubeKids.setCosteMensual(Cost);
                            contApp++;
                            break;

                    }

                }

            }
            apps.add(Youtube);
            apps.add(Android);
            apps.add(BigQuery);
            apps.add(LookerStudio);
            apps.add(YoutubeKids);
            System.out.println(Youtube.toString());
            System.out.println(Android.toString());
            System.out.println(BigQuery.toString());
            System.out.println(LookerStudio.toString());
            System.out.println(YoutubeKids.toString());

            Thread hilo = new Thread(new HiloEscritura(apps));
            hilo.start();
            hilo.join();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    static class HiloEscritura implements Runnable {

        ArrayList<Aplicacion> appsHilo = new ArrayList<>();

        public HiloEscritura(ArrayList<Aplicacion> appsHilo) {
            this.appsHilo = appsHilo;
        }

        @Override
        public void run() {

            System.out.println("Hilo ejecutando");
            // Escritura fichero
            String rutaSalida = "C:\\Users\\O007985\\Documents\\cursoJava\\ficheros\\ejercicioPreExamen\\output_proceso_google.txt";

            File salida = new File(rutaSalida);
            try {
                FileWriter fw1 = new FileWriter(salida, true);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                for (Aplicacion app : appsHilo) {

                    bw1.write(app.toString());
                    bw1.write("\n");

                }
                bw1.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

}
