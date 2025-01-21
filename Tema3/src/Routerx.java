import java.util.Arrays;
import java.util.Scanner;

public class Routerx {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] hotel = new int[12][5];
        System.out.println("Introduce la potencia de tu router");
        int router = in.nextInt();
        System.out.println("Introduce la planta de tu planta (0-11)");
        int planta = in.nextInt();
        while (planta < 0 || planta > 11) {
            System.out.println("La planta debe ser del 0 al 11");
            planta = in.nextInt();
        }
        System.out.println("Introduce el número de tu habitación (1-5)");
        int habitacion = in.nextInt();
        while (habitacion < 1 || habitacion > 5) {
            System.out.println("La habitación debe ser del 1 al 5");
            habitacion = in.nextInt();
        }
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                int distance = Math.abs(i - planta) + Math.abs(j - habitacion);
                if (distance <= router) {
                    int coverageValue = router - distance;
                    hotel[i][j] = Math.max(hotel[i][j], coverageValue);
                }
            }

        }
        System.out.println("Esta es la potencia del router dependiendo de donde se encuentre");
        System.out.println(Arrays.deepToString(hotel));
    }
}

