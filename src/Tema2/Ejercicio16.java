package Tema2;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la cantidad de dinero");
        double Money = in.nextDouble();
        System.out.println("Introduce D para cambiar de euros a dolares y E para cambiar de dolares a euros");
        char Moneda = in.next().charAt(0);
        switch (Moneda) {
            case 'D':
                System.out.println(Money + " en dolares es " + Money * 1.08);
                break;
            case 'E':
                System.out.println(Money + " en euros es " + Money * 0.92);
                break;
            default:
                System.out.println("No has introducido un carácter valido");
        }
    }
}
