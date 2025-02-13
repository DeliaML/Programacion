package Tema4;

public class PruebaCuentas {

    public static void moneyReceive(int dni, int num, int[] cuenta, int money) {


    }

    public static void moneyTransfer(int num1, int num2, int[] cuenta1, int[] cuenta2) {


    }

    public static void showMoroso(int dni, int[] cuenta) {

        for (int i = 0; i < cuenta.length; i++) {
            if (cuenta[i] < 0) System.out.println("La persona con el dni " + dni + " es morosa");
        }
    }
}

