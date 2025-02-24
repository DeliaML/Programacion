package Tema4;

import java.util.Scanner;

public class Usuario {
    private String name;
    private int age;
    private String dni;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDni() {
        return dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }

    public void setDni(String dni) {
        if (dni.length() == 8) this.dni = dni;
    }

    public Usuario() {
        this.name = "a";
        this.age = 20;
        this.dni = "11111111";
    }

    public Usuario(String name, int age, String dni) {
        this.name = name;
        this.age = age;
        this.dni = dni;
    }

    public static void altaUsuario() {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el nombre del usuario");
        String nombre = in.nextLine();
        System.out.println("Introduce la edad");
        int edad = in.nextInt();
        String trash = in.nextLine();
        System.out.println("Introduce el dni");
        String nif = in.nextLine();

        Usuario user = new Usuario(nombre, edad, nif);
    }
}
