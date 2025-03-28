package Tema7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class EjercicioS1 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String name = in.nextLine();
        System.out.println("Introduce tu edad");
        int edad = in.nextInt();
        Files.writeString(Paths.get("Documentos/usuario.txt"), "Nombre: " + name + "\n" + "Edad: " + edad,StandardOpenOption.APPEND,StandardOpenOption.CREATE);
    }
}
