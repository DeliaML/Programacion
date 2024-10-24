package Tema2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Damé 3 números");
        double Num1 = in.nextDouble();
        double Num2 = in.nextDouble();
        double Num3 = in.nextDouble();
        double Ord1 = 0;
        double Ord2 = 0;
        double Ord3 = 0;
        if (Num1 >= Num2 && Num2 >= Num3) {
            Ord1 = Num1;
            Ord2 = Num2;
            Ord3 = Num3;
        } else if (Num2 > Num1 && Num1 >= Num3) {
            Ord1 = Num2;
            Ord2 = Num1;
            Ord3 = Num3;
        } else if (Num3 > Num1 && Num1 >= Num2) {
            Ord1 = Num3;
            Ord2 = Num1;
            Ord3 = Num2;
        } else if (Num1 >= Num3 && Num3 > Num2) {
            Ord1 = Num1;
            Ord2 = Num3;
            Ord3 = Num2;
        } else if (Num2 >= Num3 && Num3 > Num1) {
            Ord1 = Num2;
            Ord2 = Num3;
            Ord3 = Num1;
        } else if (Num3 > Num2 && Num2 > Num1) {
            Ord1 = Num3;
            Ord2 = Num2;
            Ord3 = Num1;
        }
        System.out.println(Ord1 + " " + Ord2 + " " + Ord3);
    }
}
