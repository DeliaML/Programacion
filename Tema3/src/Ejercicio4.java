import java.util.Scanner;

public class Ejercicio4 {

    public static void showMenu() {

        System.out.println("pulsa 1 para cambiar de euros a dolares");
        System.out.println("pulsa 2 para cambiar de dolares a euros");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        showMenu();
        int result = in.nextInt();
        while (result < 1 || result > 2) {
            System.out.println("Introduce 1 o 2");
            showMenu();
            result = in.nextInt();
        }
        if (result == 1) {
            System.out.println("Dame una cantidad en euros");
            double euro = in.nextDouble();
            double dollar = euro2dollar(euro);
            System.out.println("La misma cantidad en dolares es " + dollar);
        } else {
            System.out.println("Dame una cantidad en dolares");
            double dollar = in.nextDouble();
            double euro = dollar2euro(dollar);
            System.out.println("La misma cantidad en euros es " + euro);
        }
    }


    public static double euro2dollar(double num) {

        num = num * 1.05;
        return num;
    }

    public static double dollar2euro(double num) {

        num = num * 0.95;
        return num;
    }
}

