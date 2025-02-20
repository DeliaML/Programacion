package Tema4;

public class Turismo extends Vehiculo {

    private int numplazas;
    private boolean particular;

    public Turismo() {
        this.numplazas = 5;
        this.particular = true;
    }

    public Turismo(int numplazas, boolean particular) {
        this.particular = particular;
        this.numplazas = numplazas;
    }

    public int getNumplazas() {
        return numplazas;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setNumplazas(int numplazas) {
        if (numplazas >= 2 && numplazas <= 9) this.numplazas = numplazas;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }
}
