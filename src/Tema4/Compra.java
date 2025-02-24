package Tema4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Compra {
    static Set<String> lista = new HashSet<>();

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String producto;
        int cont = 0;

        System.out.println("Introduce un producto");
        lista.add(in.nextLine());
        System.out.println("Introduce otro producto");
        producto = in.nextLine();
        for (String prueba : lista) {
            if (!prueba.equals(producto)) {
                cont ++;
            } else System.out.println("Ese producto ya esta en la lista");
            if (cont == prueba.length()) lista.add(producto);
        }
        cont = 0;
        System.out.println("Introduce el ultimo producto");
        producto = in.nextLine();
        for (String prueba : lista) {
            if (!prueba.equals(producto)) cont ++;
            else System.out.println("Ese producto ya esta en la lista");
        }
        if (cont == lista.size()) lista.add(producto);
        System.out.println(lista);
        cont = 0;
    }
}
