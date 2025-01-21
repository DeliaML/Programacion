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

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String a = in.nextLine();
        System.out.println("Introduce otra cadena");
        String c = in.nextLine();
        String b = invMax(a);
        System.out.println(b);
        System.out.println(vocalReturn(a));
        System.out.println(Arrays.toString(a.split(" ")));
        System.out.println(maxWord(a));
        System.out.println(stringRepeat(a, c));
        System.out.println();
    }
}
