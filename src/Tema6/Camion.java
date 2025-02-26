package Tema6;

public class Camion extends Vehiculo {

    private int pma;
    private boolean danger;

    public Camion() {
        this.pma = 3250;
        this.danger = false;
    }

    public Camion(int pma, boolean danger) {
        this.pma = pma;
        this.danger = danger;
    }

    public int getPma() {
        return pma;
    }

    public boolean isDanger() {
        return danger;
    }

    public void setPma(int pma) {
        if (pma > 0) this.pma = pma;
    }

    public void setDanger(boolean danger) {
        this.danger = danger;
    }
}
