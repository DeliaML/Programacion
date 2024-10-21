package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio8 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número");
        int Num1 = in.nextInt();
        System.out.println("Introduce otro número");
        int Num2 = in.nextInt();
        if (Num1 == Num2) {
            System.out.println("Los 2 números son iguales");
        } else {
            if (Num1 > Num2) {
                System.out.println(Num1 + " Es mayor a " + Num2);
            } else {
                System.out.println(Num2 + " Es mayor a " + Num1);
            }
        }

    }
}
