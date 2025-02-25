package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un entero");
        int num = 0;
        try {
            num = in.nextInt();
        } catch(InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Valor introducido incorrecto");
        }
        System.out.println("El numero introducido es: " + num);
    }
}
