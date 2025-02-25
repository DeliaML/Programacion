package Tema5;


public class Usuario {
    private String nombre;
    private int edad;


    Usuario() {
        this.nombre = "A";
        this.edad = 18;
    }
    Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        if (edad >= 0) this.edad = edad;
    }


    public static void changeUser(Usuario user, String name, int age) {
        user.nombre = name;
        user.edad = age;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

