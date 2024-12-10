import java.util.Scanner;

public class Ejercicio5 {

    public static void isTabla(int num) {
        //revisar, pasar de 10 líneas a 1
        for (int cont = 1; cont <= 10;cont ++) System.out.println(num + " * " + cont + " = " + num * cont);
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
