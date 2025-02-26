package Tema6;

public interface Ataque {

    //Los ataques fisicos utilizan armas, los ataques magicos utilizan elementos y los ataques mixtos combinan ambos aspectos en un solo golpe
    //Los ataques se identifican con un entero, hay 2 arrays una de coste de movimientos y otra de daño
    //Ambos identifican el movimiento por la casilla del entero correspondiente y sacan el entero correspondiente al daño o al coste de ella

    //El booleano devuelve falso porque al haber atacado deja de ser su turno
    boolean lanzarAtaque();
    //Lee un entero para identificar el movimiento
    int costeAtaque(int move);
    //dmg es el movimiento a leer por el array de daño y def y atk son variables a leer las estadisticas de unos supuestos personajes
    int dañoAtaque(int dmg, int def, int atk);
}
