package Tema2;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = in.nextInt();
        int cifra = 1;
        int res = num;
        while (res >= 10) {
            res = res / 10;
            cifra ++;
        }
        System.out.println(num + " tiene " + cifra + " cifras");
    }
}
