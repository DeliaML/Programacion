import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Minas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("No introduzcas el mismo número 2 veces o perderas");
        int con = 0;
        int mina1 = random.nextInt(21);
        while (mina1 == 0) mina1 = random.nextInt(21);
        int mina2 = random.nextInt(21);
        while (mina2 == 0 || mina2 ==  mina1) mina2 = random.nextInt(21);
        int mina3 = random.nextInt(21);
        while (mina3 == 0 || mina3 == mina2 || mina3 == mina1) mina3 = random.nextInt(21);
        int mina4 = random.nextInt(21);
        while (mina4 == 0 || mina4 == mina3 || mina4 == mina2 || mina4 == mina1) mina4 = random.nextInt(21);
        int mina5 = random.nextInt(21);
        while (mina5 == 0 || mina5 == mina4 || mina5 == mina3 || mina5 == mina2 || mina5 == mina1) mina5 = random.nextInt(21);
        int mina6 = random.nextInt(21);
        while (mina6 == 0 || mina6 == mina5 || mina6 == mina4 || mina6 == mina3 || mina6 == mina2 || mina6 == mina1) mina6 = random.nextInt(21);
        int[] juego = new int[21];
        juego[mina1] = 3;
        juego[mina2] = 3;
        juego[mina3] = 3;
        juego[mina4] = 3;
        juego[mina5] = 3;
        juego[mina6] = 3;
        juego[0] = 0;
        for (int i = 1; i < 20; i ++) {
            if (juego[i - 1] == 3 && juego[i + 1] ==3 && juego[i] != 3) {
                juego[i] = 2;
            } else if (juego[i - 1] == 3 && juego[i] != 3) {
                juego[i] = 1;
            } else if (juego[i + 1] == 3 && juego[i] != 3) {
                juego[i] = 1;
            } else if (juego[i] != 3) juego[i] = 0;
        }
        if (juego[19] == 3 && juego[20] != 3) {
            juego[20] = 1;
        } else if (juego[19] != 3 && juego[20] !=3) juego[20] = 1;
        int[] viejojuego;
        viejojuego = juego;
        int[] otrojuego = new int[21];
        while (viejojuego[0] < 14) {
            System.out.println("Introduce un numero del 1 al 20");
            int guess = in.nextInt();
            while (guess < 1 || guess > 20) {
                System.out.println("Introduce un numero del 1 al 20");
                guess = in.nextInt();
            }
            if (viejojuego[guess] == 3) {
                System.out.println("Había una mina");
                con ++;
                viejojuego[0] = 14;
            } else {
                System.out.println("En esa casilla había un " + viejojuego[guess]);
                viejojuego[0] ++;
                otrojuego[guess] = viejojuego[guess];
                viejojuego[guess] = 3;
            }
        }
        otrojuego[mina1] = 3;
        otrojuego[mina2] = 3;
        otrojuego[mina3] = 3;
        otrojuego[mina4] = 3;
        otrojuego[mina5] = 3;
        otrojuego[mina6] = 3;
        if (con == 0) {
            System.out.println("Has ganado!!!!");
            System.out.println("Ignora el primer numero");
            System.out.println(Arrays.toString(otrojuego));
        }
        }
    }

