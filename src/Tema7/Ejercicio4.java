package Tema7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Introduce cuantas personas quieres añadir");
        int cont = in.nextInt();
        String fileoutput = in.nextLine();
        System.out.println("Introduce el nombre del fichero donde se va a guardar");
        fileoutput = in.nextLine();
        List<String> lista = new ArrayList<>();
        String linea = " ";
        try {
            List<String> nombres = Files.readAllLines(Paths.get("Documentos/usa_nombres.txt"));
            List<String> apellidos = Files.readAllLines(Paths.get("Documentos/usa_apellidos.txt"));
            for (int i = 0; i < cont; i ++) {
                linea = (nombres.get(random.nextInt(nombres.size()))) + " " + (apellidos.get(random.nextInt(apellidos.size()))) + " ";
                lista.add(linea);
            }
            Collections.sort(lista, String::compareToIgnoreCase);
            for(int i = 0; i < lista.size(); i ++) {
                Files.write(Paths.get(fileoutput),lista.get(i).getBytes(), StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
