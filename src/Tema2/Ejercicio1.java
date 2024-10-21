package Tema2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.println("Introduce el lado");
    double lado = in.nextDouble();
    System.out.println("El Área del cuadrado es " + (lado * lado) + " y el perímetro es " + (lado * 4));
    }
}
