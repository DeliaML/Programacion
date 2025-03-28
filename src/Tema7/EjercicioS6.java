package Tema7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioS6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce cuantas personas quieres introducir");
        int cont = in.nextInt();
        String trash = in.nextLine();
        List<Persona>lista = new ArrayList<>();
        for (int i = 0; i < cont; i ++) {
            System.out.println("Introduce el nombre de la persona");
            String nombre = in.nextLine();
            System.out.println("Introduce su edad");
            int edad = in.nextInt();
            trash = in.nextLine();
            Persona persona = new Persona(nombre, edad);
            lista.add(persona);
        }
        EjercicioS4 salida = new EjercicioS4();

        try {
            salida.abrir();
            for (int i = 0; i < lista.size(); i++) {
                salida.escribir(lista.get(i));
            }
            salida.cerrar();
        }catch (Exception e){

        }
    }
}
