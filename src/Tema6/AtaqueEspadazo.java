package Tema6;

public class AtaqueEspadazo implements AtaqueAvanzado {

    private final int basedmg = 80;
    private final int energycost = 20;

    public boolean lanzar() {
        return false;
    }

    //el daño fisico va en los numeros pares de las arrays

    public int[] coste() {
        int[] cost = new int[2];
        cost[0] = energycost;
        return cost;
    }

    public int[] dañoInflingido() {
        int[] dmg = new int[2];
        dmg[0] = basedmg;
        return dmg;
    }
}
