package Tema6;

public class Cuadrado extends Figura2D {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
        this.lado = 3;
    }

    public void setLado(double lado) {
        if (lado > 0) this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double areaCalcular() {
        return lado * lado;
    }

    public double perimetroCalcular() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }
}
