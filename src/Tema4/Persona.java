package Tema4;


import java.util.Scanner;

public class Persona {

    private int edad;
    private String nombre;
    private String apellidos;
    private String dni;

    public Persona(String nombre, String apellidos, String dni, int edad) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public void setEdad(int edad) {

        if (edad >= 0) this.edad = edad;
    }

    public void setApellidos(String apellidos) {

        int d = 0;
        for (int i = 0; i < apellidos.length(); i++) {
            if (apellidos.charAt(i) == ' ') {
                d ++;
            }
        }
        if (d == 1 || d == 0) this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public static int numDni(int num) {

        Scanner in = new Scanner(System.in);

        while (num % 10 != 8) {
            System.out.println("Introduce unicamente los 8 números del dni");
            num = in.nextInt();
        }
        return num;
    }

    public static String letraDni(int num) {

        String dnil = "";
        dnil += num;
        int letra = num % 23;
        switch (letra) {

            case 0: dnil += "T"; break;
            case 1: dnil += "R"; break;
            case 2: dnil += "W"; break;
            case 3: dnil += "A"; break;
            case 4: dnil += "G"; break;
            case 5: dnil += "M"; break;
            case 6: dnil += "Y"; break;
            case 7: dnil += "F"; break;
            case 8: dnil += "P"; break;
            case 9: dnil += "D"; break;
            case 10: dnil += "X"; break;
            case 11: dnil += "B"; break;
            case 12: dnil += "N"; break;
            case 13: dnil += "J"; break;
            case 14: dnil += "Z"; break;
            case 15: dnil += "S"; break;
            case 16: dnil += "Q"; break;
            case 17: dnil += "V"; break;
            case 18: dnil += "H"; break;
            case 19: dnil += "L"; break;
            case 20: dnil += "C"; break;
            case 21: dnil += "K"; break;
            case 22: dnil += "E"; break;

        }
        return dnil;
    }

    public final void setDni(String dni) {

        this.dni = dni;

    }

    public void print(String name, String surname, String doc, int age) {

        System.out.println("Tu nombre completo es " + name + " " + surname + " tu edad es " + age + " y tu dni es " + doc);
    }

    public boolean isAdult(int age) {

        if (age < adultAge) return false;
        return true;
    }

    public boolean isRetired(int age) {

        if (age < retiredAge) return false;
        return true;
    }

    public int ageDifference(int age1, int age2) {


        if (age1 >= age2) return age2 - age1;
        else return age1 - age2;
    }

    public static final int adultAge = 18;
    public static final int retiredAge = 65;

    public static boolean checkDNI(String dni) {

        int cont = 0;
        for (int i =0; i < 7 && i < dni.length(); i++) {
            if (dni.charAt(i) == '0' || dni.charAt(i) == '1' || dni.charAt(i) == '2' || dni.charAt(i) == '3' || dni.charAt(i) == '4' || dni.charAt(i) == '5' || dni.charAt(i) == '6' || dni.charAt(i) == '7' || dni.charAt(i) == '8' || dni.charAt(i) == '9') {
                cont ++;
            }
        }
        if (cont == 8 && dni.length() == 9) {
            switch (dni.charAt(8)) {
                case 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z': return true;
            }
        }
        return false;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
