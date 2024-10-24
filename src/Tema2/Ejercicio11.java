package Tema2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame 3 números");
        int Num1 = in.nextInt();
        int Num2 = in.nextInt();
        int Num3 = in.nextInt();
        if ((Num1 == Num2 + 1) && (Num2 == Num3 + 1)) {
            System.out.println("Los números son consecutivos");
        } else {
            System.out.println("Los números no son consecutivos");
        }
    }
}
