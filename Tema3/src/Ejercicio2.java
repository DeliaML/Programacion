import java.util.Scanner;

public class Ejercicio2 {

    public static boolean isAdult(int age) {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = in.nextInt();
        boolean result = isAdult(edad);
        if (result) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        System.out.println("Dame un numero");
        int num = in.nextInt();
        System.out.println(Ejercicio1.numberSign(num));
    }
}
