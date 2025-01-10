import java.util.Random;
import java.util.Scanner;

public class Mosca {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[] sitio = new int[16];
        int mosca = random.nextInt(16);
        while (mosca == 0) mosca = random.nextInt(16);
        sitio[mosca] = 1;
        while (sitio[mosca] == 1) {
            System.out.println("Introduce un número del 1 al 15");
            int golpe = in.nextInt();
            while (golpe < 1 || golpe > 15) {
                System.out.println("Introduce un número del 1 al 15");
                golpe = in.nextInt();
            }
            if (golpe == mosca) {
                System.out.println("Has matado a la mosca");
                sitio[mosca] --;
            } else if (golpe == mosca - 1 || golpe == mosca + 1) {
                System.out.println("La mosca estaba cerca y se ha asustado");
                int viejomosca = mosca;
                sitio [mosca] = 0;
                mosca = random.nextInt(16);
                sitio[mosca] = 1;
                while (mosca == 0 || mosca == viejomosca || mosca == golpe) {
                    sitio [mosca] = 0;
                    mosca = random.nextInt(16);
                    sitio[mosca] = 1;
                }
            } else System.out.println("Hay no estaba la mosca");
        }
    }
}
