package ficheros.Hilos;

import java.util.Scanner;

public class PrincipalHilos extends Thread {

    private int num1;
    private int num2;
    private int num3;

    public PrincipalHilos(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;

    }

    public void run() {
        System.out.println("Tarea en segundo plano");
        System.out.println(num1 + num2 + num3 + "\n");
        System.out.println(num1 - num2 - num3 + "\n");
        System.out.println(num1 * num2 * num3 + "\n");
        System.out.println(num1 / num2 / num3 + "\n");
        System.out.println("Fin tarea en segundo plano");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primero numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int num3 = sc.nextInt();

        PrincipalHilos hilo1 = new PrincipalHilos(num1, num2, num3);
        hilo1.start();
        System.out.println("Haciendo otras tareas en el primer plano1");
        System.out.println("Haciendo otras tareas en el primer plano2");
        System.out.println("Haciendo otras tareas en el primer plano3");
        System.out.println("Haciendo otras tareas en el primer plano4");

    }

}
