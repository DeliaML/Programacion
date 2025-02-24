package Tema4;

public class PersonaBanco {

    private int dni;
    private Cuenta[] cuenta = new Cuenta[2];
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

    public PersonaBanco(int dni, int cont) {
        this.dni = dni;
        this.cont = cont;
    }

    public int getDni() {
        return dni;
    }

    public int getCont() {
        return cont;
    }

    public void setDni(int dni) {
        if (dni % 10000000 <= 9) this.dni = dni;
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


