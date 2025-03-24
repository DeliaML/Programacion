package Tema7;

public class Alumno {

    private String nombre;
    private String apellido;
    private double media;

    public Alumno(String nombre, String apellido, double media) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.media = media;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMedia() {
        return media;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", media=" + media +
                '}';
    }
}
