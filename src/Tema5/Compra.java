package Tema5;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Compra {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set <String> lista = new HashSet<>();
        Set <String> carro = new HashSet<>();
        int res = 0;
        int con = 0;
        String producto;
        while (res >= 0 && res <= 3) {
            System.out.println("Introduce un numero para las siguientes opciones");
            System.out.println("Introduce un numero negativo o un numero mayor a 3 para salir");
            System.out.println("1. Añadir un producto a la lista de la compra");
            System.out.println("2. Añadir un producto al carro de la compra");
            System.out.println("3. Mirar los productos del carro y la lista de la compra");
            res = in.nextInt();
            String trash = in.nextLine();


            switch (res) {


                case 1:


                    System.out.println("Introduce un producto");
                    producto = in.nextLine();
                    if (lista.contains(producto)) {
                        System.out.println("Ese producto ya esta en la lista");
                    } else lista.add(producto);


                    break;


                case 2:


                    System.out.println("Introduce un producto");
                    carro.add(in.nextLine());


                    break;


                case 3:


                    if (carro.containsAll(lista)) {
                        System.out.println("La compra esta terminada");
                    } else {
                        System.out.println("Faltan productos en el carro");
                        for (String list : lista) {
                            if (!carro.contains(list)) {
                                System.out.println(list);
                            }
                        }
                    }


                    break;
            }
        }
    }
}

