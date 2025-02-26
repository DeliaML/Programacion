package Tema6;

import java.util.Random;

public class Loro extends Animal {

    private int hambre;
    private int sueño;

    public int comer(int comida) {

        if (comida > hambre + 5) return -5;
        return hambre - comida;
    }

    public int dormir(int siesta) {

        if (siesta > sueño) return 0;
        return sueño - siesta;
    }

    //Quien le habrá enseñado a decir eso al loro

    public void hacerRuido() {
        System.out.println("Jodeeeeeer");
    }

    //Repite una frase aleatorio de un array de Strings

    public String repetirAlgo(String[] frases) {
        Random random = new Random();
        return frases[random.nextInt(frases.length)];
    }


    public Loro() {
        this.hambre = 0;
        this.sueño = 0;
    }

    public Loro(int hambre, int sueño) {
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

