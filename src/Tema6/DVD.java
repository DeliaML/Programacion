package Tema6;

import java.util.Random;

public class DVD extends Ficha{

    private String director;
    private String tipo;
    private String[] contenido;


    public DVD(int numero, String titulo, String[] contenido) {
        super(numero, titulo);
        this.director = "manolo";
        this.tipo = "comedia";
        this.contenido = contenido;
    }

    public DVD(int numero, String titulo, String director, String tipo, String[] contenido) {
        super(numero, titulo);
        this.director = director;
        this.tipo = tipo;
        this.contenido = contenido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public String[] getContenido() {
        return contenido;
    }

    public void setContenido(String[] contenido) {
        this.contenido = contenido;
    }

    //enseña el contenido del array entero

    public void verDVD() {
        for (int i = 0; i < contenido.length; i++) {
            System.out.println(contenido[i]);
        }
    }

    //recibe por donde empezar a enseñar y cuando terminar

    public void verEscena(int comienzo, int fin) {
        for (int i = comienzo; i < fin; i++) {
            System.out.println(contenido[i]);
        }
    }
}
