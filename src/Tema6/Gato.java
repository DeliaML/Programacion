package Tema6;

import java.util.Random;

public class Gato extends Animal {

    private int hambre;
    private int sueño;

    public int comer(int comida) {

        if (comida > hambre + 10) return -10;
        return hambre - comida;
    }

    public int dormir(int siesta) {

        if (siesta > sueño) return 0;
        return sueño - siesta;
    }

    //El objeto que tira el gato depende del entero que devuelve el metodo

    public int tirarAlgo() {
        Random random = new Random();
        return random.nextInt(5);
    }

    public void hacerRuido() {
        System.out.println("Uiiaiuuiiiaia");
    }

    public Gato() {
        this.hambre = 0;
        this.sueño = 0;
    }

    public Gato(int hambre, int sueño) {
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
