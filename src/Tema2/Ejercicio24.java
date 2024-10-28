package Tema2;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Para dejar de evaluar introduce una nota mayor a 10 o menor a 0");
        int aprob = 0;
        int sus = 0;
        double nota = 0;
        while (nota <= 10 && nota >= 0) {
            System.out.println("Introduce una nota");
            nota = in.nextDouble();
            if (nota >= 5 &&! (nota > 10)) {
                aprob ++;
            } else if (nota < 5 &&! (nota < 0)) {
                sus ++;
            }
        }
        System.out.println("Hay " + aprob + " alumnos aprobados y " + sus + " alumnos suspendidos");
    }
}
