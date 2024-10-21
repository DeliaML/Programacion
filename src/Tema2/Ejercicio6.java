package Tema2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número");
        double num = in.nextDouble();
        if (num > 0) {
            System.out.println("Tu número es positivo");
        } else if (num < 0) {
            System.out.println("Tu número es negativo");
        } else {
            System.out.println("Tu número es 0");
        }
    }
}
