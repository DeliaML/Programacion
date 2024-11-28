import java.util.Scanner;

public class Ejercicio3 {

    public static boolean validRadius(double num) {

        if (num < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static double calculateCircleArea(double num) {

        return 3.14 * (num * num);
    }

    public static double calculateCirclePerimeter(double num) {

        return 2 * 3.14 * num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame el radio");
        double rad = in.nextDouble();
        boolean result = validRadius(rad);
        while (!result) {
            System.out.println("El radio tiene que ser positivo");
            rad = in.nextDouble();
            result = validRadius(rad);
        }
        double area = calculateCircleArea(rad);
        double perimeter = calculateCirclePerimeter(rad);
        System.out.println("El area del circulo es " + area);
        System.out.println("El perimetro del circulo es " + perimeter);
    }
}
