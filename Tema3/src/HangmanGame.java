import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HangmanGame {

    public static String buildJuego(String a) {

        String b = "";
        char c;
        for (int i = 0; i < a.length(); i ++) {
            c = a.charAt(i);
            if (c == ' ') {
                b += ' ';
            } else {
                b += '_';
            }
        }

        return b;
    }

    public static String printJuego(String a, String b, char c) {

        a = Arrays.toString(a.split(String.valueOf(c)));
        String d = "";
        for (int i = 0; i < b.length(); i++) {
            if (a.charAt(i) == ',') {
                d += c;
            } else {
                d += b.charAt(i);
            }
        }

        return d;
    }

    public static boolean ahorcadoJuego(String a, String b) {

        return Objects.equals(a, b);
    }

    public static void ahorcadoPrint(int con) {

        switch (con) {
            case 0:
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String juego = "";
        int con = 0;
        char letra;
        boolean win = false;
        System.out.println("Introduce una frase o palabra");
        String solucion = in.nextLine();
        for (int i = 0; i < 20; i++) System.out.println(" ");
        juego = buildJuego(solucion);
        while (!win || con < 6) {
            System.out.println("Introduce un caracter");
            letra = in.next().charAt(0);
            juego = printJuego(solucion, juego, letra);
            win = ahorcadoJuego(solucion, juego);
            if (!win) con ++;
            ahorcadoPrint(con);
            System.out.println(juego);
        }
        if (win) {
            System.out.println("Has Ganado!!!");
        } else {
            System.out.println("Has Perdido");
        }
    }
}
