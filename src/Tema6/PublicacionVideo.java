package Tema6;

import java.util.Scanner;

public class PublicacionVideo implements Publicacion, AbrirPublicacion, IPublicacionReaccion {

    private String[][] video;
    private String enlace;
    private boolean estado;
    private int duracion;
    private String urlcomentarios;

    public String compartir() {
        return enlace;
    }

    public void AbrirPublicacion() {
        for (int i = 0; i < duracion; i++) {
            for (int j = 0; j < video[i].length; j++) {
                System.out.println(video[i][j]);
            }
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

    public int getDuracion() {
        return duracion;
    }

    public String getUrlcomentarios() {
        return urlcomentarios;
    }

    public void setUrlcomentarios(String urlcomentarios) {
        this.urlcomentarios = urlcomentarios;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public PublicacionVideo(String[][] video, String enlace, String urlcomentarios) {
        this.video = video;
        this.enlace = enlace;
        this.estado = false;
        this.duracion = video.length;;
        this.urlcomentarios = urlcomentarios;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setVideo(String[][] video) {
        this.video = video;
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

    public String[][] getVideo() {
        return video;
    }

    public PublicacionVideo(String[][] video) {
        this.video = video;
        this.enlace = "https://www.enlace.random";
        this.estado = false;
        this.duracion = video.length;
        this.urlcomentarios = "https://www.enlace.comentarios";
    }

    public void publicar() {
        estado = true;
    }
}
