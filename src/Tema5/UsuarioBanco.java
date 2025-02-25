package Tema5;

public class UsuarioBanco {

    private String nombre;
    private int edad;
    private int dni;
    private int cont;

    UsuarioBanco() {
        nombre = "a";
        edad = 18;
        dni = 12345678;
        cont = 0;
    }

    UsuarioBanco(String nombre, int edad, int dni, int cont) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.cont = cont;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getCont() {
        return cont;
    }

    public int getDni() {
        return dni;
    }
}
