package Tema5;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Gimnasio {


    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Map<Integer, Usuario> users = new HashMap<>();
        System.out.println("Introduce cuantos usuarios seran el maximo");
        Usuario[] usuario = new Usuario[in.nextInt()];
        int res = 0;
        int cont = 0;
        while (res >= 0 && res <= 4) {
            System.out.println("Introduce un numero para las siguientes opciones");
            System.out.println("Introduce un numero negativo o un numero mayor a 4 para salir");
            System.out.println("1. Crear un usuario");
            System.out.println("2. Eliminar un usuario");
            System.out.println("3. Mostrar un usuario");
            System.out.println("4. Modificar un usuario");
            res = in.nextInt();
            String trash = in.nextLine();


            switch (res)  {


                case 1:


                    System.out.println("Introduce el nombre del usuario");
                    String nombre = in.nextLine();
                    System.out.println("Introduce la edad");
                    int edad = in.nextInt();
                    System.out.println("Introduce el dni");
                    int dni = in.nextInt();
                    trash = in.nextLine();
                    usuario[cont] = new Usuario(nombre, edad);
                    users.put(dni, usuario[cont]);
                    cont ++;


                    break;


                case 2:


                    System.out.println("Introduce el dni del usuario a borrar");
                    dni = in.nextInt();
                    users.remove(dni);
                    if (cont > 0) cont --;


                    break;


                case 3:


                    System.out.println("Introduce el dni del usuario a mostrar");
                    dni = in.nextInt();
                    System.out.println(users.get(dni).toString());


                    break;


                case 4:


                    System.out.println("Introduce el dni del usuario a modificar");
                    dni = in.nextInt();
                    System.out.println("Introduce un nombre");
                    nombre = in.nextLine();
                    System.out.println("Introduce una edad");
                    edad = in.nextInt();
                    Usuario.changeUser(users.get(dni), nombre, edad);
            }
        }
    }
}

