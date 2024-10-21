package Tema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 3 números");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num1 >= num2  && num1 >= num3) {
            System.out.println("El número más grande es " + num1);
        } else if (num2 >= num3) {
            System.out.println("El número más grande es " + num2);
        } else {
            System.out.println("El número más grande es " + num3);

        }
    }
}