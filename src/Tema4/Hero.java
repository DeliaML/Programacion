package Tema4;

public class Hero {

    private String nombre;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    public Hero() {

        this.nombre = "Hero";
        this.level = 1;
        this.health = 15;
        this.maxHealth = 15;
        this.experience = 0;
        this.attack = 5;
        this.defense = 5;
    }

    public Hero(String nombre, int level, int health, int maxHealth, int experience, int attack, int defense) {

        this.nombre = nombre;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }

    public void drinkPotion() {

        health = health + 10;
        if (health > maxHealth) health = maxHealth;
    }

    public void rest() {

        health = health + 50;
        if (health > maxHealth) health = maxHealth;
    }

    public void levelUp() {

        health = health + 5;
        maxHealth = maxHealth + 5;
        attack ++;
        defense ++;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "nombre='" + nombre + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", maxHealth=" + maxHealth +
                ", experience=" + experience +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }


}
