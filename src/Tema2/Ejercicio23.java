package Tema2;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = 0;
        double media = 0;
        double cont = 0;
        while (num >= 0) {
            media = media + num;
            System.out.println("Introduce un número");
            num = in.nextDouble();
            if (num >= 0) {
                cont ++;
            }
        }
        double res = media / cont;
        System.out.println("La media de los números introducidos es " + res);
    }
}
