package Tema4;

public abstract class Animal {

    public abstract int comer(int hambre, int comida);

    public abstract int dormir(int sueño, int siesta);

    public abstract void hacerRuido();

    public class Perro extends Animal {

        private int hambre;
        private int sueño;

        public int comer(int hambre, int comida) {

            if (comida > hambre + 20) return -20;
            return hambre - comida;
        }

        public int dormir(int sueño, int siesta) {

            if (siesta > sueño) return 0;
            return sueño - siesta;
        }

        public void hacerRuido() {
            System.out.println("Guau");
        }

        public Perro() {
            this.hambre = 0;
            this.sueño = 0;
        }

        public Perro(int hambre, int sueño) {
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
}
