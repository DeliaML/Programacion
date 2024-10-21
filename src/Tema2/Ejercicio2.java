package Tema2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la base");
        double base = in.nextDouble();
        System.out.println("Introduce la altura");
        double altura = in.nextDouble();
        System.out.println("El Área del cuadrado es " + (base * altura) + " y el perímetro es " + ((base * 2 ) + (altura *2)));
    }
}

