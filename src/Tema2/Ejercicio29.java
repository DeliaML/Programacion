package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(2);
        int win = 0;
        while (win < 1) {
            System.out.println("Introduce un numero del 0 al 100");
            int resp = in.nextInt();
            if (resp < secret) {
                System.out.println("El  numero es mayor");
            } else if (resp > secret) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("¡Has acertado!");
                win ++;
            }
        }
    }
}
