package Tema6;

public class AtaqueBolaFuego implements AtaqueAvanzado {

    private final int basedmg = 120;
    private final int manacost = 50;

    public boolean lanzar() {
        return false;
    }

    //El daño magico va en los numeros impares de las arrays

    public int[] coste() {
        int[] cost = new int[2];
        cost[1] = manacost;
        return cost;
    }

    public int[] dañoInflingido() {
        int[] dmg = new int[2];
        dmg[1] = basedmg;
        return dmg;
    }
}
