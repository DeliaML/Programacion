package Tema6;

public class AtaqueFisico implements Ataque {

    private int[] costmoves;
    private int[] dmgmoves;
    private String weapon;

    public int[] getCostmoves() {
        return costmoves;
    }

    public AtaqueFisico(int[] costmoves, int[]dmgmoves, String weapon) {
        this.costmoves = costmoves;
        this.dmgmoves = dmgmoves;
        this.weapon = weapon;
    }

    public AtaqueFisico(int[] costmoves, int[]dmgmoves) {
        this.costmoves = costmoves;
        this.dmgmoves = dmgmoves;
        this.weapon = "Sword";
    }

    public int[] getDmgmoves() {
        return dmgmoves;
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

    //Enseña por pantalla la habilidad del arma equipada

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
