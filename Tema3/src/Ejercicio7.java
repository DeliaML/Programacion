import java.util.Scanner;

public class Ejercicio7 {

    public static boolean isPrimo(int primo) {
        //revisa. usa booleanos
        int cond = 0;
        int cont = primo;

        while (cont > 0) {
            if (primo % cont == 0) {
                cond++;

            }
            cont--;
        }
        return cond == 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        while (num != 0) {
            System.out.println("Pulsa 0 para salir");
            System.out.println("Introduce un número");
            num = in.nextInt();
            boolean res = isPrimo(num);
            if (res) System.out.println("El número es primo");
            else System.out.println("El número no es primo");
        }
    }
}
