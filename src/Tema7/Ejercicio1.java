package Tema7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {

        String fileName = "Documentos/numeros.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            int max = Integer.parseInt(lines.getFirst());
            for (int i = 1; i < 1000; i ++) {
                if (Integer.parseInt(lines.get(i)) > max) max = Integer.parseInt(lines.get(i));
            }
            int min = Integer.parseInt(lines.getFirst());
            for (int i = 1; i < 1000; i ++) {
                if (Integer.parseInt(lines.get(i)) < min) min = Integer.parseInt(lines.get(i));
            }
            System.out.println(max);
            System.out.println(min);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
