package Tema7;

import java.io.Serializable;

public class Funko implements Serializable {

    private String codigo;
    private String nombre;
    private String modelo;
    private double precio;
    private String fecha;

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Funko(String codigo, String nombre, String modelo, double precio, String fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Funko{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    public String lineCSV() {

        return "\n" + codigo + "," + nombre + "," + modelo + "," + precio + "," + fecha;
    }

    public String lineCSV2() {

        return codigo + "," + nombre + "," + modelo + "," + precio + "," + fecha + "\n";
    }

    public Funko() {
        precio = 1;
        nombre = "pop";
        modelo = "A";
        fecha = "2020-02-02";
        codigo = "qwdeq";
    }
}
