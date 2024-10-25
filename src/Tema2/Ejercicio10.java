package Tema2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Damé 3 números");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();
        if (num3 >= num2 && num2 >= num1) {
            System.out.println("Los numeros están ordenados de menor a mayor");
        } else {
            System.out.println("Los numeros no están ordenados de menor a mayor");
        }
    }
}
