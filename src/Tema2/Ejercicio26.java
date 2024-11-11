package Tema2;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = in.nextInt();
        int cont = num;
        int primo = 0;
        //for
        while (cont >= 1) {
            if (num % cont == 0) {
                primo ++;
            }
            cont --;
        }
        if (num == 0) {
            System.out.println("El número no es primo");
        } else if (primo <= 2) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }
}
