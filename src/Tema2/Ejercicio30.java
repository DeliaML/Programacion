package Tema2;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char exit = 'A';
        double numsum;
        double numres;
        double nummul;
        double numdiv;
        double nummod;
        //switch
        while (!(exit == 'Z')) {
            System.out.println("Introduce el primer numero");
            double num1 = in.nextDouble();
            System.out.println("Introduce la operacion");
            char op = in.next().charAt(0);
            System.out.println("Introduce el segundo numero");
            double num2 = in.nextDouble();
            if (op == '+') {
                numsum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " es igual a " + numsum);
            } else if (op == '-') {
                numres = num1 - num2;
                System.out.println(num1 + " - " + num2 + " es igual a " + numres);
            } else if (op == '*') {
                nummul = num1 * num2;
                System.out.println(num1 + " * " + num2 + " es igual a " + nummul);
            } else if (op == '/') {
                numdiv = num1 / num2;
                System.out.println(num1 + " / " + num2 + " es igual a " + numdiv);
            } else if (op == '%') {
                nummod = num1 % num2;
                System.out.println(num1 + " % " + num2 + " es igual a " + nummod);
            } else {
                System.out.println("Introduce un operador valido");
            }
            System.out.println("Pulsa Z si quieres salir");
            exit = in.next().charAt(0);
        }
    }
}

