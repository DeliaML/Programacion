package Tema7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EjercicioS3 {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("Documentos/usuario.txt"));
        int cont = 0;
        int i;
        for (i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
            String[] nombre = lines.get(i).split(" ");
            cont = cont + nombre.length;
        }
        System.out.println(cont);
    }
}
