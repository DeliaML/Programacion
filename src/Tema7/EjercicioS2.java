package Tema7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class EjercicioS2 {

    public static void main(String[] args) throws IOException {
        System.out.println(Files.readAllLines(Path.of("Documentos/usuario.txt")));
    }
}
