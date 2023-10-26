package ficheros.filesJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class actividad1_AdrianPerez {

    public static void main(String[] args) {

        // Realizar programa para sumar, restar, multiplicacion o división
        // Usuario introduce 2 valores por consola y se debe informar del resultado en
        // las 4 operaciones

        // Declaración de variables a usar
        int num1 = 0;
        int num2 = 0;
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        int division = 0;

        Scanner sc = new Scanner(System.in);

        // Directorio y ficheros
        String ruta = "C:\\Users\\O007985\\Documents\\dir_actividad";
        File dir = new File(ruta);
        // Crear directorio
        boolean creado = dir.mkdir();
        if (creado) {

            System.out.println("El directorio se ha creado correctamente");
        } else {
            System.out.println("El directorio no se ha creado");

        }
        String ruta11 = ruta + "\\resultados.txt";
        File ruta1 = new File(ruta11);
        FileWriter fw;
        try {
            ruta1.createNewFile();
            fw = new FileWriter(ruta1);
            BufferedWriter bw = new BufferedWriter(fw);

            // Programa

            System.out.println("Introduce el primer valor");
            num1 = sc.nextInt();

            System.out.println("Introduce el segundo valor");

            num2 = sc.nextInt();
            suma = num1 + num2;
            resta = num1 - num2;
            multiplicacion = num1 * num2;
            division = num1 / num2;

            String sum = "El resultado de la suma es: " + suma + "\n";
            String res = "El resultado de la suma es: " + resta + "\n";
            String mul = "El resultado de la suma es: " + multiplicacion + "\n";
            String div = "El resultado de la suma es: " + division + "\n";

            bw.write(sum);
            bw.write(res);
            bw.write(mul);
            bw.write(div);
            bw.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
