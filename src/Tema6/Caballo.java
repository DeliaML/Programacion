package Tema6;

public class Caballo extends Animal {

        private int hambre;
        private int sueño;
        private int caca;

        public int comer(int comida) {

            if (comida > hambre + 50) return -50;
            return hambre - comida;
        }

        public int dormir(int siesta) {

            if (siesta > sueño) return 0;
            return sueño - siesta;
        }

        //Si detecta que hay gente cerca se acerca a darles un regalo

        public int plantarZurullo(boolean gente) {
            if (gente) return caca;
            return 0;
        }

        public void hacerRuido() {
            System.out.println("Hiiiii");
        }

        public Caballo() {
            this.hambre = 0;
            this.sueño = 0;
            this.caca = 0;
        }

        public Caballo(int hambre, int sueño, int caca) {
            this.hambre = hambre;
            this.sueño = sueño;
            this.caca = caca;
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

