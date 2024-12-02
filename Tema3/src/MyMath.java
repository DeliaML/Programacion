import java.util.Scanner;

public class MyMath {

    public static double squarePerimeter(double side) {

        return side * 4;
    }

    public static double squareArea(double side) {

        return side * side;
    }

    public static double rectanglePerimeter(double base, double height) {

        return (base * 2) + (height * 2);
    }

    public static double rectangleArea(double base, double height) {

        return base * height;
    }

    public static double circlePerimeter(double rad) {

        return 3.14 * 2 *rad;
    }

    public static double circleArea(double rad) {

        return 3.14 * (rad * rad);
    }

    public static boolean siPrimo(int num) {

        int primcont = 0;
        int cont = num;
        while (cont > 0) {
            if (num % cont == 0) {
                primcont ++;
            }
            cont --;
        }
        return primcont == 2;
    }

    public static boolean noPrimo(int num) {

        int primcont = 0;
        int cont = num;
        while (cont > 0) {
            if (num % cont == 0) {
                primcont ++;
            }
            cont --;
        }
        return primcont != 2;
    }

    public static int numCifra(int num) {

        int cont = 1;
        if (num > 0) {
            while (num >= 10) {
                num = num / 10;
                cont ++;
            }
        }
        if (num < 0) {
            while (num <= -10) {
                num = num / 10;
                cont ++;
            }
        }
        return cont;
    }

    public static int cifraPar(int num) {

        int cont = 0;
        if (num == 0) return 1;
        if (num > 0) {
            while (num >= 10) {
                if (num % 2 == 0) cont ++;
                num = num / 10;

            }
            if (num % 2 == 0) cont ++;
        }
        if (num < 0) {
            while (num <= -10) {
                if (num % 2 == 0) cont ++;
                num = num / 10;

            }
            if (num % 2 == 0) cont ++;
        }
        return cont;
    }

    public static int cifraImpar(int num) {

        int cont = 0;
        if (num == 0) return 0;
        if (num > 0) {
            while (num >= 10) {
                if (num % 2 == 1) cont ++;
                num = num / 10;

            }
            if (num % 2 == 1) cont ++;
        }
        if (num < 0) {
            while (num <= -10) {
                if (num % 2 == -1) cont ++;
                num = num / 10;

            }
            if (num % 2 == -1) cont ++;
        }
        return cont;
    }

    public static int numFact(int num) {
//intenar hacer con for
        if (num < 0) return 0;
        if (num == 0 || num == 1) return 1;
        int cont = 1;
        int fact = num;
        while (cont < num) {
            fact = fact * cont;
            cont ++;
        }
        return fact;
    }

    public static int recFact(int n) {
        if (n == 0) return 1;
        else {
            return n * recFact(n - 1);
        }
    }

    public static int ecuacionDet(int a, int b, int c) {

        double d = (b * b) - (4 * a * c);
        if (d > 0) return 2;
        else if (d == 0) return 1;
        else return 0;
    }

    public static int sumaCifra(int num, int nom) {

        int cont = 1;
        if (num > 0) {
            while (num >= 10) {
                num = num / 10;
                cont ++;
            }
        }
        if (num < 0) {
            while (num <= -10) {
                num = num / 10;
                cont ++;
            }
        }
        int cint = 1;
        if (nom > 0) {
            while (nom >= 10) {
                nom = nom / 10;
                cint ++;
            }
        }
        if (nom < 0) {
            while (nom <= -10) {
                nom = nom / 10;
                cint ++;
            }
        }
        return cont + cint;
    }


    public static void main(String[] args) {

    }
}
