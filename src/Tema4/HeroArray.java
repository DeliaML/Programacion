package Tema4;

import Tema5.UsuarioBanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HeroArray {

    public static boolean enemiesDead(List<Hero> enemies) {

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
            int ran = random.nextInt(3);
            List<Hero> enemies = new ArrayList<>(ran);
            for (int i = 0; i < ran; i++) {
                enemies.add(new Hero("Enemy " + (i + 1), 1, 15, 15, 1, 5 * horda, 5 * horda));
            }
            int maxcont = enemies.size();
            while (!enemiesDead(enemies)) {
                for (int i = 0; i <enemies.size(); i++) {
                    flee = random.nextInt(10);
                    if (flee == 0) {
                        enemies.get(i).enemyFlee();
                        System.out.println("Enemy fleed");
                    }
                }
                for (int i = 0; i < enemies.size(); i ++) {
                    if (enemies.get(i).getHealth() > 0) {
                        player.tankHit(enemies.get(i).getAttack(), player.getDefense());
                    }
                    if (player.getExperience() >= 50) player.levelUp();
                }
                enemies.get(cont).tankHit(player.getAttack(), enemies.get(cont).getDefense());
                if (enemies.get(cont).getHealth() == 0) System.out.println("Enemy " + cont + " died");
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
