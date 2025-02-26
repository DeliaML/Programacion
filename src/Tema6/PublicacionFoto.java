package Tema6;

import java.util.Scanner;

public class PublicacionFoto implements Publicacion, AbrirPublicacion, IPublicacionReaccion {

    private String[] imagen;
    private String enlace;
    private boolean estado;
    private String urlcomentarios;


    public String getUrlcomentarios() {
        return urlcomentarios;
    }

    public void setUrlcomentarios(String urlcomentarios) {
        this.urlcomentarios = urlcomentarios;
    }

    public String compartir() {
        return enlace;
    }

    public void AbrirPublicacion() {
        for (int i = 0; i < imagen.length; i++) {
            System.out.println(imagen[i]);
        }
    }

    public String compartirReaccion() {
        return urlcomentarios;
    }

    public String comentar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu comentario");
        return in.nextLine();
    }

    public PublicacionFoto(String[] imagen, String enlace, String urlcomentarios) {
        this.imagen = imagen;
        this.enlace = enlace;
        this.estado = false;
        this.urlcomentarios = urlcomentarios;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setImagen(String[] imagen) {
        this.imagen = imagen;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getEnlace() {
        return enlace;
    }

    public String[] getImagen() {
        return imagen;
    }

    public PublicacionFoto(String[] imagen) {
        this.imagen = imagen;
        this.enlace = "https://www.enlace.random";
        this.estado = false;
        this.urlcomentarios = "https://www.enlace.comentarios";
    }

    public void publicar() {
        estado = true;
    }
}
