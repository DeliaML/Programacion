import java.util.Random;
import java.util.Scanner;

public class Parejas {

    public static int[] barajaAnimal() {

        Random random = new Random();

        int serpiente1 = random.nextInt(20);
        int leon1 = random.nextInt(20);
        while (leon1 == serpiente1) leon1 = random.nextInt(20);
        int ornitorrinco1 = random.nextInt(20);
        while (ornitorrinco1 == serpiente1 || ornitorrinco1 == leon1) ornitorrinco1 = random.nextInt(20);
        int raton1 = random.nextInt(20);
        while (raton1 == serpiente1 || raton1 == leon1 || raton1 == ornitorrinco1) raton1 = random.nextInt(20);
        int dragon1 = random.nextInt(20);
        while (dragon1 == serpiente1 || dragon1 == leon1 || dragon1 == raton1 || dragon1 == ornitorrinco1) dragon1 = random.nextInt(20);
        int mono1 = random.nextInt(20);
        while (mono1 == serpiente1 || mono1 == leon1 || mono1 == raton1 || mono1 == ornitorrinco1 || mono1 == dragon1) mono1 = random.nextInt(20);
        int vaca1 = random.nextInt(20);
        while (vaca1 == serpiente1 || vaca1 == leon1 || vaca1 == raton1 || vaca1 == ornitorrinco1 || vaca1 == dragon1 || vaca1 == mono1) vaca1 = random.nextInt(20);
        int cuervo1 = random.nextInt(20);
        while (cuervo1 == serpiente1 || cuervo1 == leon1 || cuervo1 == raton1 || cuervo1 == ornitorrinco1 || cuervo1 == dragon1 || cuervo1 == mono1 || cuervo1 == vaca1) cuervo1 = random.nextInt(20);
        int perro1 = random.nextInt(20);
        while (perro1 == serpiente1 || perro1 == leon1 || perro1 == raton1 || perro1 == ornitorrinco1 || perro1 == dragon1 || perro1 == mono1 || perro1 == vaca1 || perro1 == cuervo1) perro1 = random.nextInt(20);
        int gato1 = random.nextInt(20);
        while (gato1 == serpiente1 || gato1 == leon1 || gato1 == raton1 || gato1 == ornitorrinco1 || gato1 == dragon1 || gato1 == mono1 || gato1 == vaca1 || gato1 == cuervo1 || gato1 == perro1) gato1 = random.nextInt(20);
        int serpiente2 = random.nextInt(20);
        while (serpiente2 == serpiente1 || serpiente2 == leon1 || serpiente2 == raton1 || serpiente2 == ornitorrinco1 || serpiente2 == dragon1 || serpiente2 == mono1 || serpiente2 == vaca1 || serpiente2 == cuervo1 || serpiente2 == perro1 || serpiente2 == gato1) serpiente2 = random.nextInt(20);
        int leon2 = random.nextInt(20);
        while (leon2 == serpiente1 || leon2 == leon1 || leon2 == raton1 || leon2 == ornitorrinco1 || leon2 == dragon1 || leon2 == mono1 || leon2 == vaca1 || leon2 == cuervo1 || leon2 == perro1 || leon2 == gato1 || leon2 == serpiente2) leon2 = random.nextInt(20);
        int ornitorrinco2 = random.nextInt(20);
        while (ornitorrinco2 == serpiente1 || ornitorrinco2 == leon1 || ornitorrinco2 == raton1 || ornitorrinco2 == ornitorrinco1 || ornitorrinco2 == dragon1 || ornitorrinco2 == mono1 || ornitorrinco2 == vaca1 || ornitorrinco2 == cuervo1 || ornitorrinco2 == perro1 || ornitorrinco2 == gato1 || ornitorrinco2 == serpiente2 || ornitorrinco2 == leon2) ornitorrinco2 = random.nextInt(20);
        int raton2 = random.nextInt(20);
        while (raton2 == serpiente1 || raton2 == leon1 || raton2 == raton1 || raton2 == ornitorrinco1 || raton2 == dragon1 || raton2 == mono1 || raton2 == vaca1 || raton2 == cuervo1 || raton2 == perro1 || raton2 == gato1 || raton2 == serpiente2 || raton2 == leon2 || raton2 == ornitorrinco2) raton2 = random.nextInt(20);
        int dragon2 = random.nextInt(20);
        while (dragon2 == serpiente1 || dragon2 == leon1 || dragon2 == raton1 || dragon2 == ornitorrinco1 || dragon2 == dragon1 || dragon2 == mono1 || dragon2 == vaca1 || dragon2 == cuervo1 || dragon2 == perro1 || dragon2 == gato1 || dragon2 == serpiente2 || dragon2 == leon2 || dragon2 == ornitorrinco2 || dragon2 == raton2) dragon2 = random.nextInt(20);
        int mono2 = random.nextInt(20);
        while (mono2 == serpiente1 || mono2 == leon1 || mono2 == raton1 || mono2 == ornitorrinco1 || mono2 == dragon1 || mono2 == mono1 || mono2 == vaca1 || mono2 == cuervo1 || mono2 == perro1 || mono2 == gato1 || mono2 == serpiente2 || mono2 == leon2 || mono2 == ornitorrinco2 || mono2 == raton2 || mono2 == dragon2) mono2 = random.nextInt(20);
        int vaca2 = random.nextInt(20);
        while (vaca2 == serpiente1 || vaca2 == leon1 || vaca2 == raton1 || vaca2 == ornitorrinco1 || vaca2 == dragon1 || vaca2 == mono1 || vaca2 == vaca1 || vaca2 == cuervo1 || vaca2 == perro1 || vaca2 == gato1 || vaca2 == serpiente2 || vaca2 == leon2 || vaca2 == ornitorrinco2 || vaca2 == raton2 || vaca2 == dragon2 || vaca2 == mono2) vaca2 = random.nextInt(20);
        int cuervo2 = random.nextInt(20);
        while (cuervo2 == serpiente1 || cuervo2 == leon1 || cuervo2 == raton1 || cuervo2 == ornitorrinco1 || cuervo2 == dragon1 || cuervo2 == mono1 || cuervo2 == vaca1 || cuervo2 == cuervo1 || cuervo2 == perro1 || cuervo2 == gato1 || cuervo2 == serpiente2 || cuervo2 == leon2 || cuervo2 == ornitorrinco2 || cuervo2 == raton2 || cuervo2 == dragon2 || cuervo2 == mono2 || cuervo2 == vaca2) cuervo2 = random.nextInt(20);
        int perro2 = random.nextInt(20);
        while (perro2 == serpiente1 || perro2 == leon1 || perro2 == raton1 || perro2 == ornitorrinco1 || perro2 == dragon1 || perro2 == mono1 || perro2 == vaca1 || perro2 == cuervo1 || perro2 == perro1 || perro2 == gato1 || perro2 == serpiente2 || perro2 == leon2 || perro2 == ornitorrinco2 || perro2 == raton2 || perro2 == dragon2 || perro2 == mono2 || perro2 == vaca2 || perro2 == cuervo2) perro2 = random.nextInt(20);
        int gato2 = random.nextInt(20);
        while (gato2 == serpiente1 || gato2 == leon1 || gato2 == raton1 || gato2 == ornitorrinco1 || gato2 == dragon1 || gato2 == mono1 || gato2 == vaca1 || gato2 == cuervo1 || gato2 == perro1 || gato2 == gato1 || gato2 == serpiente2 || gato2 == leon2 || gato2 == ornitorrinco2 || gato2 == raton2 || gato2 == dragon2 || gato2 == mono2 || gato2 == vaca2 || gato2 == cuervo2 || gato2 == perro2) gato2 = random.nextInt(20);
        int[] juego = new int [20];
        juego[serpiente1] = 10;
        juego[serpiente2] = 10;
        juego[leon1] = 1;
        juego[leon2] = 1;
        juego[ornitorrinco1] = 2;
        juego[ornitorrinco2] = 2;
        juego[raton1] = 3;
        juego[raton2] = 3;
        juego[dragon1] = 4;
        juego[dragon2] = 4;
        juego[mono1] = 5;
        juego[mono2] = 5;
        juego[vaca1] = 6;
        juego[vaca2] = 6;
        juego[cuervo1] = 7;
        juego[cuervo2] = 7;
        juego[perro1] = 8;
        juego[perro2] = 8;
        juego[gato1] = 9;
        juego[gato2] = 9;

        return juego;
    }

