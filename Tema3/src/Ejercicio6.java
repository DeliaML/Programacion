import java.util.Scanner;

public class Ejercicio6 {
//pasar de 10 l´ineas a 1. Usa 2 fors
    public static void isTabla10() {

        for (int mult = 1; mult <= 10; mult ++) {
            System.out.println("-----------------");
            for (int cont = 1; cont <= 10; cont ++) System.out.println(mult + " * " + cont + " = " + mult * cont);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        isTabla10();
    }
}
