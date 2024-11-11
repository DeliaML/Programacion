package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int loteria = random.nextInt(100000);
        System.out.println("Introduce numeros del 0 al 99.999");
        //for
        System.out.println("Introduce el primer numero");
        int guess1 = in.nextInt();
        if (guess1 == loteria) {
            System.out.println("¡Has ganado!");
        } else {
            System.out.println("Has fallado");
        }
        System.out.println("Introduce el segundo numero");
        int guess2 = in.nextInt();
        if (guess2 == loteria) {
            System.out.println("Has ganado!");
        } else {
            System.out.println("Has fallado");
        }System.out.println("Introduce el tercer numero");
        int guess3 = in.nextInt();
        if (guess3 == loteria) {
            System.out.println("Has ganado!");
        } else {
            System.out.println("Has fallado");
        }System.out.println("Introduce el cuarto numero");
        int guess4 = in.nextInt();
        if (guess4 == loteria) {
            System.out.println("Has ganado!");
        } else {
            System.out.println("Has fallado");
        }System.out.println("Introduce el quinto numero");
        int guess5 = in.nextInt();
        if (guess5 == loteria) {
            System.out.println("Has ganado!");
        } else {
            System.out.println("Has fallado");
        }
    }
}