    public static void cualAnimal(int num1, int num2) {

        if (num1 == 10) {
            System.out.println("Serpiente");
        } else if (num1 == 1) {
            System.out.println("León");
        } else if (num1 == 2) {
            System.out.println("Ornitorrinco");
        } else if (num1 == 3) {
            System.out.println("Ratón");
        } else if (num1 == 4) {
            System.out.println("Dragón");
        } else if (num1 == 5) {
            System.out.println("Mono");
        } else if (num1 == 6) {
            System.out.println("Vaca");
        } else if (num1 == 7) {
            System.out.println("Cuervo");
        } else if (num1 == 8) {
            System.out.println("Perro");
        } else System.out.println("Gato");
        if (num2 == 10) {
            System.out.println("Serpiente");
        } else if (num2 == 1) {
            System.out.println("León");
        } else if (num2 == 2) {
            System.out.println("Ornitorrinco");
        } else if (num2 == 3) {
            System.out.println("Ratón");
        } else if (num2 == 4) {
            System.out.println("Dragón");
        } else if (num2 == 5) {
            System.out.println("Mono");
        } else if (num2 == 6) {
            System.out.println("Vaca");
        } else if (num2 == 7) {
            System.out.println("Cuervo");
        } else if (num2 == 8) {
            System.out.println("Perro");
        } else System.out.println("Gato");
    }

