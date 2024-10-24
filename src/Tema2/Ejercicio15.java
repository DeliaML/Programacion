package Tema2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el mes");
        int Mes = in.nextInt();
        System.out.println("Dime el año");
        int Anho = in.nextInt();
        if (Mes > 12) {
            System.out.println("El mes es invalido");
        }
        if (Mes == 1 || Mes == 3 || Mes == 5 || Mes == 7 || Mes == 8 || Mes == 10 || Mes == 12) {
            System.out.println("El mes " + Mes + " tiene 31 dias");
        } else if (Mes == 4 || Mes == 6 || Mes == 9 || Mes == 11) {
            System.out.println("El mes " + Mes + " tiene 30 dias");
        } else if (Anho % 4 == 0 &&! (Anho % 100 == 0) || Anho % 400 == 0 && Mes == 2) {
            System.out.println("El mes " + Mes + " tiene 29 dias");
        } else if (Mes == 2) {
            System.out.println("El mes " + Mes + " tiene 28 dias");
        }
    }
}
