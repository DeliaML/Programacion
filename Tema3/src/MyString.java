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
        System.out.println("Introduce una cadena");
        String a = in.nextLine();
        System.out.println("Introduce otra cadena");
        String c = in.nextLine();
        char[] r = new char[12];
        for (int i = 0; i < r.length - 1; i ++) {
            System.out.println("Introduce un número");
            r[i] = in.next().charAt(0);
            while (r[i] == '0' || r[i] == '1' || r[i] == '2'|| r[i] == '3' || r[i] == '4' || r[i] == '5' || r[i] == '6' || r[i] == '7' || r[i] == '8' || r[i] == '9') {
                i ++;
            }
            i --;
        }
        String b = invMax(a);
        System.out.println(b);
        System.out.println(vocalReturn(a));
        System.out.println(Arrays.toString(a.split(" ")));
        System.out.println(maxWord(a));
        System.out.println(stringRepeat(a, c));
        System.out.println(numTelefono(r));

    }
}
