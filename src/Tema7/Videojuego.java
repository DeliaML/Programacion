package Tema7;

import java.io.Serializable;

public abstract class Videojuego implements Serializable {

    private String titulo;
    private String plataforma;
    private int nota;

    public Videojuego(String titulo, String plataforma, int nota) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", nota=" + nota +
                '}';
    }

    public String LineCSV() {

        return titulo + " , " + plataforma + " , " + nota + "\n";
    }

    public abstract String getTipo();
}
