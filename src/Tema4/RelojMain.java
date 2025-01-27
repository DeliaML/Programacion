package Tema4;

import java.util.Scanner;

public class RelojMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Reloj reloj1 = new Reloj(0, 0, 0);
        Reloj reloj2 = new Reloj();

        boolean pm;

        System.out.println("Introduce un 0 si quieres sistema de 24 horas o cualquier otro número para sistema de 12");
        int am = in.nextInt();
        if (am == 0) pm = true;
        else pm = false;
        reloj1.setPm(pm);
        System.out.println("Introduce la hora");
        reloj1.setHours(in.nextInt());
        System.out.println("Introduce los minutos");
        reloj1.setMinutes(in.nextInt());
        System.out.println("Introduce los segundos");
        reloj1.setSeconds(in.nextInt());
        System.out.println(" ");
    }
}
