package Tema2;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = in.nextInt();
        int cont = num / 2;
        int primo = 0;
        while (cont >= 1) {
            if (num % cont == 0) {
                primo ++;
            }
            cont --;
        }
        if (num == 0) {
            System.out.println("El número no es primo");
        } else if (num == 1) {
            System.out.println("El número no es primo");
        } else if (primo == 1 ){
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }
}

