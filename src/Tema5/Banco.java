package Tema5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<UsuarioBanco> usuario = new ArrayList<>();
        int res = 1;
        int cont = 0;
        String trash;
        while (res > 0 && res < 4) {
            System.out.println("Introduce un numero para las siguientes opciones y uno fuera del rango para salir");
            System.out.println("1. Atender al primero");
            System.out.println("2. Añadir un usuario a la cola");
            System.out.println("3. Renunciar a la cola");
            res = in.nextInt();
            trash = in.nextLine();

            switch (res) {

                case 1:

                    usuario.removeFirst();
                    cont --;

                    break;

                case 2:

                    System.out.println("Introduce el nombre del usuario");
                    String nombre = in.nextLine();
                    System.out.println("Introduce la edad");
                    int edad = in.nextInt();
                    System.out.println("Introduce el dni");
                    int dni = in.nextInt();
                    trash = in.nextLine();
                    usuario.add(new UsuarioBanco(nombre, edad, dni, cont));
                    cont ++;

                    break;

                case 3:

                    System.out.println("Introduce el dni a buscar");
                    dni = in.nextInt();
                    usuario.removeIf(user -> user.getDni() == dni);
                    cont --;

                    break;
            }
            System.out.println(usuario);
        }
    }
}