    public static boolean haGanado(int[] array) {

        if (array[0] == 0) return false;
        if (array[1] == 0) return false;
        if (array[2] == 0) return false;
        if (array[3] == 0) return false;
        if (array[4] == 0) return false;
        if (array[5] == 0) return false;
        if (array[6] == 0) return false;
        if (array[7] == 0) return false;
        if (array[8] == 0) return false;
        if (array[9] == 0) return false;
        if (array[10] == 0) return false;
        if (array[11] == 0) return false;
        if (array[12] == 0) return false;
        if (array[13] == 0) return false;
        if (array[14] == 0) return false;
        if (array[15] == 0) return false;
        if (array[16] == 0) return false;
        if (array[17] == 0) return false;
        if (array[18] == 0) return false;
        return array[19] != 0;
    }

    public static void arrayTexto (int[] array) {

        for (int i = 0; i < 19; i ++) {
            if (array[i] == 1) System.out.println("León");
            if (array[i] == 2) System.out.println("Ornitorrinco");
            if (array[i] == 3) System.out.println("Ratón");
            if (array[i] == 4) System.out.println("Dragón");
            if (array[i] == 5) System.out.println("Mono");
            if (array[i] == 6) System.out.println("Vaca");
            if (array[i] == 7) System.out.println("Cuervo");
            if (array[i] == 8) System.out.println("Perro");
            if (array[i] == 9) System.out.println("Gato");
            if (array[i] == 10) System.out.println("Serpiente");
            if (array[i] == 0) System.out.println("?");
        }
        if (array[19] == 1) System.out.println("León");
        if (array[19] == 2) System.out.println("Ornitorrinco");
        if (array[19] == 3) System.out.println("Ratón");
        if (array[19] == 4) System.out.println("Dragón");
        if (array[19] == 5) System.out.println("Mono");
        if (array[19] == 6) System.out.println("Vaca");
        if (array[19] == 7) System.out.println("Cuervo");
        if (array[19] == 8) System.out.println("Perro");
        if (array[19] == 9) System.out.println("Gato");
        if (array[19] == 10) System.out.println("Serpiente");
        if (array[19] == 0) System.out.println("?");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[] juego;
        juego = barajaAnimal();
        int[] descubierto = new int [20];
        int con = 0;
        while (con < 10) {
            System.out.println("Introduce números del 0 al 19 para hacer parejas o introduce un 20 para ver las parejas descubiertas");
            System.out.println("Si introduces una pareja ya descubierta perderas");
            System.out.println("Introduce un número");
            int res1 = in.nextInt();
            while (res1 < 0 || res1 > 20) {
                System.out.println("El número tiene que ser del 0 al 20");
                res1 = in.nextInt();
            }
            System.out.println("Introduce otro número");
            int res2 = in.nextInt();
            while (res2 < 0 || res2 > 20 || res2 == res1) {
                System.out.println("El número tiene que ser del 0 al 20 y no puedes poner el mismo número 2 veces seguidas");
                res2 = in.nextInt();
            }
            if (res1 == 20 || res2 == 20) {
                arrayTexto(descubierto);
            }
            int pos1 = res1;
            int pos2 = res2;
            res1 = juego[res1];
            res2 = juego[res2];
            if (res1 == res2) {
                System.out.println("Has descubierto una pareja!");
                descubierto[pos1] = res1;
                descubierto[pos2] = res2;
                cualAnimal(res1, res2);
                con ++;
            } else {
                System.out.println("Los números eran");
                cualAnimal(res1, res2);
            }
        }
        boolean verdad = haGanado(descubierto);
        if (verdad) {
            System.out.println("Has ganado!!!");
            arrayTexto(descubierto);
        } else {
            System.out.println("Introduciste 2 veces la misma pareja y has perdido");
            arrayTexto(descubierto);
        }
    }
}
