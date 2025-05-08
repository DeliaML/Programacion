package Tema7;

public class VideojuegoDigital extends Videojuego{

    private String tiendaOnline;
    private double tamañoGB;

    public VideojuegoDigital(String tiendaOnline, double tamañoGB, String titulo, String plataforma, int nota) {
        super(titulo, plataforma, nota);
        this.tiendaOnline = tiendaOnline;
        this.tamañoGB = tamañoGB;
    }

    public String getTiendaOnline() {
        return tiendaOnline;
    }

    public double getTamañoGB() {
        return tamañoGB;
    }

    public String getTipo() {
        return "";
    }
}
