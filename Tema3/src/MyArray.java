import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    public static void showArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static int maxReturn(int[] a) {

        int j = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > j) j = a[i - 1];
        }
        return j;
    }

    public static int minReturn(int[] a) {

        int j = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < j) j = a[i];
        }
        return j;
    }

    public static int mediaReturn(int[] a) {

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            j = a[i] + j;
        }
        j = j / a.length;
        return j;
    }

    public static boolean proveNum(int num, int[] a) {

        boolean truth = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) truth = true;
        }
        return truth;
    }

    public static int sumArray(int[] a, int[] b) {
        Random random = new Random();
        int i = random.nextInt(a.length);
        int j = random.nextInt(b.length);
        return a[i] + b[j];
    }

    public static int resArray(int[] a, int[] b) {
        Random random = new Random();
        int i = random.nextInt(a.length);
        int j = random.nextInt(b.length);
        return a[i] - b[j];
    }

    public static int prodEscalar(int[] a, int[] b) {

        int suma = 0;
        for (int i = 0; i < a.length || i < b.length; i++) {
            suma = suma + a[i] + b[i];
        }
        return suma;
    }

    public static int[] reverseArray(int[] a) {

        int num;
        for (int i = 1; i <= a.length / 2; i++) {
            num = a[i - 1];
            a[i - 1] = a[a.length - i];
            a[a.length - i] = num;
        }
        return a;
    }

    public static void switchArray(int[] a) {

        int num;
        for (int i = 1; i <= a.length / 2; i++) {
            num = a[i - 1];
            a[i - 1] = a[a.length - i];
            a[a.length - i] = num;
        }
        System.out.println(Arrays.toString(a));
    }

    public static boolean isCapicua(int[] a) {

        boolean capicua = true;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] != a[a.length - i]) capicua = false;
        }
        return capicua;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] first;
        int[] second = new int[0];
        int nem = 0;
        int[] fin;
        System.out.println("Introduce la función o procedimiento que quieres utilizar");
        System.out.println("1: showArray");
        System.out.println("2: maxReturn");
        System.out.println("3: minReturn");
        System.out.println("4: mediaReturn");
        System.out.println("5: proveEmpty");
        System.out.println("6: sumArray");
        System.out.println("7: resArray");
        System.out.println("8: prodEscalar");
        System.out.println("9: reverseArray");
        System.out.println("10: switchArray");
        System.out.println("11: isCapicua");
        int res = in.nextInt();
        while (res < 1 || res > 11) {
            System.out.println("Introduce un número del 1 al 11");
            System.out.println("1: showArray");
            System.out.println("2: maxReturn");
            System.out.println("3: minReturn");
            System.out.println("4: mediaReturn");
            System.out.println("5: proveEmpty");
            System.out.println("6: sumArray");
            System.out.println("7: resArray");
            System.out.println("8: prodEscalar");
            System.out.println("9: reverseArray");
            System.out.println("10: switchArray");
            System.out.println("11: isCapicua");
            res = in.nextInt();
        }
        if (res < 5 || res > 8) {
            System.out.println("Cual quieres que sea la longitud del array");
            int length = in.nextInt();
            first = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.println("Introduce un número");
                int num = in.nextInt();
                first[i] = num;
            }
        } else if (res == 5) {
            System.out.println("Cual quieres que sea la longitud del array");
            int length = in.nextInt();
            first = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.println("Introduce un número");
                int num = in.nextInt();
                first[i] = num;
            }
            System.out.println("Introduce un número");
            nem = in.nextInt();
        } else {
            System.out.println("Cual quieres que sea la longitud del array");
            int length = in.nextInt();
            first = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.println("Introduce un número");
                int num = in.nextInt();
                first[i] = num;
            }
            System.out.println("Cual quieres que sea la longitud del array");
            length = in.nextInt();
            second = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.println("Introduce un número");
                int num = in.nextInt();
                second[i] = num;
            }
        }
            switch (res) {

                case 1:
                    showArray(first);

                    break;

                case 2:
                    int fun = maxReturn(first);
                    System.out.println("El número mas alto de la array es " + fun);

                    break;

                case 3:
                    int ras = minReturn(first);
                    System.out.println("El número mas pequeño de la array es  " + ras);

                    break;

                case 4:
                    int ris = mediaReturn(first);
                    System.out.println("La media de la array es " + ris);

                    break;

                case 5:
                    boolean ros = proveNum(nem, first);
                    if (ros) {
                        System.out.println("El número si estaba en una de las celdas");
                    } else System.out.println("El número no estaba en una de las celdas");

                    break;

                case 6:
                    int rus = sumArray(first, second);
                    System.out.println("La suma de dos celdas aleatorias es " + rus);

                    break;

                case 7:
                    int fan = resArray(first, second);
                    System.out.println("La resta de dos celdas aleatorias es " + fan);

                    break;

                case 8:
                    int fen = prodEscalar(first, second);
                    System.out.println("La suma de todas las celdas es " + fen);

                    break;

                case 9:
                    fin = reverseArray(first);
                    System.out.println("La array al revés es");
                    for (int i = 0; i < fin.length; i++) {
                        System.out.println(fin[i]);
                    }

                    break;

                case 10:
                    switchArray(first);

                    break;

                case 11:
                    boolean fiu = isCapicua(first);
                    if (fiu) {
                        System.out.println("La array si es capicua");
                    } else System.out.println("La array no es capicua");
            }
        }
    }




