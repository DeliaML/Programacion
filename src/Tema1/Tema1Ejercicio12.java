package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio12 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un año");
        int anho = in.nextInt();
        if (anho % 4 == 0 &&! (anho % 100 == 0) || anho % 400 == 0) {
            System.out.println("Tu año es bisiesto"); }
        else {
            System.out.println("Tu año no es bisiesto");
        }

    }



}
