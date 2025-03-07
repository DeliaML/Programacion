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

        String d = "";
        for (int i = 0; i < b.length(); i++) {
            if (a.charAt(i) == c) {
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

            case 1:

                System.out.println(" o");


                break;

            case 2:

                System.out.println(" o");
                System.out.println(" |");

                break;

            case 3:

                System.out.println(" o");
                System.out.println("/|");

                break;

            case 4:

                System.out.println(" o");
                System.out.println("/|\\\n");

                break;

            case 5:

                System.out.println(" o");
                System.out.println("/|\\\n");
                System.out.println("/");

                break;

            case 6:

                System.out.println(" o");
                System.out.println("/|\\\n");
                System.out.println("/ \\");
        }
    }

    public static boolean ahorcadoLetter(String a, char b) {

        for (int i = 0; i < a.length(); i ++) {
            if (a.charAt(i) == b) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String juego;
        int con = 0;
        char letra;
        boolean letter;
        boolean win = false;
        System.out.println("Introduce una frase o palabra");
        String solucion = in.nextLine();
        solucion = solucion.toUpperCase();
        for (int i = 0; i < 20; i++) System.out.println(" ");
        juego = buildJuego(solucion);
        while (!win && con < 6) {
            System.out.println("Introduce un caracter (Siempre en mayuscula a no ser que no sea una letra)");
            letra = in.next().charAt(0);
            juego = printJuego(solucion, juego, letra);
            win = ahorcadoJuego(solucion, juego);
            letter = ahorcadoLetter(juego, letra);
            if (!letter) con ++;
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
