package Tema7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingDouble;

public class Ejercicio2 {

    public static void main(String[] args) {

        String fileName = "Documentos/alumnos_notas.txt";
        List<Alumno> alumno = new ArrayList<>();
        String nombre;
        String apellido;
        double media = 0;
        int cont = 0;
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (int i = 0; i < lines.size(); i ++) {
                nombre = lines.get(i).split(" ")[0];
                apellido = lines.get(i).split(" ")[1];
                for (int j = 2; j < lines.get(i).split(" ").length; j++) {
                    media = media + Double.parseDouble(lines.get(i).split(" ")[j]);
                    cont ++;
                }
                media = media / cont;
                alumno.add(new Alumno(nombre, apellido, media));
                media = 0;
                cont = 0;
            }

            Collections.sort(alumno, Comparator.comparingDouble(i -> i.getMedia()));
            for(int i = alumno.size() - 1; i >= 0; i --) {
                System.out.println(alumno.get(i).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

