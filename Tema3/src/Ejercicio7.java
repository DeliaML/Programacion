import java.util.Scanner;

public class Ejercicio7 {

    public static void isPrimo(int primo) {
        //revisa. usa booleanos
        int cond = 0;
        int cont = primo;

        while (cont > 0) {
            if (primo % cont == 0) {
                cond++;

            }
            cont--;
        }
        if (primo == 1) {
            System.out.println(primo + " no es primo");
        } else if (cond == 2) {
            System.out.println(primo + " es primo");
        } else if (cond > 2) {
            System.out.println(primo + " no es primo");
        } else if (primo == 0) {
            System.out.println(primo + " no es primo");
        } else {
            System.out.println(primo + " es negativo");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        while (num != 0) {
            System.out.println("Pulsa 0 para salir");
            System.out.println("Introduce un número");
            num = in.nextInt();
            isPrimo(num);
        }
    }
}
