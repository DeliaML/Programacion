package Tema6;

import java.util.Random;

public class Perro extends Animal {

    private int hambre;
    private int sueño;
    private int pis;

    public int comer(int comida) {

        if (comida > hambre + 20) return -20;
        return hambre - comida;
    }

    public int dormir(int siesta) {

        if (siesta > sueño) return 0;
        return sueño - siesta;
    }

    public void hacerRuido() {
        System.out.println("Guau");
    }

    public Perro() {
        this.hambre = 0;
        this.sueño = 0;
        this.pis = 0;
    }

    public Perro(int hambre, int sueño, int pis) {
        this.hambre = hambre;
        this.sueño = sueño;
        this.pis = pis;
    }

   //Si la condicion se cumple el perro se mea en la rueda del vehiculo mas cercano

    public boolean mearRueda() {
        Random random = new Random();
        int aleatorio = random.nextInt(100 - pis);
        if (aleatorio < 20) return true;
        return false;
    }

    public int getHambre() {
        return hambre;
    }

    public int getSueño() {
        return sueño;
    }

    public void setPis(int pis) {
        if (pis >= 0) this.pis = pis;
    }

    public int getPis() {
        return pis;
    }

    public void setHambre(int hambre) {
        if (hambre >= -20) this.hambre = hambre;
    }

    public void setSueño(int sueño) {
        if (sueño >= 0) this.sueño = sueño;
    }
}
