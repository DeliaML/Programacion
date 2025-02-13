package Tema4;

public class PersonaBanco {

    private int dni;
    private Cuenta[] cuenta = new Cuenta[2];

    public Cuenta[] getCuenta() {

        return cuenta;
    }

    public boolean isMorosa(int[] cuenta) {

        for (int i = 0; i < cuenta.length; i++) {
            if (cuenta[i] < 0) return true;
        }
        return false;
    }
}


