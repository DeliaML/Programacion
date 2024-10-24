package Tema2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime cuantas personas sois");
        int Per = in.nextInt();
        System.out.println("Dime cuantos dias vais a estar");
        int Night = in.nextInt();
        int Disc = 0;
        double Price = Per * Night * 15;
        if (Per >= 5 && Night >= 7) {
            Disc = 1;
        }
        if (Disc == 0) {
            System.out.println("El precio de la estancio son " + Price + " Euros");
        } else {
            Price = Price - (Price * 25 / 100);
            System.out.println("El precio de la estancio son " + Price  + " Euros");
        }
    }
}
