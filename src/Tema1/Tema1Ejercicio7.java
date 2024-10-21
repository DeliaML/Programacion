package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número de un dado de 6 caras");
        int Num = in.nextInt();
        if (Num < 1 ||Num > 6) {
            System.out.println("Error");
        }
        if (Num == 1) {
            System.out.println("6");
        }
        if (Num == 2) {
            System.out.println("5");
        }
        if (Num == 3) {
            System.out.println("4");
        }
        if (Num == 4) {
            System.out.println("3");
        }
        if (Num == 5) {
            System.out.println("2");
        }
        if (Num == 6) {
            System.out.println("1");
        }


    }
}
