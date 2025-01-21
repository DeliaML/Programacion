import java.util.Random;
import java.util.Scanner;

public class Matrozca {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[][] sitio = new int[5][5];
        int mosca1 = random.nextInt(5);
        int mosca2 = random.nextInt(5);
        while (mosca1 == 0) mosca1 = random.nextInt(5);
        while (mosca2 == 0) mosca2 = random.nextInt(5);
        sitio[mosca1][mosca2] = 1;
        while (sitio[mosca1][mosca2] == 1) {
            System.out.println("Introduce un número del 1 al 4");
            int golpe1 = in.nextInt();
            while (golpe1 < 1 || golpe1 > 4) {
                System.out.println("Introduce un número del 1 al 4");
                golpe1 = in.nextInt();
            }
            System.out.println("Introduce otro número del 1 al 4");
            int golpe2 = in.nextInt();
            while (golpe2 < 1 || golpe2 > 4) {
                System.out.println("Introduce otro número del 1 al 4");
                golpe2 = in.nextInt();
            }
            if (golpe1 == mosca1 && golpe2 == mosca2) {
                System.out.println("Has matado a la mosca");
                sitio[mosca1][mosca2] --;
            } else if (golpe1 == mosca1 - 1 && golpe2 == mosca2 || golpe1 == mosca1 + 1 && golpe2 == mosca2|| golpe2 == mosca2 - 1 && golpe1 == mosca1|| golpe2 == mosca2 +1 && golpe1 == mosca1) {
                System.out.println("La mosca estaba cerca y se ha asustado");
                int viejomosca1 = mosca1;
                int viejomosca2 = mosca2;
                sitio [mosca1][mosca2] = 0;
                mosca1 = random.nextInt(5);
                while (mosca1 == 0 || mosca1 == viejomosca1 || mosca1 == golpe1) {
                    mosca1 = random.nextInt(5);
                }
                mosca2 = random.nextInt(5);
                sitio[mosca1][mosca2] = 1;
                while (mosca2 == 0 || mosca2 == viejomosca2 || mosca2 == golpe2) {
                    sitio[mosca1][mosca2] = 0;
                    mosca2 = random.nextInt(5);
                    sitio[mosca1][mosca2] = 1;
                }

            } else System.out.println("Hay no estaba la mosca");
        }
    }
}

