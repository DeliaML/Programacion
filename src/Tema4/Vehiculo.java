package Tema4;

public class Vehiculo {

    private String matricula;
    private String marca;

    public Vehiculo() {
        this.marca = "Ford";
        this.matricula = "2002KFC";
    }

    public Vehiculo(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
