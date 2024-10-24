package Tema2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una cantidad en dolares ");
        double Dollar = in.nextDouble();
        double Euro = Dollar * 0.93;
        System.out.println(Dollar + " dolares en euros es " + Euro);
    }
}

