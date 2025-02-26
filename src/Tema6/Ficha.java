package Tema6;

public class Ficha {

    private int numero;
    private String titulo;

    public Ficha() {
        this.numero = 0;
        this.titulo = "mec";
    }

    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumero(int numero) {
        if (numero > 0) this.numero = numero;
    }
}
