package Tema6;

import java.util.Random;

public class Revista extends Ficha {

    private int num;
    private int año;
    private String[] contenido;
    private int cont;

    public Revista(int numero, String titulo, String[] contenido) {
        super(numero, titulo);
        this.num = 0;
        this.año = 2025;
        this.contenido = contenido;
        this.cont = 0;
    }

    public Revista(int numero, String titulo, int num, int año, String[] contenido) {
        super(numero, titulo);
        this.num = num;
        this.año = año;
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

    public int getNum() {
        return num;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAño() {
        return año;
    }

    public int getCont() {
        return cont;
    }

    //lee la revista por donde se ha quedado el contador

    public void leerRevista() {
        System.out.println(contenido[cont]);
        cont ++;
        if (cont > contenido.length) cont = 0;
    }

    //lee una pagina de la revista al azar

    public void leerChisme() {
        Random random = new Random();
        System.out.println(contenido[random.nextInt(contenido.length)]);
    }
}

