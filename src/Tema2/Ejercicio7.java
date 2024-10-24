package Tema2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 2 números");
        double Num1 = in.nextDouble();
        double Num2 = in.nextDouble();
        if (Num1 >= Num2) {
            System.out.println("La resta del mayor por el menor es " + (Num1 - Num2));
        } else {
            System.out.println("La resta del mayor por el menor es " + (Num2 - Num1));
        }
    }
}
