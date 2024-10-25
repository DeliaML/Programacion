package Tema2;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número");
        double Num = in.nextDouble();
        if (Num >= 0) {
            System.out.println("La raíz cuadrada de " + Num + " es " + Math.sqrt(Num));
        }  else {
            System.out.println("Error");
        }
    }
}
