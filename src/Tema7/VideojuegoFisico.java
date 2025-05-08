package Tema7;

public class VideojuegoFisico extends Videojuego{

    private String tiendaCompra;
    private String estado;

    public VideojuegoFisico(String tiendaCompra, String estado, String titulo, String plataforma, int nota) {
        super(titulo, plataforma, nota);
        this.tiendaCompra = tiendaCompra;
        this.estado = estado;
    }

    public String getTiendaCompra() {
        return tiendaCompra;
    }

    public String getEstado() {
        return estado;
    }

    public String getTipo() {
        return "";
    }
}
