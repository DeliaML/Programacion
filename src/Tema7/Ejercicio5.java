package Tema7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) throws IOException {

        File dir = new File("Documentos/Diccionario");

        if (dir.mkdir()) {
            System.out.println("Directorio creado");
        } else System.out.println("Error al crear directorio");

        List<File>files = new ArrayList<>();
        for (char i = 65; i <= 90; i++) {
            try {
                Files.createFile(Paths.get("Documentos/Diccionario/" + i + ".txt"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        List<String>letras = new ArrayList<>();
        letras = Files.readAllLines(Path.of("Documentos/diccionario.txt"));
        letras.forEach(palabra -> {
        char c = palabra.toUpperCase().charAt(0);
            try {
                Files.writeString(Paths.get("Documentos/Diccionario/" + c + ".txt"), palabra + "\n", StandardOpenOption.APPEND,StandardOpenOption.CREATE);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
