package Tema6;

public class AtaqueEspadazoAvanzado implements AtaqueAvanzado {

    private final int basephydmg = 150;
    private final int manacost = 100;
    private final int basemagdmg = 150;
    private final int energycost = 100;

    public boolean lanzar() {
        return false;
    }

    //el daño fisico va en los numeros pares de las arrays y el daño magico en los impares

    public int[] coste() {
        int[] cost = new int[2];
        cost[0] = energycost;
        cost[1] = manacost;
        return cost;
    }

    public int[] dañoInflingido() {
        int[] dmg = new int[2];
        dmg[0] = basephydmg;
        dmg[1] = basemagdmg;
        return dmg;
    }
}
