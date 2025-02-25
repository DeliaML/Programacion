package Tema4;


import java.util.Arrays;


public class PersonaBanco {


    private int dni;
    private Cuenta[] cuenta = new Cuenta[3];
    private int cont;


    public Cuenta[] getCuenta() {


        return cuenta;
    }


    public void addCuenta(Cuenta account) {
        if (cont < cuenta.length) {
            cuenta[cont] = account;
            cont++;
        }
    }


    public PersonaBanco() {
        int dni = 44444444;
        int cont = 0;
    }


    @Override
    public String toString() {
        return "PersonaBanco{" +
                "dni=" + dni +
                ", cuenta=" + Arrays.toString(cuenta) +
                ", cont=" + cont +
                '}';
    }


    public PersonaBanco(int dni) {
        this.dni = dni;
        this.cont = 0;
    }


    public int getDni() {
        return dni;
    }


    public int getCont() {
        return cont;
    }


    public void setDni(int dni) {
        this.dni = dni;
    }


    public void setCuenta(Cuenta[] cuenta) {
        this.cuenta = cuenta;
    }


    public void setCont(int cont) {
        this.cont = cont;
    }


    public boolean isMorosa() {


        for (int i = 0; i < cont; i++) {
            if (cuenta[i].getMoney() < 0) return true;
        }
        return false;
    }
}



