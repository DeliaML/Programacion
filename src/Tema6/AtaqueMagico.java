package Tema6;

import java.util.Random;

public class AtaqueMagico implements Ataque {

    private int[] costmoves;
    private int[] dmgmoves;
    private String element;

    public int[] getCostmoves() {
        return costmoves;
    }

    public AtaqueMagico(int[] costmoves, int[]dmgmoves, String element) {
        this.costmoves = costmoves;
        this.dmgmoves = dmgmoves;
        this.element = element;
    }

    public AtaqueMagico(int[] costmoves, int[]dmgmoves) {
        this.costmoves = costmoves;
        this.dmgmoves = dmgmoves;
        this.element = "Fire";
    }

    public int[] getDmgmoves() {
        return dmgmoves;
    }

    public String getElement() {
        return element;
    }

    public void setCostmoves(int[] costmoves) {
        this.costmoves = costmoves;
    }

    public void setElement(String element) {
        this.element = element;
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

    //Si el random es 0 aplica un estado dependiendo del elemento de los movimientos

    public boolean statAffect() {
        Random random = new Random();
        return (0 == random.nextInt(4));
    }
}
