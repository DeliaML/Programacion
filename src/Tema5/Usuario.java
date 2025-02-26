package Tema5;


public class Usuario {
    private String nombre;
    private int edad;


    Usuario() {
        this.nombre = "A";
        this.edad = 18;
    }
    Usuario(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        setEdad(edad);
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


    public void setEdad(int edad) throws Exception {

        if (edad >= 0)
        {this.edad = edad;}
        else {throw new Exception("No se puede poner edad negativa");}
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

