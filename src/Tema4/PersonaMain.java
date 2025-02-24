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
        persona1.setApellidos(in.nextLine());
        System.out.println("Introduce la edad");
        persona1.setEdad(in.nextInt());
        String trash = in.nextLine();
        System.out.println("Introduce solo los 8 números  del dni");
        int dni1 = in.nextInt();
        trash = in.nextLine();
        System.out.println("Introduce los datos de la segunda persona");
        System.out.println("Introduce el nombre");
        persona2.setNombre(in.nextLine());
        System.out.println("Introduce los apellidos");
        persona2.setApellidos(in.nextLine());
        System.out.println("Introduce la edad");
        persona2.setEdad(in.nextInt());
        trash = in.nextLine();
        System.out.println("Introduce solo los 8 números del dni");
        int dni2 = in.nextInt();
        trash = in.nextLine();
        persona1.setDni(String.valueOf(dni1));
        persona2.setDni(String.valueOf(dni2));
        persona1.setDni(Persona.letraDni(dni1));
        persona2.setDni(Persona.letraDni(dni2));
        System.out.println(persona1);
        System.out.println(persona2);
    }

}
