package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionDivision {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un entero");
        int num = 0;
        System.out.println("Introduce otro entero");
        int div = 0;
        int res = 0;
        try {
            num = in.nextInt();
        } catch(InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Valor introducido incorrecto");
        }
        try {
            div = in.nextInt();
        } catch(InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Valor introducido incorrecto");
        }
        try {
            res = num / div;
        } catch(ArithmeticException e){

        }
    }
}
