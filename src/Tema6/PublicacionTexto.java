package Tema6;

import java.util.Scanner;

public class PublicacionTexto implements Publicacion, IPublicacionReaccion {

    private String texto;
    private String enlace;
    private boolean estado;
    private String urlcomentarios;

    public String compartir() {
        return enlace;
    }

    public void setUrlcomentarios(String urlcomentarios) {
        this.urlcomentarios = urlcomentarios;
    }

    public String getUrlcomentarios() {
        return urlcomentarios;
    }

    public String compartirReaccion() {
        return urlcomentarios;
    }

    public String comentar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu comentario");
        return in.nextLine();
    }

    public PublicacionTexto(String texto, String enlace, String urlcomentarios) {
        this.texto = texto;
        this.enlace = enlace;
        this.estado = false;
        this.urlcomentarios = urlcomentarios;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getTexto() {
        return texto;
    }

    public PublicacionTexto() {
        this.texto = "xd";
        this.enlace = "https://www.enlace.random";
        this.estado = false;
        this.urlcomentarios = "https://www.enlace.comentarios";
    }

    public void publicar() {
        estado = true;
    }
}
