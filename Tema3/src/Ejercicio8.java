import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dame el dia del més");
        int dia = in.nextInt();
        while (dia <= 0 || dia > 31) {
            System.out.println("Introduce un dia del 1 al 31");
            dia = in.nextInt();
        }
        System.out.println("Dame el mes");
        int mes = in.nextInt();
        while (mes <= 0 || mes > 12) {
            System.out.println("Introduce un mes del 1 al 12");
            mes = in.nextInt();
        }
        if (mes == 2) {
            System.out.println("Introduce un año");
            int anho = in.nextInt();
            while (anho < 0) {
                System.out.println("Introduce un año mayor a 0");
                anho = in.nextInt();
            }
        }
    }
}
