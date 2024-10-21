package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio9 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        int num1 = in.nextInt();
        System.out.println("Dame otro número");
        int num2 = in.nextInt();
        int numinf;
        int numsup;
        if (num1 > num2) {
            numinf = num2;
            numsup = num1;
        } else {
            numsup = num2;
            numinf = num1;
        }

        System.out.println("La suma entre ambos da " + (numsup + numinf));
        System.out.println("La resta entre ambos da " + (numsup - numinf));
        System.out.println("La multiplicación entre ambos da " + (numsup * numinf));
        System.out.println("La división entre ambos da " + (numsup / numinf));
        System.out.println("El resto entre ambos da " + (numsup % numinf));
    }
}
