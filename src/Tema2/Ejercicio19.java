package Tema2;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        while (num <= 1000) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num ++;
        }
    }
}
