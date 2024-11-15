package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        double atk1 = 0;
        double def1 = 0;
        double hp1 = 0;
        double spe1 = 0;
        double crate1;
        double cdmg1;
        double hr1;
        double pot1 = 2;
        double acc1;
        double ph1;
        double hpmax1 = 0;
        double healpot1 = 0;
        double atk2 = 0;
        double def2 = 0;
        double hp2 = 0;
        double spe2 = 0;
        double crate2;
        double cdmg2;
        double hr2;
        double pot2 = 2;
        double acc2;
        double ph2;
        double hpmax2 = 0;
        double healpot2 = 0;
        int tiebr;
        int roll;
        int critroll;
        int critdmgroll;
        double hpdin = 80;
        double atkdin = 70;
        double defdin = 50;
        double spedin = 65;
        double cratedin = 15;
        double cdmgdin = 100;
        double hrdin = 1;
        double accdin = 80;
        double phdin = 4;
        double hplob = 110;
        double atklob = 65;
        double deflob = 75;
        double spelob = 30;
        double cratelob = 2;
        double cdmglob = 100;
        double hrlob = 6;
        double acclob = 70;
        double phlob = 3;
        double hpmon = 100;
        double atkmon = 80;
        double defmon = 60;
        double spemon = 60;
        double cratemon = 10;
        double cdmgmon = 190;
        double hrmon = 4;
        double accmon = 95;
        double phmon = 2;
        double hplor = 70;
        double atklor = 70;
        double deflor = 70;
        double spelor = 70;
        double cratelor = 12;
        double cdmglor = 200;
        double hrlor = 5;
        double acclor = 90;
        double phlor = 5;
        double hpdrag = 95;
        double atkdrag = 70;
        double defdrag = 50;
        double spedrag = 65;
        double cratedrag = 15;
        double cdmgdrag = 130;
        double hrdrag = 2;
        double accdrag = 85;
        double phdrag = 1;

        System.out.println("\n" +
                "\n" +
                "   _____           .__                  .__   \n" +
                "  /  _  \\    ____  |__|  _____  _____   |  |  \n" +
                " /  /_\\  \\  /    \\ |  | /     \\ \\__  \\  |  |  \n" +
                "/    |    \\|   |  \\|  ||  Y Y  \\ / __ \\_|  |__\n" +
                "\\____|__  /|___|  /|__||__|_|  /(____  /|____/\n" +
                "        \\/      \\/           \\/      \\/       \n" +
                "                                              \n" +
                "___________.__    ____  .__      __           \n" +
                "\\_   _____/|__|  / ___\\ |  |__ _/  |_         \n" +
                " |    __)  |  | / /_/  >|  |  \\\\   __\\        \n" +
                " |     \\   |  | \\___  / |   Y  \\|  |          \n" +
                " \\___  /   |__|/_____/  |___|  /|__|          \n" +
                "     \\/                      \\/               \n" +
                "\n");
        System.out.println("Pulsa 1 para mirar los personajes o 2 para pelear");
        int resp1 = in.nextInt();
            while (resp1 == 1) {
                System.out.println("Dragon:");
                System.out.println("Vida: 95");
                System.out.println("Ataque: 70");
                System.out.println("Defensa: 50");
                System.out.println("Velocidad 65");
                System.out.println("Probabilidad de crítico: 15%");
                System.out.println("Daño crítico: 130%");
                System.out.println("Regeneración de vida: 2");
                System.out.println("Precisión: 85%");
                System.out.println("Pásiva: Se cura 20 de vida al inflingir un golpe crítico");
                System.out.println("Si inflinge un golpe crítico reduce su probabilidad de crítico en un 5%");
                System.out.println("Si no inflige un golpe crítico aumenta su probabilidad de crítico en un 7,5%");
                System.out.println("Loro");
                System.out.println("Vida: 70");
                System.out.println("Ataque: 70");
                System.out.println("Defensa: 70");
                System.out.println("Velocidad: 70");
                System.out.println("Probabilidad de crítico: 12%");
                System.out.println("Daño crítico: 200%");
                System.out.println("Regeneración de vida: 5");
                System.out.println("Precisión: 90%");
                System.out.println("Pasiva: Obtiene la pasiva de otro personaje al azar");
                System.out.println("Mono");
                System.out.println("Vida: 80");
                System.out.println("Ataque: 80");
                System.out.println("Defensa: 60");
                System.out.println("Velocidad: 60");
                System.out.println("Probabilidad de crítico: 10%");
                System.out.println("Daño crítico: 190%");
                System.out.println("Regeneración de vida: 4");
                System.out.println("Precisión: 95%");
                System.out.println("Pasiva: Inflinge daño según su ataque y velocidad");
                System.out.println("además obtiene 5 puntos de velocidad al terminar cada turno hasta 200");
                System.out.println("Lobo");
                System.out.println("Vida: 110");
                System.out.println("Ataque: 65");
                System.out.println("Defensa: 45");
                System.out.println("Velocidad: 60");
                System.out.println("Probabilidad de crítico: 2%");
                System.out.println("Daño crítico: 100%");
                System.out.println("Regeneración de vida: 6");
                System.out.println("Precisión: 70%");
                System.out.println("Pasiva: Al recibir daño obtiene un 3% de probabilidad de crítico y un 20% de daño crítico");
                System.out.println("Dinosaurio");
                System.out.println("Vida: 80");
                System.out.println("Ataque: 70");
                System.out.println("Defensa: 50");
                System.out.println("Velocidad: 80");
                System.out.println("Probabilidad de crítico: 50%");
                System.out.println("Daño crítico: 75-300%");
                System.out.println("Regeneración de vida: 1");
                System.out.println("Precisión: 80%");
                System.out.println("Pasiva: Tiene un 50% de probabilidad de crítico, pero su daño crítico varia entre 75% y 300%");
                System.out.println("Pulsa 2 para pelear");
                resp1 = in.nextInt();
            }

            if (resp1 == 2) {
                System.out.println("Jugador 1 pulsa los siguientes numeros para escoger personaje");
                System.out.println("Dragon: 1, Loro: 2, Mono: 3, Lobo: 4, Dinosaurio: 5");
                int resp2 = in.nextInt();
                switch (resp2) {
                    case 1:
                        atk1 = atkdrag;
                        def1 = defdrag;
                        hp1 = hpdrag;
                        spe1 = spedrag;
                        crate1 = cratedrag;
                        cdmg1 = cdmgdrag;
                        hr1 = hrdrag;
                        acc1 = accdrag;
                        ph1 = phdrag;
                        hpmax1 = hpdrag;
                        break;
                    case 2:
                        atk1 = atklor;
                        def1 = deflor;
                        hp1 = hplor;
                        spe1 = spelor;
                        crate1 = cratelor;
                        cdmg1 = cdmglor;
                        hr1 = hrlor;
                        acc1 = acclor;
                        ph1 = phlor;
                        hpmax1 = hplor;
                        break;
                    case 3:
                        atk1 = atkmon;
                        def1 = defmon;
                        hp1 = hpmon;
                        spe1 = spemon;
                        crate1 = cratemon;
                        cdmg1 = cdmgmon;
                        hr1 = hrmon;
                        acc1 = accmon;
                        ph1 = phmon;
                        hpmax1 = hpmon;
                        break;
                    case 4:
                        atk1 = atklob;
                        def1 = deflob;
                        hp1 = hplob;
                        spe1 = spelob;
                        crate1 = cratelob;
                        cdmg1 = cdmglob;
                        hr1 = hrlob;
                        acc1 = acclob;
                        ph1 = phlob;
                        hpmax1 = hplob;
                        break;
                    case 5:
                        atk1 = atkdin;
                        def1 = defdin;
                        hp1 = hpdin;
                        spe1 = spedin;
                        crate1 = cratedin;
                        cdmg1 = cdmgdin;
                        hr1 = hrdin;
                        acc1 = accdin;
                        ph1 = phdin;
                        hpmax1 = hpdin;
                        break;
                    default:
                        System.out.println("Introduce un numero del 1 al 5");
                }
                System.out.println("Jugador 2 pulsa los siguientes numeros para escoger personaje");
                System.out.println("Dragon: 1, Loro: 2, Mono: 3, Lobo: 4, Dinosaurio: 5");
                int resp3 = in.nextInt();

                switch (resp3) {
                    case 1:
                        atk2 = atkdrag;
                        def2 = defdrag;
                        hp2 = hpdrag;
                        spe2 = spedrag;
                        crate2 = cratedrag;
                        cdmg2 = cdmgdrag;
                        hr2 = hrdrag;
                        acc2 = accdrag;
                        ph2 = phdrag;
                        hpmax2 = hpdrag;
                        break;
                    case 2:
                        atk2 = atklor;
                        def2 = deflor;
                        hp2 = hplor;
                        spe2 = spelor;
                        crate2 = cratelor;
                        cdmg2 = cdmglor;
                        hr2 = hrlor;
                        acc2 = acclor;
                        ph2 = phlor;
                        hpmax2 = hplor;
                        break;
                    case 3:
                        atk2 = atkmon;
                        def2 = defmon;
                        hp2 = hpmon;
                        spe2 = spemon;
                        crate2 = cratemon;
                        cdmg2 = cdmgmon;
                        hr2 = hrmon;
                        acc2 = accmon;
                        ph2 = phmon;
                        hpmax2 = hpmon;
                        break;
                    case 4:
                        atk2 = atklob;
                        def2 = deflob;
                        hp2 = hplob;
                        spe2 = spelob;
                        crate2 = cratelob;
                        cdmg2 = cdmglob;
                        hr2 = hrlob;
                        acc2 = acclob;
                        ph2 = phlob;
                        hpmax2 = hplob;
                        break;
                    case 5:
                        atk2 = atkdin;
                        def2 = defdin;
                        hp2 = hpdin;
                        spe2 = spedin;
                        crate2 = cratedin;
                        cdmg2 = cdmgdin;
                        hr2 = hrdin;
                        acc2 = accdin;
                        ph2 = phdin;
                        hpmax2 = hpdin;
                        break;
                    default:
                        System.out.println("Introduce un numero del 1 al 5");
                }
            }
                healpot1 = 20 + (200 - ((hpmax1 / hp1) / 5));
                healpot2 = 20 + (200 - ((hpmax2 / hp2) / 5));
                while (hp1 > 0 || hp2 > 0) {
                    if (spe1 > spe2) {
                        if (pot1 > 0) {
                            System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                            int resp4 = in.nextInt();
                            while (resp4 < 1 || resp4 > 2) {
                                System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                                resp4 = in.nextInt();
                            }
                            if (resp4 == 1) {
                                roll = random.nextInt(3);
                                switch (roll) {
                                    case 0:
                                        hp2 = hp2 - (((def2 * 4) / atk1) + 25);
                                        System.out.println(hp2);
                                        break;
                                    case 1:
                                        hp2 = hp2 - (((def2 * 4) / atk1) + 30);
                                        System.out.println(hp2);
                                        break;
                                    case 2:
                                        hp2 = hp2 - (((def2 * 4) / atk1) + 35);
                                        System.out.println(hp2);
                                        break;
                            } if (resp4 == 2) {
                                    hp1 = hp1 + healpot1;
                                    pot1 --;
                                } if (hp1 > hpmax1) {
                                    hp1 = hpmax1;
                                }

                        } else {
                            roll = random.nextInt(3);
                            switch (roll) {
                                case 0:
                                    hp2 = hp2 - (((def2 * 4) / atk1) + 25);
                                    System.out.println(hp2);
                                    break;
                                case 1:
                                    hp2 = hp2 - (((def2 * 4) / atk1) + 30);
                                    System.out.println(hp2);
                                    break;
                                case 2:
                                    hp2 = hp2 - (((def2 * 4) / atk1) + 35);
                                    System.out.println(hp2);
                                    break;
                            }
                            if (hp2 > 0) {
                                if (pot2 > 0) {
                                    System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                                    int resp5 = in.nextInt();
                                    while (resp5 < 1 || resp5 > 2) {
                                        System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                                        resp5 = in.nextInt();
                                    if (resp5 == 1) {
                                        roll = random.nextInt(3);
                                        switch (roll) {
                                            case 0:
                                                hp1 = hp1 - (((def1 * 4) / atk2) + 25);
                                                System.out.println(hp1);
                                                break;
                                            case 1:
                                                hp1 = hp1 - (((def1 * 4) / atk2) + 30);
                                                System.out.println(hp1);
                                                break;
                                            case 2:
                                                hp1 = hp1 - (((def1 * 4) / atk2) + 35);
                                                System.out.println(hp1);
                                                break;
                                        } if (resp5 == 2) {
                                            hp2 = hp2 + healpot2;
                                            pot2 --;
                                        } if (hp2 > hpmax2) {
                                            hp2 = hpmax2;
                                        }
                                } else {
                                    roll = random.nextInt(3);
                                    switch (roll) {
                                        case 0:
                                            hp1 = hp1 - (((def1 * 4) / atk2) + 25);
                                            System.out.println(hp1);
                                            break;
                                        case 1:
                                            hp1 = hp1 - (((def1 * 4) / atk2) + 30);
                                            System.out.println(hp1);
                                            break;
                                        case 2:
                                            hp1 = hp1 - (((def1 * 4) / atk2) + 35);
                                            System.out.println(hp1);
                                            break;
                        }
                    } if (spe2 > spe1) {
                        if (pot2 > 0) {
                            System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                            int resp6 = in.nextInt();
                            while (resp6 < 1 || resp6 > 2) {
                                System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                                resp6 = in.nextInt();
                            if (resp6 == 1) {
                                roll = random.nextInt(3);
                                switch (roll) {
                                    case 0:
                                        hp1 = hp1 - (((def1 * 4) / atk2) + 25);
                                        System.out.println(hp1);
                                        break;
                                    case 1:
                                        hp1 = hp1 - (((def1 * 4) / atk2) + 30);
                                        System.out.println(hp1);
                                        break;
                                    case 2:
                                        hp1 = hp1 - (((def1 * 4) / atk2) + 35);
                                        System.out.println(hp1);
                                        break;
                                } if (resp6 == 2) {
                                    hp2 = hp2 + healpot2;
                                    pot2 --;
                                } if (hp2 > hpmax2) {
                                    hp2 = hpmax2;
                                }
                        } else {
                            roll = random.nextInt(3);
                            switch (roll) {
                                case 0:
                                    hp1 = hp1 - (((def1 * 4) / atk2) + 25);
                                    System.out.println(hp1);
                                    break;
                                case 1:
                                    hp1 = hp1 - (((def1 * 4) / atk2) + 30);
                                    System.out.println(hp1);
                                    break;
                                case 2:
                                    hp1 = hp1 - (((def1 * 4) / atk2) + 35);
                                    System.out.println(hp1);
                                    break;
                            }
                            if (hp1 > 0) {
                                if (pot1 > 0) {
                                    System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                                    int resp7 = in.nextInt();
                                    while (resp7 < 1 || resp7 > 2) {
                                        System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                                        resp7 = in.nextInt();
                                    if (resp7 == 1) {
                                        roll = random.nextInt(3);
                                        switch (roll) {
                                            case 0:
                                                hp2 = hp2 - (((def2 * 4) / atk1) + 25);
                                                System.out.println(hp2);
                                                break;
                                            case 1:
                                                hp2 = hp2 - (((def2 * 4) / atk1) + 30);
                                                System.out.println(hp2);
                                                break;
                                            case 2:
                                                hp2 = hp2 - (((def2 * 4) / atk1) + 35);
                                                System.out.println(hp2);
                                                break;
                                        } if (resp7 == 2) {
                                            hp1 = hp1 + healpot1;
                                            pot1 --;
                                        } if (hp1 > hpmax1) {
                                            hp1 = hpmax1;
                                        }
                                } else {
                                    roll = random.nextInt(3);
                                    switch (roll) {
                                        case 0:
                                            hp2 = hp2 - (((def2 * 4) / atk1) + 25);
                                            System.out.println(hp2);
                                            break;
                                        case 1:
                                            hp2 = hp2 - (((def2 * 4) / atk1) + 30);
                                            System.out.println(hp2);
                                            break;
                                        case 2:
                                            hp2 = hp2 - (((def2 * 4) / atk1) + 35);
                                            System.out.println(hp2);
                                            break;
                                }
                            } if (hp1 <= 0) {
                                break;
                            }
                        }
                    } if (spe1 == spe2) {
                        tiebr = random.nextInt(2);
                        if (tiebr == 0) {
                            if (pot1 > 0) {
                                System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                                int resp8 = in.nextInt();
                                while (resp8 < 1 || resp8 > 2) {
                                    System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                                    resp8 = in.nextInt();
                                if (resp8 == 1) {
                                    roll = random.nextInt(3);
                                    switch (roll) {
                                        case 0:
                                            hp2 = hp2 - (((def2 * 4) / atk1) + 25);
                                            System.out.println(hp2);
                                            break;
                                        case 1:
                                            hp2 = hp2 - (((def2 * 4) / atk1) + 30);
                                            System.out.println(hp2);
                                            break;
                                        case 2:
                                            hp2 = hp2 - (((def2 * 4) / atk1) + 35);
                                            System.out.println(hp2);
                                            break;
                                    } if (resp8 == 2) {
                                        hp1 = hp1 + healpot1;
                                        pot1 --;
                                    } if (hp1 > hpmax1) {
                                        hp1 = hpmax1;
                                    }
                            } else {
                                roll = random.nextInt(3);
                                switch (roll) {
                                    case 0:
                                        hp2 = hp2 - (((def2 * 4) / atk1) + 25);
                                        System.out.println(hp2);
                                        break;
                                    case 1:
                                        hp2 = hp2 - (((def2 * 4) / atk1) + 30);
                                        System.out.println(hp2);
                                        break;
                                    case 2:
                                        hp2 = hp2 - (((def2 * 4) / atk1) + 35);
                                        System.out.println(hp2);
                                        break;
                                }
                                if (hp2 > 0) {
                                    if (pot2 > 0) {
                                        System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                                        int resp9 = in.nextInt();
                                        if (resp9 == 1) {
                                            roll = random.nextInt(3);
                                            switch (roll) {
                                                case 0:
                                                    hp1 = hp1 - (((def1 * 4) / atk2) + 25);
                                                    System.out.println(hp1);
                                                    break;
                                                case 1:
                                                    hp1 = hp1 - (((def1 * 4) / atk2) + 30);
                                                    System.out.println(hp1);
                                                    break;
                                                case 2:
                                                    hp1 = hp1 - (((def1 * 4) / atk2) + 35);
                                                    System.out.println(hp1);
                                                    break;
                                            } if (resp9 == 2) {
                                                hp2 = hp2 + healpot2;
                                                pot2 --;
                                            } if (hp2 > hpmax2) {
                                                hp2 = hpmax2;
                                            }
                                    } else {
                                        roll = random.nextInt(3);
                                        switch (roll) {
                                            case 0:
                                                hp1 = hp1 - (((def1 * 4) / atk2) + 25);
                                                System.out.println(hp1);
                                                break;
                                            case 1:
                                                hp1 = hp1 - (((def1 * 4) / atk2) + 30);
                                                System.out.println(hp1);
                                                break;
                                            case 2:
                                                hp1 = hp1 - (((def1 * 4) / atk2) + 35);
                                                System.out.println(hp1);
                                                break;
                            }
                        } if (tiebr == 1) {
                            if (pot2 > 0) {
                                System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                                int resp10 = in.nextInt();
                                while (resp10 < 1 || resp10 > 2) {
                                    System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                                    resp10 = in.nextInt();
                                if (resp10 == 1) {
                                    roll = random.nextInt(3);
                                    switch (roll) {
                                        case 0:
                                            hp1 = hp1 - (((def1 * 4) / atk2) + 25);
                                            System.out.println(hp1);
                                            break;
                                        case 1:
                                            hp1 = hp1 - (((def1 * 4) / atk2) + 30);
                                            System.out.println(hp1);
                                            break;
                                        case 2:
                                            hp1 = hp1 - (((def1 * 4) / atk2) + 35);
                                            System.out.println(hp1);
                                            break;
                                    } if (resp10 == 2) {
                                        hp2 = hp2 + healpot2;
                                        pot2 --;
                                    } if (hp2 > hpmax2) {
                                        hp2 = hpmax2;
                                    }
                            } else {
                                roll = random.nextInt(3);
                                switch (roll) {
                                    case 0:
                                        hp1 = hp1 - (((def1 * 4) / atk2) + 25);
                                        System.out.println(hp1);
                                        break;
                                    case 1:
                                        hp1 = hp1 - (((def1 * 4) / atk2) + 30);
                                        System.out.println(hp1);
                                        break;
                                    case 2:
                                        hp1 = hp1 - (((def1 * 4) / atk2) + 35);
                                        System.out.println(hp1);
                                        break;
                                }
                                if (hp1 > 0) {
                                    if (pot1 > 0) {
                                        System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                                        int resp11 = in.nextInt();
                                        while (resp11 < 1 || resp11 > 2) {
                                            System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                                            resp11 = in.nextInt();
                                        if (resp11 == 1) {
                                            roll = random.nextInt(3);
                                            switch (roll) {
                                                case 0:
                                                    hp2 = hp2 - (((def2 * 4) / atk1) + 25);
                                                    System.out.println(hp2);
                                                    break;
                                                case 1:
                                                    hp2 = hp2 - (((def2 * 4) / atk1) + 30);
                                                    System.out.println(hp2);
                                                    break;
                                                case 2:
                                                    hp2 = hp2 - (((def2 * 4) / atk1) + 35);
                                                    System.out.println(hp2);
                                                    break;
                                            } if (resp11 == 2) {
                                                hp1 = hp1 + healpot1;
                                                pot1 --;
                                            } if (hp1 > hpmax1) {
                                                hp1 = hpmax1;
                                            }
                                    } else {
                                        roll = random.nextInt(3);
                                        switch (roll) {
                                            case 0:
                                                hp2 = hp2 - (((atk1 * 2) / def2) + 25);
                                                System.out.println(hp2);
                                                break;
                                            case 1:
                                                hp2 = hp2 - (((atk1 * 1) / def2) + 30);
                                                System.out.println(hp2);
                                                break;
                                            case 2:
                                                hp2 = hp2 - (((atk1 * 2) / def2) + 35);
                                                System.out.println(hp2);
                                                break;
                                        }}}}}}
                            }
                        }
                    }
                }

            if (resp1 < 1 && resp1 > 2) {
                System.out.println("Introduce 1 o 2");
        }

    }
}}}}}}}}}}}}}}}}}}}

