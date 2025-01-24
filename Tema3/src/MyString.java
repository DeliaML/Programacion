import java.util.Arrays;
import java.util.Scanner;

public class MyString {

    public static String invMax(String a) {

        String b = "";
        for (int i = 1; i < a.length(); i++) {
            b += a.charAt(a.length() - i);
        }
        b += a.charAt(0);
        b = b.toUpperCase();
        return b;
    }

    public static int vocalReturn(String a) {

        int cont = 0;
        for (int i = 0; i < a.length(); i ++) {
            switch (a.charAt(i)) {
                case 'a','e','i','o','u'->{cont ++;}
            }
        }
        return cont;
    }

    public static String maxWord(String a) {

        String[] b;
        b = a.split(" ");
        String c = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i].length() > c.length() ) {
                c = b[i];
            }
        }
        return c;
    }

    public static int stringRepeat(String a, String b) {

        String c = (Arrays.toString(a.split(b)));
        int d = 0;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == ',') {
                d ++;
            }
        }
        return d;
    }

    public static int numWords(String a) {

        int d = 1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                d ++;
            }
        }
        return d;
    }

    public static String numTelefono(char[] a) {

        return "(+" + a[0] + a[1] + ")-" + a[2] + a[3] + a[4] + "-" + a[5] + a[6] + a[7] + "-" + a[8] + a[9] + a[10];
    }

    public static void vocalCont(String a) {


        int acont = 0;
        int econt = 0;
        int icont = 0;
        int ocont = 0;
        int ucont = 0;
        for (int i = 0; i < a.length(); i ++) {
            switch (a.charAt(i)) {
                case 'a':
                    acont ++;
                    break;
                case 'e':
                    econt ++;
                    break;
                case 'i':
                    icont ++;
                    break;
                case 'o':
                    ocont ++;
                    break;
                case 'u':
                    ucont ++;
            }
        }
        System.out.println(a);
        System.out.println("a " + acont + " " + "*".repeat(acont));
        System.out.println("e " + econt + " " + "*".repeat(econt));
        System.out.println("i " + icont + " " + "*".repeat(icont));
        System.out.println("o " + ocont + " " + "*".repeat(ocont));
        System.out.println("u " + ucont + " " + "*".repeat(ucont));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String trash;
        System.out.println("Introduce el número de la actividad que quieres");
        System.out.println("1. invMax");
        System.out.println("2. vocalReturn");
        System.out.println("3. maxWord");
        System.out.println("4. stringRepeat");
        System.out.println("5. numWords");
        System.out.println("6. numTelefono");
        System.out.println("7. vocalCont");
        int res = in.nextInt();
        while (res < 1 || res > 7) {
            System.out.println("El número tiene que ser del 1 al 7");
            System.out.println("1. invMax");
            System.out.println("2. vocalReturn");
            System.out.println("3. maxWord");
            System.out.println("4. stringRepeat");
            System.out.println("5. numWords");
            System.out.println("6. numTelefono");
            System.out.println("7. vocalCont");
            res = in.nextInt();
        }
        switch (res) {

            case 1:

                System.out.println("Introduce una cadena");
                trash = in.nextLine();
                String cadena1 = in.nextLine();
                System.out.println("Tu cadena al revés es");
                System.out.println(invMax(cadena1));

                break;

            case 2:

                System.out.println("Introduce una cadena");
                trash = in.nextLine();
                String cadena2 = in.nextLine();
                System.out.println("La cantidad de vocales que tienes es " + vocalReturn(cadena2));

                break;

            case 3:

                System.out.println("Introduce una cadena");
                trash = in.nextLine();
                String cadena3 = in.nextLine();
                System.out.println("La palabra más larga de tu cadena es " + maxWord(cadena3));

                break;

            case 4:

                System.out.println("Introduce una cadena");
                trash = in.nextLine();
                String cadena4 = in.nextLine();
                System.out.println("Introduce otra cadena");
                String cadena5 = in.nextLine();
                System.out.println("La cantidad de veces que se repite la segunda cadena en la primera es " + stringRepeat(cadena4, cadena5));

                break;

            case 5:

                System.out.println("Introduce una cadena");
                trash = in.nextLine();
                String cadena6 = in.nextLine();
                System.out.println("La cantidad de palabras en tu cadena es " + numWords(cadena6));

                break;

            case 6:

                char[] r = new char[12];
                System.out.println("Introduce un número de teléfono");
                for (int i = 0; i < r.length - 1; i ++) {
                    System.out.println("Introduce un número");
                    r[i] = in.next().charAt(0);
                    while (r[i] == '0' || r[i] == '1' || r[i] == '2'|| r[i] == '3' || r[i] == '4' || r[i] == '5' || r[i] == '6' || r[i] == '7' || r[i] == '8' || r[i] == '9') {
                        i ++;
                    }
                    i --;
                }
                System.out.println("Tu número de teléfono es " + numTelefono(r));

                break;

            case 7:

                System.out.println("Introduce una cadena");
                trash = in.nextLine();
                String cadena7 = in.nextLine();
                vocalCont(cadena7);
        }
    }
}
