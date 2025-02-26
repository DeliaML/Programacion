package Tema6;

public class Circulo extends Figura2D {

    private double radio;
    private final double pi = 3.14;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
        this.radio = 3;
    }

    public void setLado(double radio) {
        if (radio > 0) this.radio= radio;
    }

    public double getLado() {
        return radio;
    }

    public double areaCalcular() {
        return radio * radio * pi;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", pi=" + pi +
                '}';
    }

    public double perimetroCalcular() {
        return pi * 2 + radio;
    }
}
