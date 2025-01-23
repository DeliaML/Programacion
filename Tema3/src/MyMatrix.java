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
                if (a[i][h] > j) j = a[i][h];
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
        j = j / (a.length * a[0].length);
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
                if (j == i && a[i][j] != 1) truth = false;
                if (j != i && a[i][j] != 0) truth = false;
            }
        }
        return truth;
    }

    public static int[][] rellenarMatriz(int line1, int line2) {

        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[line1][line2];
        for (int i = 0; i < line1; i++) {
            for (int j = 0; j < line2; j ++) {
                System.out.println("Introduce un número");
                matriz[i][j] = in.nextInt();
            }
        }

        return matriz;
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
                while (line1 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line1 = in.nextInt();
                }
                System.out.println("Introduce las casillas por linea");
                int line2 = in.nextInt();
                while (line2 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line2 = in.nextInt();
                }
                int[][] matriz1;
                matriz1 = rellenarMatriz(line1, line2);
                showMatriz(matriz1);

                break;

            case 2:

                System.out.println("Introduce el número de lineas de la matriz");
                int line3 = in.nextInt();
                while (line3 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line3 = in.nextInt();
                }
                System.out.println("Introduce las casillas por linea");
                int line4 = in.nextInt();
                while (line4 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line4 = in.nextInt();
                }
                int[][] matriz2;
                matriz2 = rellenarMatriz(line3, line4);
                int max = maxValue(matriz2);
                System.out.println("El número máximo de la matriz es " + max);

                break;

            case 3:

                System.out.println("Introduce el número de lineas de la matriz");
                int line5 = in.nextInt();
                while (line5 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line5 = in.nextInt();
                }
                System.out.println("Introduce las casillas por linea");
                int line6 = in.nextInt();
                while (line6 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line6 = in.nextInt();
                }
                int[][] matriz3;
                matriz3 = rellenarMatriz(line5, line6);
                int min = minValue(matriz3);
                System.out.println("El número minimo de la matriz es " + min);

                break;

            case 4:

                System.out.println("Introduce el número de lineas de la matriz");
                int line7 = in.nextInt();
                while (line7 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line7 = in.nextInt();
                }
                System.out.println("Introduce las casillas por linea");
                int line8 = in.nextInt();
                while (line8 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line8 = in.nextInt();
                }
                int[][] matriz4;
                matriz4 = rellenarMatriz(line7, line8);
                int media = mediaValue(matriz4);
                System.out.println("La media de los números introducidos es " + media);

                break;

            case 5:

                System.out.println("Introduce el número de lineas de la matriz");
                int line9 = in.nextInt();
                while (line9 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line9 = in.nextInt();
                }
                System.out.println("Introduce las casillas por linea");
                int line10 = in.nextInt();
                while (line10 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line10 = in.nextInt();
                }
                System.out.println("Introduce un número clave");
                int num = in.nextInt();
                int[][] matriz5;
                matriz5 = rellenarMatriz(line9, line10);
                boolean truth = proveContent(num, matriz5);
                if (truth) {
                    System.out.println("El número clave " + num + " si estaba en la matriz");
                } else System.out.println("El número clave " + num + " no estaba en la matriz");

                break;

            case 6:

                System.out.println("Introduce el número de lineas de la primera matriz");
                int line11 = in.nextInt();
                while (line11 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line11 = in.nextInt();
                }
                System.out.println("Introduce las casillas por linea de la primera matriz");
                int line12 = in.nextInt();
                while (line12 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line12 = in.nextInt();
                }
                System.out.println("Introduce el número de lineas de la segunda matriz");
                int line13 = in.nextInt();
                while (line13 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line13 = in.nextInt();
                }
                System.out.println("Introduce las casillas por linea de la segunda matriz");
                int line14 = in.nextInt();
                while (line14 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line14 = in.nextInt();
                }
                int[][] matriz6;
                int[][] matriz7;
                matriz6 = rellenarMatriz(line11, line12);
                matriz7 = rellenarMatriz(line13, line14);
                int suma = sumMatriz(matriz6, matriz7);
                System.out.println("La suma de dos casillas aleatorias de las dos matrices es " + suma);

                break;

            case 7:

                System.out.println("Introduce el número de lineas de la primera matriz");
                int line15 = in.nextInt();
                while (line15 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line15 = in.nextInt();
                }
                System.out.println("Introduce las casillas por linea de la primera matriz");
                int line16 = in.nextInt();
                while (line16 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line16 = in.nextInt();
                }
                System.out.println("Introduce el número de lineas de la segunda matriz");
                int line17 = in.nextInt();
                while (line17 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line17 = in.nextInt();
                }
                System.out.println("Introduce las casillas por linea de la segunda matriz");
                int line18 = in.nextInt();
                while (line18 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line18 = in.nextInt();
                }
                int[][] matriz8;
                int[][] matriz9;
                matriz8 = rellenarMatriz(line15, line16);
                matriz9 = rellenarMatriz(line17, line18);
                int resta = resMatriz(matriz8, matriz9);
                System.out.println("La resta de dos casillas aleatorias de las dos matrices es " + resta);

                break;

            case 8:

                System.out.println("Introduce el número de lineas de la matriz");
                int line19 = in.nextInt();
                while (line19 < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line19 = in.nextInt();
                }
                System.out.println("Introduce las casillas por linea");
                int line = in.nextInt();
                while (line < 0) {
                    System.out.println("El número tiene que ser positivo");
                    line = in.nextInt();
                }
                int[][]matriz;
                matriz = rellenarMatriz(line19, line);
                boolean unidad = isUnidad(matriz);
                if (unidad) {
                    System.out.println("Tu matriz es una matriz unidad");
                } else System.out.println("Tu matriz no es una matriz unidad");
            }
        }
    }