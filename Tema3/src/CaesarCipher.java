import java.util.Scanner;

public class CaesarCipher {

    public static String encrypt(String a) {

        char[] b = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {

            b[i] = a.charAt(i);
        }
        String c = "";
        for (int i = 0; i < b.length; i++) {

            switch (b[i]) {
                case 'a', 'A': b[i] = 'B'; break;
                case 'b', 'B': b[i] = 'C'; break;
                case 'c', 'C': b[i] = 'D'; break;
                case 'd', 'D': b[i] = 'E'; break;
                case 'e', 'E': b[i] = 'F'; break;
                case 'f', 'F': b[i] = 'G'; break;
                case 'g', 'G': b[i] = 'H'; break;
                case 'h', 'H': b[i] = 'I'; break;
                case 'i', 'I': b[i] = 'J'; break;
                case 'j', 'J': b[i] = 'K'; break;
                case 'k', 'K': b[i] = 'L'; break;
                case 'l', 'L': b[i] = 'M'; break;
                case 'm', 'M': b[i] = 'N'; break;
                case 'n', 'N': b[i] = 'Ñ'; break;
                case 'ñ', 'Ñ': b[i] = 'O'; break;
                case 'o', 'O': b[i] = 'P'; break;
                case 'p', 'P': b[i] = 'Q'; break;
                case 'q', 'Q': b[i] = 'R'; break;
                case 'r', 'R': b[i] = 'S'; break;
                case 's', 'S': b[i] = 'T'; break;
                case 't', 'T': b[i] = 'U'; break;
                case 'u', 'U': b[i] = 'V'; break;
                case 'v', 'V': b[i] = 'W'; break;
                case 'w', 'W': b[i] = 'X'; break;
                case 'x', 'X': b[i] = 'Y'; break;
                case 'y', 'Y': b[i] = 'Z'; break;
                case 'z', 'Z': b[i] = 'A'; break;
                case '0': b[i] = '1'; break;
                case '1': b[i] = '2'; break;
                case '2': b[i] = '3'; break;
                case '3': b[i] = '4'; break;
                case '4': b[i] = '5'; break;
                case '5': b[i] = '6'; break;
                case '6': b[i] = '7'; break;
                case '7': b[i] = '8'; break;
                case '8': b[i] = '9'; break;
                case '9': b[i] = '0'; break;
            }
            c += b[i];
        }
        return c;
    }

    public static String decrypt(String a) {

        char[] b = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {

            b[i] = a.charAt(i);
        }
        String c = "";
        for (int i = 0; i < b.length; i++) {

            switch (b[i]) {
                case 'A': b[i] = 'Z'; break;
                case 'B': b[i] = 'A'; break;
                case 'C': b[i] = 'B'; break;
                case 'D': b[i] = 'C'; break;
                case 'E': b[i] = 'D'; break;
                case 'F': b[i] = 'E'; break;
                case 'G': b[i] = 'F'; break;
                case 'H': b[i] = 'G'; break;
                case 'I': b[i] = 'H'; break;
                case 'J': b[i] = 'I'; break;
                case 'K': b[i] = 'J'; break;
                case 'L': b[i] = 'K'; break;
                case 'M': b[i] = 'L'; break;
                case 'N': b[i] = 'M'; break;
                case 'Ñ': b[i] = 'N'; break;
                case 'O': b[i] = 'Ñ'; break;
                case 'P': b[i] = 'O'; break;
                case 'Q': b[i] = 'P'; break;
                case 'R': b[i] = 'Q'; break;
                case 'S': b[i] = 'R'; break;
                case 'T': b[i] = 'S'; break;
                case 'U': b[i] = 'T'; break;
                case 'V': b[i] = 'U'; break;
                case 'W': b[i] = 'V'; break;
                case 'X': b[i] = 'W'; break;
                case 'Y': b[i] = 'X'; break;
                case 'Z': b[i] = 'Y'; break;
                case '0': b[i] = '9'; break;
                case '1': b[i] = '0'; break;
                case '2': b[i] = '1'; break;
                case '3': b[i] = '2'; break;
                case '4': b[i] = '3'; break;
                case '5': b[i] = '4'; break;
                case '6': b[i] = '5'; break;
                case '7': b[i] = '6'; break;
                case '8': b[i] = '7'; break;
                case '9': b[i] = '8'; break;
                case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z':
                    return "Este mensaje no esta encriptado";
            }
            c += b[i];
        }
        return c;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int res = 0;
        String trash;
        String mensaje = "";
        while (res >= 0 && res <= 2) {
            if (res == 0) {
                System.out.println("Introduce un mensaje");
                mensaje = in.nextLine();
            }
            if (res == 1) {
                 mensaje = encrypt(mensaje);
            }
            if (res == 2) {
                mensaje = decrypt(mensaje);
            }
            System.out.println("Este es tu mensaje");
            System.out.println(mensaje);
            System.out.println("Introduce 0 para cambiar el mensaje, 1 para encriptarlo o 2 para desencriptarlo");
            System.out.println("Introduce cualquier otro número para salir");
            res = in.nextInt();
            trash = in.nextLine();
        }
    }
}
