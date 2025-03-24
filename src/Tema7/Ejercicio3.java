package Tema7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero que vas a introducir");
        String fileinput = in.nextLine();
        System.out.println("Introduce el nombre del fichero donde se va a guardar");
        String fileoutput = in.nextLine();
        List<String> lista = new ArrayList<>();
        String linea = " ";
        try {
            List<String> lines = Files.readAllLines(Paths.get("Documentos/" + fileinput));
            for (int i = 0; i < lines.size(); i ++) {
                linea = (lines.get(i)) + " ,";
                lista.add(linea);
            }
            Collections.sort(lista, String::compareToIgnoreCase);
            for(int i = 0; i < lista.size(); i ++) {
                Files.write(Paths.get(fileoutput),lista.get(i).getBytes(),StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

