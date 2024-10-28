package Tema2;

import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        int suma = 0;
        while (num <= 1000) {
            if (num % 2 == 0) {
                suma = suma + num;
            }
            num++;
        }
        System.out.println(suma);
    }
}
