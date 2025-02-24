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
        this.health = 50;
        this.maxHealth = 50;
        this.experience = 0;
        this.attack = 10;
        this.defense = 10;
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

    public String getNombre() {
        return nombre;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getExperience() {
        return experience;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLevel(int level) {
        if (level > 0) this.level = level;
    }

    public void setHealth(int health) {
         this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        if (maxHealth >= health) this.maxHealth = maxHealth;
    }

    public void setExperience(int experience) {
        if (experience >= 0) this.experience = experience;
    }

    public void setAttack(int attack) {
        if (attack >= 0) this.attack = attack;
    }

    public void setDefense(int defense) {
        if (defense >= 0) this.defense = defense;
    }

    public void drinkPotion() {

        setHealth(health + 10);
        if (health > maxHealth) setHealth(maxHealth);
    }

    public void rest() {

        setHealth(health + 50);
        if (health > maxHealth) setHealth(maxHealth);
    }

    public void levelUp() {

        setHealth(health = health + 5);
        setMaxHealth(maxHealth + 5);
        setAttack(attack ++);
        setDefense(defense ++);
        setExperience(experience - 50);
    }

    public void tankHit(int dmg, int def) {

        setHealth(health - dmg / (def / 5));
        setExperience(experience + 5);
    }

    public void enemyFlee() {

        setHealth(0);
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
