package Tema6;

public class Rectangulo extends Figura2D {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        this.base = 3;
        this.altura = 4;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        if (base != altura && base > 0) this.base = base;
    }

    public void setAltura(double altura) {
        if(altura != base && altura > 0) this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double areaCalcular() {
        return base * altura;
    }

    public double perimetroCalcular() {
        return (base * 2) + (altura * 2);
    }
}
