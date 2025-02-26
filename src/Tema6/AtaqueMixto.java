package Tema6;

import java.util.Random;

public class AtaqueMixto implements Ataque {

    private int[] costmoves;
    private int[] dmgmoves;
    private String weapon;
    private String element;

    public int[] getCostmoves() {
        return costmoves;
    }

    public AtaqueMixto(int[] costmoves, int[]dmgmoves, String weapon, String element) {
        this.costmoves = costmoves;
        this.dmgmoves = dmgmoves;
        this.weapon = weapon;
        this.element = element;
    }

    public AtaqueMixto(int[] costmoves, int[]dmgmoves) {
        this.costmoves = costmoves;
        this.dmgmoves = dmgmoves;
        this.weapon = "Sword";
        this.element = "Fire";
    }

    public int[] getDmgmoves() {
        return dmgmoves;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setCostmoves(int[] costmoves) {
        this.costmoves = costmoves;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setDmgmoves(int[] dmgmoves) {
        this.dmgmoves = dmgmoves;
    }

    public boolean lanzarAtaque() {
        return false;
    }

    public int costeAtaque(int move) {
        return costmoves[move];
    }

    public int dañoAtaque(int dmg, int def, int atk) {
        return dmgmoves[dmg] - (atk / def * 2);
    }

    public boolean statAffect() {
        Random random = new Random();
        return (0 == random.nextInt(4));
    }

    public void weaponPassive() {

        switch (weapon) {

            case "Sword":

                System.out.println("Generally great");

                break;

            case "Hammer":

                System.out.println("Higher dmg and cost, lower speed");

                break;

            case "Gun":

                System.out.println("Higher range with low cost and fast speed, low accuracy, can run aout of amno");

                break;
        }
    }
}
