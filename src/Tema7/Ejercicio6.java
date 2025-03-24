package Tema7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número");
        String num = in.nextLine();
        String pi = Files.readString(Path.of("Documentos/pi-million.txt"));
        if (pi.indexOf(num) != -1) {
            System.out.println("El numero si esta entre el primer millon de pi");
        } else System.out.println("El numero no esta entre el primer millon de pi");
    }
}
