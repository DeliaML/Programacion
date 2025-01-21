import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyMatrix {

    public static void showMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }

        }
    }
    public static int maxValue(int[][] a) {

        int j = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int h = 0; h < a[i].length; h++) {
                if (a[i][h] > j) j = a[i - 1][h];
            }
        }
        return j;
    }

    public static int minValue(int[][] a) {

        int j = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int h = 0; h < a[i].length; h++) {
                if (a[i][h] < j) j = a[i][h];
            }
        }
        return j;
    }

    public static int mediaValue(int[][] a) {

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            for (int h = 0; h < a[i].length; h++) {
                j = a[i][h] + j;
            }
        }
        j = j / a.length;
        return j;
    }

    public static boolean proveContent(int num, int[][] a) {

        boolean truth = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == num) truth = true;
            }
        }
        return truth;
    }

    public static int sumMatriz(int[][] a, int[][] b) {
        Random random = new Random();
        int i = random.nextInt(a.length);
        int j = random.nextInt(b.length);
        int h = random.nextInt(a[i].length);
        int g = random.nextInt(b[j].length);
        return a[i][h] + b[j][g];
    }

    public static int resMatriz(int[][] a, int[][] b) {
        Random random = new Random();
        int i = random.nextInt(a.length);
        int j = random.nextInt(b.length);
        int h = random.nextInt(a[i].length);
        int g = random.nextInt(b[j].length);
        return a[i][h] - b[j][g];
    }

    public static boolean isUnidad(int[][] a) {

        boolean truth = true;
        for (int i = 0; i < a.length; i ++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == i && j != 1) {
                    truth = false;
                } else if (j != i && j != 0) truth = false;
            }
        }
        return truth;
    }

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("1. showMatrix");
        System.out.println("2. maxValue");
        System.out.println("3. minValue");
        System.out.println("4. mediaValue");
        System.out.println("5. proveContent");
        System.out.println("6. sumMatriz");
        System.out.println("7. resMatriz");
        System.out.println("8. isUnidad");
        System.out.println("Introduce un número del 1 al 8");
        int res = in.nextInt();
        while (res < 1 || res > 8) {
            System.out.println("1. showMatrix");
            System.out.println("2. maxValue");
            System.out.println("3. minValue");
            System.out.println("4. mediaValue");
            System.out.println("5. proveContent");
            System.out.println("6. sumMatriz");
            System.out.println("7. resMatriz");
            System.out.println("8. isUnidad");
            System.out.println("El número tiene que ser del 1 al 8");
            res = in.nextInt();
        }
        switch (res) {

            case 1:

                System.out.println("Introduce el número de lineas de la matriz");
                int line1 = in.nextInt();
                System.out.println("Introduce las casillas por linea");
                int line2 = in.nextInt();


                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;

            case 6:

                break;

            case 7:

                break;

            case 8:


        }
    }
}