package Tema6;

public class Libro extends Ficha {

    private String autor;
    private String editorial;
    private String[] contenido;
    private int cont;

    public Libro(int numero, String titulo, String[] contenido) {
        super(numero, titulo);
        this.autor = "paco";
        this.editorial = "nose";
        this.contenido = contenido;
        this.cont = 0;
    }

    public Libro(int numero, String titulo, String autor, String editorial, String[] contenido) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
        this.contenido = contenido;
        this.cont = 0;
    }

    public String[] getContenido() {
        return contenido;
    }

    public void setCont(int cont) {
        if (cont < contenido.length) this.cont = cont;
    }

    public void setContenido(String[] contenido) {
        this.contenido = contenido;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCont() {
        return cont;
    }

    //enseña la pagina por la que se ha quedado el contador

    public void leerLibro() {
        System.out.println(contenido[cont]);
        cont ++;
        if (cont > contenido.length) cont = 0;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAutor() {
        return autor;
    }

    //enseña la pagina que recibe

    public void leerPagina(int pagina) {
        System.out.println(contenido[pagina]);
    }
}
