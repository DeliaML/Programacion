package Tema6;

public class Ciclomotor extends Vehiculo {

    private int cc;

    public Ciclomotor() {
        this.cc = 100;
    }

    public Ciclomotor(int cc) {
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        if (cc > 0) this.cc = cc;
    }

    public static boolean needsCarnet(int cc) {

        if (cc >= 125) return true;
        return false;
    }
}
