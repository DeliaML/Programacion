package Tema6;

import java.util.Random;

public class Pez extends Animal {


    private int hambre;
    private int sueño;


    public int comer(int comida) {


        if (comida > hambre + 2) return -2;
        return hambre - comida;
    }


    public int dormir(int siesta) {


        if (siesta > sueño) return 0;
        return sueño - siesta;
    }


    public void hacerRuido() {
        System.out.println("Glu glu glu");
    }

    //Si el numero que saca el random es 0 el pez muerde el anzuelo

    public boolean morderAnzuelo() {
        Random random = new Random();
        return (0 == random.nextInt(9));
    }

    public Pez() {
        this.hambre = 0;
        this.sueño = 0;
    }


    public Pez(int hambre, int sueño) {
        this.hambre = hambre;
        this.sueño = sueño;
    }


    public int getHambre() {
        return hambre;
    }


    public int getSueño() {
        return sueño;
    }


    public void setHambre(int hambre) {
        if (hambre >= -20) this.hambre = hambre;
    }


    public void setSueño(int sueño) {
        if (sueño >= 0) this.sueño = sueño;
    }
}


