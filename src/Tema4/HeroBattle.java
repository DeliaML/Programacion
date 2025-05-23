package Tema4;

import java.util.Random;

public class HeroBattle {

    public static boolean enemiesDead(Hero[] enemies) {

        for(Hero enemy: enemies) {
            if (enemy.getHealth() > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int horda = 1;
        int cont = 0;
        int flee;
        int potion;
        int rest;
        Hero player = new Hero();
        while (player.getHealth() > 0) {
            System.out.println("Round: " + horda);
            System.out.println(player);
            Hero[] enemies = new Hero[random.nextInt(3)];
            int maxcont = enemies.length;
            for (int i = 0; i < enemies.length; i++) {
                enemies[i] = new Hero("Enemy " + (i + 1), 1, 15, 15, 1, 5 * horda, 5 * horda);
            }
            while (!enemiesDead(enemies)) {
                for (int i = 0; i <enemies.length; i++) {
                    flee = random.nextInt(10);
                    if (flee == 0) {
                        enemies[i].enemyFlee();
                        System.out.println("Enemy fleed");
                    }
                }
                for (int i = 0; i < enemies.length; i ++) {
                    if (enemies[i].getHealth() > 0) {
                        player.tankHit(enemies[i].getAttack(), player.getDefense());
                    }
                    if (player.getExperience() >= 50) player.levelUp();
                }
                enemies[cont].tankHit(player.getAttack(), enemies[cont].getDefense());
                if (enemies[cont].getHealth() == 0) System.out.println("Enemy " + cont + " died");
                cont ++;
                if (cont > maxcont - 1) cont = 0;
                rest = random.nextInt(100);
                if (rest == 0) {
                    player.rest();
                    System.out.println("You rested and healed for 50 health");
                }
                potion = random.nextInt(10);
                if (potion == 0) {
                    player.drinkPotion();
                    System.out.println("You drank a potion and healed for 10 health");
                }
            }
            System.out.println("Round completed");
            horda ++;
        }
        System.out.println("You survived for " + horda + " rounds");
    }
}
