package Tema2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la base");
        double base = in.nextDouble();
        System.out.println("Introduce la altura");
        double altura = in.nextDouble();
        System.out.println("El Área del triangulo es " + (base * altura / 2) + " y el perímetro es " + ((base * 3)));
    }
}

