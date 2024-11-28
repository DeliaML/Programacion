import java.util.Scanner;

public class Ejercicio5 {

    public static void isTabla(int num) {

        System.out.println(num + " * " + 1 + " = " + num);
        System.out.println(num + " * " + 2 + " = " + num * 2);
        System.out.println(num + " * " + 3 + " = " + num * 3);
        System.out.println(num + " * " + 4 + " = " + num * 4);
        System.out.println(num + " * " + 5 + " = " + num * 5);
        System.out.println(num + " * " + 6 + " = " + num * 6);
        System.out.println(num + " * " + 7 + " = " + num * 7);
        System.out.println(num + " * " + 8 + " = " + num * 8);
        System.out.println(num + " * " + 9 + " = " + num * 9);
        System.out.println(num + " * " + 10 + " = " + num * 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dame un número del 1 al 10");
        int mult = in.nextInt();
        while (mult < 1 || mult > 10) {
            System.out.println("El número tiene que ser del 1 al 10");
            mult = in.nextInt();
        }
        isTabla(mult);
    }
}
