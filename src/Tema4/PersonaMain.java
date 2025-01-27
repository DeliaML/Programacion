package Tema4;

import java.util.Scanner;

public class PersonaMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Persona persona1 = new Persona(" ", " ", " ", 1);
        Persona persona2 = new Persona(" ", " ", " ", 1);

        System.out.println("Introduce los datos de la primera persona");
        System.out.println("Introduce el nombre");
        persona1.setNombre(in.nextLine());
        System.out.println("Introduce los apellidos");
        persona1.apellidos = in.nextLine();
        System.out.println("Introduce la edad");
        persona1.edad = in.nextInt();
        String trash = in.nextLine();
        System.out.println("Introduce solo los 8 números  del dni");
        int dni1 = in.nextInt();
        trash = in.nextLine();
        System.out.println("Introduce los datos de la segunda persona");
        System.out.println("Introduce el nombre");
        persona2.nombre = in.nextLine();
        System.out.println("Introduce los apellidos");
        persona2.apellidos = in.nextLine();
        System.out.println("Introduce la edad");
        persona2.edad = in.nextInt();
        trash = in.nextLine();
        System.out.println("Introduce solo los 8 números del dni");
        int dni2 = in.nextInt();
        trash = in.nextLine();
        dni1 = numDni(dni1);
        dni2 = numDni(dni2);
        persona1.dni = letraDni(dni1);
        persona2.dni = letraDni(dni2);
    }

}
