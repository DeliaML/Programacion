package Tema2;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 0 para calcular la superficie y perimetro de un cuadrado, 1 para la superficie y el perimetro de un cuadrado y 2 para la superficie de un triangulo");
        int Resp = in.nextInt();
        double Lado;
        double Base;
        double Altura;
        double Sup;
        double Per;
        if (Resp == 0) {
            System.out.println("Introduce el tamaño del Lado");
            Lado = in.nextDouble();
            Sup = Lado * Lado;
            Per = Lado * 4;
            System.out.println("La superficie del cuadrado es " + Sup + " y el perimetro es " + Per);
        } else if (Resp == 1) {
            System.out.println("Introduce el tamaño de la base");
            Base = in.nextDouble();
            System.out.println("Introduce el tamaño de la altura");
            Altura = in.nextDouble();
            Sup = Base * Altura;
            Per = (Base * 2) + (Altura * 2);
            System.out.println("La superficie del rectangulo es " + Sup + " y el perimetro es " + Per );
        } else if (Resp == 2) {
            System.out.println("Introduce el tamaño del Lado");
            Lado = in.nextDouble();
            Sup = Lado * Lado / 2;
            Per = Lado * 3;
            System.out.println("La superficie del triangulo es " + Sup + " y el perimetro es " + Per);
        } else {
            System.out.println("La respuesta no es valida");
        }
    }
}
