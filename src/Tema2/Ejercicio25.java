package Tema2;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = in.nextInt();
        int cont = num - 1;
        int fact = num;
        if (num == 0) {
            System.out.println("El factorial de 0 es 1");
        } else if (num == 1) {
            System.out.println("El factorial de 1 es 1");
        } else {
            //for
            while (cont > 0) {
                fact = cont * fact;
                cont --;
            }
        }
        if (num >= 2) {
            System.out.println("El factorial de " + num + " es " + fact);
        }
    }
}
