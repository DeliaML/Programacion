package Tema6;

public class Triangulo extends Figura2D {

    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public Triangulo() {
        this.lado = 3;
    }

    public void setLado(double lado) {
        if (lado > 0) this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double areaCalcular() {
        return lado * lado / 2.0;
    }

    public double perimetroCalcular() {
        return lado * 3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado=" + lado +
                '}';
    }
}
