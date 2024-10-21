package Tema2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 3 números");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();
        double media1 =  (num1 + num2 + num3) / 3;
        int media2 = (int) (num1 + num2 + num3) / 3;
        System.out.println("La media con decimales es " + media1);
        System.out.println("La media sin decimales es " + media2);
    }
}
