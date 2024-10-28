package Tema2;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el número A");
        int A = in.nextInt();
        System.out.println("Introduce el número B");
        int B = in.nextInt();
        while (B >= A) {
            if (A % 2 == 1) {
                System.out.println(A);
            }
            A ++;
        }
    }
}
