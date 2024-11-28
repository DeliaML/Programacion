import java.util.Scanner;

public class Ejercicio1 {

    public static int numberSign(int num1) {

        if (num1 > 0) {
            num1 = 1;
        }
        if (num1 < 0) {
            num1 = -1;
        }
        return num1;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dame un número");
        int num3 = in.nextInt();

        System.out.println(numberSign(num3));

    }
}

