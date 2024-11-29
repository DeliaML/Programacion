import java.util.Scanner;

public class Ejercicio8 {

    public static boolean dayCalc(int day, int month, int year) {
        int maxday;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            maxday = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxday = 30;
        } else if ((year % 4 == 0 &&! (year % 100 == 0) || year % 400 == 0 && month == 2)) {
            maxday = 29;
        } else {
            maxday = 28;
        }
        return day <= maxday;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Dame el dia del més");
        int dia = in.nextInt();
        int anho = 1;
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
            anho = in.nextInt();
            while (anho < 0) {
                System.out.println("Introduce un año mayor a 0");
                anho = in.nextInt();
            }
        }
        boolean result = dayCalc(dia, mes, anho);
        if (result) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }
    }
}
