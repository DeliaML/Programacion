import java.util.Random;
import java.util.Scanner;

public class Lingo {

    public static String wordGenerator(int a) {

        switch (a) {

            case 0: return "hueso";
            case 1: return "hogar";
            case 2: return "bacon";
            case 3: return "papel";
            case 4: return "lapiz";
            case 5: return "mosca";
            case 6: return "perro";
            case 7: return "verde";
            case 8: return "negro";
            case 9: return "silla";
            default: return "tener";
        }
    }

    public static String jueLingo(String a, String b) {

        String c = "";
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == a.charAt(i)) {
                c += b.charAt(i);
            } else if (b.charAt(i) == a.charAt(0) || b.charAt(i) == a.charAt(1) || b.charAt(i) == a.charAt(2) || b.charAt(i) == a.charAt(3) || b.charAt(i) == a.charAt(4)) {
                c += "*";
            } else c += "-";
        }
        return c;
    }

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(9);
        String word = wordGenerator(num);
        boolean win = false;
        int cont = 0;
        while (!win && cont < 5) {
            System.out.println("Introduce una palabra de 5 letras");
            String guess = in.nextLine();
            while (guess.length() != 5) {
                System.out.println("La palabra tiene que ser de 5 letras");
                guess = in.nextLine();
            }
            System.out.println(jueLingo(word, guess));
            if (word.equals(guess)) win = true;
            cont ++;
        }
        if (win) System.out.println("Has ganado!!!");
        else System.out.println("Has perdido");
    }
}
