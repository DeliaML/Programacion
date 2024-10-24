package Tema2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una cantidad en euros ");
        double Euro = in.nextDouble();
        double Dollar = Euro * 1.08;
        System.out.println(Euro + " euros en dolares es " + Dollar);
    }
}
