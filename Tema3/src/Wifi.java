import java.util.Arrays;
import java.util.Scanner;

public class Wifi {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] habitaciones = new int[21];
        int cont = 1;
        System.out.println("Dime el número de tu habitación (1-20)");
        int habitacion = in.nextInt();
        while (habitacion < 1 || habitacion > 20) {
            System.out.println("La habitación es del 1 al 20");
            habitacion = in.nextInt();
        }
        System.out.println("Introduce la potencia de tu router (1-6)");
        int router = in.nextInt();
        while (router < 1 || router > 6) {
            System.out.println("La potencia del router tiene que ser del 1 al 6");
            router = in.nextInt();
        }
        habitaciones[habitacion] = router;
        router --;
        while (router > 0) {
            if (habitacion - cont > 0 && habitacion + cont < 21 && cont != 0) {
                habitaciones[habitacion + cont] = router;
                habitaciones[habitacion - cont] = router;
            } else if (habitacion - cont <= 0) {
                habitaciones[habitacion + cont] = router;
            } else {
                habitaciones[habitacion - cont] = router;
            }
            cont ++;
            router --;
        }
        System.out.println("Esta será la potencia del router en cada habitación (ignora el primer 0)");
        System.out.println(Arrays.toString(habitaciones));
    }
}
