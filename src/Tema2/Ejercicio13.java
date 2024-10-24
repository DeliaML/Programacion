package Tema2;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame las horas ");
        int Hours = in.nextInt();
        System.out.println("Dame los minutos ");
        int Minutes = in.nextInt();
        System.out.println("Dame los segundos ");
        int Seconds = in.nextInt();
        if (Minutes >= 60 || Seconds >= 60) {
            Minutes ++;
            Seconds ++;
        }
        Seconds ++;
        if (Seconds == 60) {
            Minutes ++;
            Seconds = 0;
        }
        if (Minutes == 60) {
            Hours ++;
            Minutes = 0;
        }
        if (Minutes > 60 || Seconds > 60) {
            System.out.println("La fecha es invalida ");
        } else {
            System.out.println("Son las " + Hours + " Horas " + Minutes + " Minutos " + Seconds + " Segundos");
        }
    }
}
