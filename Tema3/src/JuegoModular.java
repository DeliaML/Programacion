import java.util.Random;
import java.util.Scanner;

public class JuegoModular {

    public static void estadisticasPersonajes() {

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
        System.out.println("Si no inflige un golpe crítico aumenta su probabilidad de crítico en un 5%");
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
        System.out.println("Ataque: 100");
        System.out.println("Defensa: 60");
        System.out.println("Velocidad: 20");
        System.out.println("Probabilidad de crítico: 5%");
        System.out.println("Daño crítico: 190%");
        System.out.println("Regeneración de vida: 4");
        System.out.println("Precisión: 95%");
        System.out.println("Obtiene 5 puntos de velocidad al terminar cada turno hasta 200");
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
        System.out.println("Pulsa cualquier tecla para pelear");
    }

    public static void tituloJuego() {

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
    }

    public static int primeroAtaca(int atk1, int def2, int hp2, int cdmg1, int con) {
//Calculo de si un golpe es crítico o no
        Random random = new Random();
        if (con == 1) {
            int roll = random.nextInt(3);
            switch (roll) {
                case 0:
                    //Formula de daño bajo
                    hp2 = hp2 - (cdmg1 / 100) * (((atk1 * 2) / def2) + 25);
                    //Indicador de golpe crítico
                    break;
                case 1:
                    //Formula de daño medio
                    hp2 = hp2 - (cdmg1 / 100) * (((atk1 * 2) / def2) + 30);
                    break;
                case 2:
                    //Formula de daño alto
                    hp2 = hp2 - (cdmg1 / 100) * (((atk1 * 2) / def2) + 35);
                    break;
            }
        }
        if (con == 0) {
            int roll = random.nextInt(3);
            switch (roll) {
                case 0:
                    hp2 = hp2 - (((atk1 * 2) / def2) + 25);
                    break;
                case 1:
                    hp2 = hp2 - (((atk1 * 2) / def2) + 30);
                    break;
                case 2:
                    hp2 = hp2 - (((atk1 * 2) / def2) + 35);
                    break;
            }
        }
        return hp2;
    }

    public static int segundoAtaca(int atk2, int def1, int hp1, int cdmg2, int con) {
        Random random = new Random();
        if (con == 1) {
            int roll = random.nextInt(3);
            switch (roll) {
                case 0:
                    hp1 = hp1 - (cdmg2 / 100) * (((atk2 * 2) / def1) + 25);

                    break;
                case 1:
                    hp1 = hp1 - (cdmg2 / 100) * (((atk2 * 2) / def1) + 30);

                    break;
                case 2:
                    hp1 = hp1 - (cdmg2 / 100) * (((atk2 * 2) / def1) + 35);

                    break;
            }
        }
        if (con == 0) {
            int roll = random.nextInt(3);
            switch (roll) {
                case 0:
                    hp1 = hp1 - (((atk2 * 2) / def1) + 25);

                    break;
                case 1:
                    hp1 = hp1 - (((atk2 * 2) / def1) + 30);

                    break;
                case 2:
                    hp1 = hp1 - (((atk2 * 2) / def1) + 35);

                    break;
            }
        }
        return hp1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        //Algunas variables tienen valores que no van a cambiar y otras tienen valores no correctos porque se van a cambiar y hace falta que sean así para que funcione correctamente
        int con = 0;
        //atk = ataque
        int atk1 = 0;
        //def = defensa
        int def1 = 0;
        //hp = vida
        int hp1 = 1;
        //spe = velocidad
        int spe1 = 0;
        //crate = probabilidad de critico
        int crate1 = 10;
        //cdmg = daño critico, el daño critico cambia el daño del golpe critico, si es menor a 100 ahce que los golpes criticos hagan menos daño
        int cdmg1 = 200;
        //hr = regeneración de vida, es la vida que se curán automáticamente al finalizar el turno
        int hr1 = 2;
        //pot = poción, siempre se empiezan con 2, se usan para curarse y no se pueden usar si te quedas sin
        int pot1 = 2;
        //ph = pasiva, es el identificador de pasiva, cambia según el personaje y por defecto no hace nada
        int ph1 = 5;
        //hpmax = vida máxima, se utiliza para que la vida no pueda ser mayor que la vida máxima en curaciones
        int hpmax1 = 1;
        //healpot es la formula de curación de la pócion, cura más vida cada vez que menos vida tengas
        int healpot1 = 0;
        int atk2 = 0;
        int def2 = 0;
        int hp2 = 1;
        int spe2 = 0;
        int crate2 = 10;
        int cdmg2 = 200;
        int hr2 = 2;
        int pot2 = 2;
        int ph2 = 5;
        int hpmax2 = 1;
        int healpot2 = 0;
        //tiebr se utiliza para escoger quien ataca antes si ambos jugadores tienen la misma velocidad
        int tiebr;
        //roll se utiliza para la mayoría de veces que se tenga que escoger algo al azar
        int roll;
        //critroll se utiliza para escoger si un golpe es crítico o no
        int critroll;
        //A continuación están los valores de los personajes
        int hpdin = 80;
        int atkdin = 70;
        int defdin = 50;
        int spedin = 65;
        int cratedin = 15;
        int cdmgdin = 100;
        int hrdin = 1;
        int phdin = 0;
        int hplob = 110;
        int atklob = 65;
        int deflob = 75;
        int spelob = 30;
        int cratelob = 2;
        int cdmglob = 100;
        int hrlob = 6;
        int phlob = 1;
        int hpmon = 100;
        int atkmon = 100;
        int defmon = 60;
        int spemon = 40;
        int cratemon = 5;
        int cdmgmon = 190;
        int hrmon = 2;
        int phmon = 2;
        int hplor = 70;
        int atklor = 70;
        int deflor = 70;
        int spelor = 70;
        int cratelor = 12;
        int cdmglor = 200;
        int hrlor = 4;
        int phlor = 5;
        int hpdrag = 95;
        int atkdrag = 70;
        int defdrag = 50;
        int spedrag = 65;
        int cratedrag = 15;
        int cdmgdrag = 130;
        int hrdrag = 2;
        int phdrag = 3;
        //Las respuestas se utilizán para guardar las respuestas introducidas que se utilicen a futuro
        int resp1;
        int resp2;
        int resp3;
        int resp4 = 0;
        int resp5 = 0;
        int resp6 = 0;
        int resp7 = 0;
        int resp8 = 0;
        int resp9 = 0;
        int resp10 = 0;
        int resp11 = 0;
        //Las condiciones se utilizán para utilizar las pasivas de los personajes y otras cosas
        int con1 = 0;
        int con2 = 0;
        int con3 = 0;
        int con4 = 0;
        int con5 = 0;
        int con6 = 0;
        int con7 = 0;
        //Indicador del turno actual
        int turn = 1;
        //Para la barra de vida
        String barra = "-";

        tituloJuego();

        System.out.println("Pulsa 1 para mirar los personajes, 2 para pelear con personajes y 3 para combatir escogiendo estadisticas");
        resp1 = in.nextInt();
        //Para obligarte a introducir una respuesta valida
        while (resp1 < 1 || resp1 > 3) {
            System.out.println("Pulsa 1 para mirar los personajes, 2 para pelear con personajes y 3 para combatir escogiendo estadisticas");
            resp1 = in.nextInt();
        }
        while (resp1 == 1) {
            estadisticasPersonajes();
            resp1 = in.nextInt();
            resp1 = 2;
        }
        while (resp1 == 3) {
            System.out.println("Jugador 1 escoge tus estadisticas con 200 de maximo por valor y 500 de total");
            System.out.println("Vida");
            hp1 = in.nextInt();
            System.out.println("Ataque");
            atk1 = in.nextInt();
            System.out.println("Defensa");
            def1 = in.nextInt();
            System.out.println("Velocidad");
            spe1 = in.nextInt();
            //con5 tiene que ser 0 para que se pueda salir de la asignación de estádisticas
            //Para que los valores no puedan tener más de 200 puntos
            if (hp1 > 200 || atk1 > 200 || def1 > 200 || spe1 > 200) {
                System.out.println("Escoge valores de hasta 200");
                con5 = 1;
            }
            //Para que el total de los valores no pueda ser superior a 500
            if (hp1 + atk1 + def1 + spe1 > 500) {
                System.out.println("El total de estadisticas no puede ser mayor a 500");
                con5 = 1;
            }
            System.out.println("Jugador 2 escoge tus estadisticas con 200 de maximo por valor y 500 de total");
            System.out.println("Vida");
            hp2 = in.nextInt();
            System.out.println("Ataque");
            atk2 = in.nextInt();
            System.out.println("Defensa");
            def2 = in.nextInt();
            System.out.println("Velocidad");
            spe2 = in.nextInt();
            if (hp2 > 200 || atk2 > 200 || def2 > 200 || spe2 > 200) {
                System.out.println("Escoge valores de hasta 200");
                con5 = 1;
            }
            if (hp2 + atk2 + def2 + spe2 > 500) {
                System.out.println("El total de estadisticas no puede ser mayor a 500");
                con5 = 1;
            }
            if (con5 == 0) {
                resp1 = 4;
            }
            con5 --;
            hpmax1 = hp1;
            hpmax2 = hp2;
        }
        if (resp1 == 2) {
            System.out.println("Jugador 1 pulsa los siguientes numeros para escoger personaje");
            System.out.println("Dragon: 1, Loro: 2, Mono: 3, Lobo: 4, Dinosaurio: 5");
            resp2 = in.nextInt();
            switch (resp2) {
                case 1:
                    atk1 = atkdrag;
                    def1 = defdrag;
                    hp1 = hpdrag;
                    spe1 = spedrag;
                    crate1 = cratedrag;
                    cdmg1 = cdmgdrag;
                    hr1 = hrdrag;
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
                    ph1 = phdin;
                    hpmax1 = hpdin;
                    break;
                default:
                    System.out.println("Introduce un numero del 1 al 5");
            }
            System.out.println("Jugador 2 pulsa los siguientes numeros para escoger personaje");
            System.out.println("Dragon: 1, Loro: 2, Mono: 3, Lobo: 4, Dinosaurio: 5");
            resp3 = in.nextInt();

            switch (resp3) {
                case 1:
                    atk2 = atkdrag;
                    def2 = defdrag;
                    hp2 = hpdrag;
                    spe2 = spedrag;
                    crate2 = cratedrag;
                    cdmg2 = cdmgdrag;
                    hr2 = hrdrag;
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
                    ph2 = phdin;
                    hpmax2 = hpdin;
                    break;
                default:
                    System.out.println("Introduce un numero del 1 al 5");
            }
        }
        while (hp1 > 0 && hp2 > 0) {
            //Pasiva del loro
            if (ph1 == phlor && con6 == 0) {
                roll = random.nextInt(4);
                switch (roll) {
                    case 0:
                        ph1 = phdin;
                        System.out.println("El loro ha conseguido la pasiva del dinosaurio");
                        con6 ++;
                        break;
                    case 1:
                        ph1 = phlob;
                        System.out.println("El loro ha conseguido la pasiva del lobo");
                        con6 ++;
                        break;
                    case 2:
                        ph1 = phmon;
                        System.out.println("El loro ha conseguido la pasiva del mono");
                        con6 ++;
                        break;
                    case 3:
                        ph1 = phdrag;
                        System.out.println("El loro ha conseguido la pasiva del dragón");
                        con6++;
                        break;
                }
            }
            if (ph2 == phlor && con7 == 0) {
                roll = random.nextInt(4);
                switch (roll) {
                    case 0:
                        ph2 = phdin;
                        System.out.println("El loro ha conseguido la pasiva del dinosaurio");
                        con7 ++;
                        break;
                    case 1:
                        ph2 = phlob;
                        System.out.println("El loro ha conseguido la pasiva del lobo");
                        con7 ++;
                        break;
                    case 2:
                        ph2 = phmon;
                        System.out.println("El loro ha conseguido la pasiva del mono");
                        con7 ++;
                        break;
                    case 3:
                        ph2 = phdrag;
                        System.out.println("El loro ha conseguido la pasiva del dragón");
                        con7 ++;
                        break;
                }
            }
            //Pasiva del dinosaurio
            if (ph1 == phdin) {
                roll = random.nextInt(226);
                cdmg1 = roll + 75;
                System.out.println("El daño crítico del dinosaurio ahora es un " + cdmg1 + "%");
            }
            if (ph2 == phdin) {
                roll = random.nextInt(226);
                cdmg2 = roll + 75;
                System.out.println("El daño crítico del dinosaurio ahora es un " + cdmg2 + "%");
            }
            //En caso de que el Jugador 1 sea más rápido
            if (spe1 > spe2) {
                //En caso de que el Jugador aún tenga pociones
                if (pot1 > 0) {
                    System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                    resp4 = in.nextInt();
                    //Para obligarte ha escoger una opción correcta
                    while (resp4 < 1 || resp4 > 2) {
                        System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                        resp4 = in.nextInt();
                    }
                }
                if (resp4 == 1) {
                    //Calculo de si un golpe es crítico o no
                    critroll = random.nextInt(99);
                    if (critroll < crate1) con3 = 1; con = 1;
                    hp2 = primeroAtaca(atk1, def2, hp2, cdmg1, con);
                    con1 = 1; con --;
                    //Pasiva del dragón
                    if (ph1 == phdrag && con3 == 1) {
                        crate1 = crate1 - 5;
                        hp1 = hp1 + 20;
                        con3++;
                        System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                    }
                    if (hp1 > hpmax1) {
                        hp1 = hpmax1;
                    }
                }
                if (resp4 == 2) {
                    //Formula de curación de la poción
                    healpot1 = 20 + (200 - ((hpmax1 / hp1) / 5));
                    hp1 = hp1 + healpot1;
                    pot1--;
                }
                if (hp1 > hpmax1) {
                    hp1 = hpmax1;
                }
                //Para hacer que los bucles funcionen correctamente
                resp4 = 0;
                //En caso de que el jugador no tenga pociones
                if (pot1 == 0) {
                    critroll = random.nextInt(99);
                    if (critroll < crate1) con3 = 1; con = 1;
                    hp2 = primeroAtaca(atk1, def2, hp2, cdmg1, con);
                    con1 = 1; con --;
                    if (ph1 == phdrag && con3 == 1) {
                        crate1 = crate1 - 5;
                        hp1 = hp1 + 20;
                        con3++;
                        System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                    }
                    if (hp1 > hpmax1) {
                        hp1 = hpmax1;
                    }
                }
            }
            //Para que el siguiente jugador no ataque si ha perdido
            if (hp2 > 0) {
                if (pot2 > 0) {
                    System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                    resp5 = in.nextInt();
                    while (resp5 < 1 || resp5 > 2) {
                        System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                        resp5 = in.nextInt();
                    }
                }
                if (resp5 == 1) {
                    critroll = random.nextInt(99);
                    if (critroll < crate2) con4 = 1; con = 1;
                    hp1 = segundoAtaca(atk2, def1, hp1, cdmg2, con);
                    con2 = 1; con --;
                    if (ph2 == phdrag && con4 == 1) {
                        crate2 = crate2 - 5;
                        hp2 = hp2 + 20;
                        con4++;
                        System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                    }
                    if (hp2 > hpmax2) {
                        hp2 = hpmax2;
                    }
                }
                if (resp5 == 2) {
                    healpot2 = 20 + (200 - ((hpmax2 / hp2) / 5));
                    hp2 = hp2 + healpot2;
                    pot2--;
                }
                if (hp2 > hpmax2) {
                    hp2 = hpmax2;
                }
                resp5 = 0;
                if (pot2 == 0) {
                    critroll = random.nextInt(99);
                    if (critroll < crate2) con4 = 1; con = 1;
                    hp1 = segundoAtaca(atk2, def1, hp1, cdmg2, con);
                    con2 = 1; con --;
                    if (ph2 == phdrag && con4 == 1) {
                        crate2 = crate2 - 5;
                        hp2 = hp2 + 20;
                        con4++;
                        System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                    }
                    if (hp2 > hpmax2) {
                        hp2 = hpmax2;
                    }
                }

            }
            //En caso de que el Jugador 2 sea más rapido que el Jugador 1
            if (spe2 > spe1) {
                if (pot2 > 0) {
                    System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                    resp6 = in.nextInt();
                    while (resp6 < 1 || resp6 > 2) {
                        System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                        resp6 = in.nextInt();
                    }
                }
                if (resp6 == 1) {
                    critroll = random.nextInt(99);
                    if (critroll < crate2) con4 = 1; con = 1;
                    hp1 = segundoAtaca(atk2, def1, hp1, cdmg2, con);
                    con2 = 1; con --;
                    if (ph2 == phdrag && con4 == 1) {
                        crate2 = crate2 - 5;
                        hp2 = hp2 + 20;
                        con4++;
                        System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                    }
                    if (hp2 > hpmax2) {
                        hp2 = hpmax2;
                    }
                }
                if (resp6 == 2) {
                    hp2 = hp2 + healpot2;
                    pot2--;
                }
                if (hp2 > hpmax2) {
                    hp2 = hpmax2;
                }
                resp6 = 0;
                if (pot2 == 0) {
                    critroll = random.nextInt(99);
                    if (critroll < crate2) con4 = 1; con = 1;
                    hp1 = segundoAtaca(atk2, def1, hp1, cdmg2, con);
                    con2 = 1; con --;
                    if (ph2 == phdrag && con4 == 1) {
                        crate2 = crate2 - 5;
                        hp2 = hp2 + 20;
                        con4++;
                        System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                    }
                    if (hp2 > hpmax2) {
                        hp2 = hpmax2;
                    }
                }
                if (hp1 > 0) {
                    if (pot1 > 0) {
                        System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                        resp7 = in.nextInt();
                        while (resp7 < 1 || resp7 > 2) {
                            System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                            resp7 = in.nextInt();
                        }
                    }
                    if (resp7 == 1) {
                        critroll = random.nextInt(99);
                        if (critroll < crate1) con3 = 1; con = 1;
                        hp2 = primeroAtaca(atk1, def2, hp2, cdmg1, con);
                        con1 = 1; con --;
                        if (ph1 == phdrag && con3 == 1) {
                            crate1 = crate1 - 5;
                            hp1 = hp1 + 20;
                            con3++;
                        }
                        if (hp1 > hpmax1) {
                            hp1 = hpmax1;
                        }
                    }
                    if (resp7 == 2) {
                        hp1 = hp1 + healpot1;
                        pot1--;
                    }
                    if (hp1 > hpmax1) {
                        hp1 = hpmax1;
                    }
                    resp7 = 0;
                    if (pot1 == 0) {
                        critroll = random.nextInt(99);
                        if (critroll < crate1) con3 = 1; con = 1;
                        hp2 = primeroAtaca(atk1, def2, hp2, cdmg1, con);
                        con1 = 1; con --;
                        if (ph1 == phdrag && con3 == 1) {
                            crate1 = crate1 - 5;
                            hp1 = hp1 + 20;
                            con3++;
                            System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                        }
                        if (hp1 > hpmax1) {
                            hp1 = hpmax1;
                        }
                    }


                }
            }
            //En caso de que ambos tengan la misma velocidad
            if (spe1 == spe2) {
                tiebr = random.nextInt(2);
                //En caso de que el desempate sea a favor del Jugador 1
                if (tiebr == 0) {
                    if (pot1 > 0) {
                        System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                        resp8 = in.nextInt();
                        while (resp8 < 1 || resp8 > 2) {
                            System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                            resp8 = in.nextInt();
                        }
                    }
                    if (resp8 == 1) {
                        critroll = random.nextInt(99);
                        if (critroll < crate1) con3 = 1; con = 1;
                        hp2 = primeroAtaca(atk1, def2, hp2, cdmg1, con);
                        con1 = 1; con --;
                        if (ph1 == phdrag && con3 == 1) {
                            crate1 = crate1 - 5;
                            hp1 = hp1 + 20;
                            con3++;
                            System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                        }
                        if (hp1 > hpmax1) {
                            hp1 = hpmax1;
                        }
                    }
                    if (resp8 == 2) {
                        hp1 = hp1 + healpot1;
                        pot1--;
                    }
                    if (hp1 > hpmax1) {
                        hp1 = hpmax1;
                    }
                    resp8 = 0;
                    if (pot1 == 0) {
                        critroll = random.nextInt(99);
                        if (critroll < crate1) con3 = 1; con = 1;
                        hp2 = primeroAtaca(atk1, def2, hp2, cdmg1, con);
                        con1 = 1; con --;
                        if (ph1 == phdrag && con3 == 1) {
                            crate1 = crate1 - 5;
                            hp1 = hp1 + 20;
                            con3++;
                            System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                        }
                        if (hp1 > hpmax1) {
                            hp1 = hpmax1;
                        }
                    }
                    if (hp2 > 0) {
                        if (pot2 > 0) {
                            System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                            resp9 = in.nextInt();
                            while (resp9 < 1 || resp9 > 2) {
                                System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                                resp9 = in.nextInt();
                            }
                        }
                        if (resp9 == 1) {
                            critroll = random.nextInt(99);
                            if (critroll < crate2) con4 = 1; con = 1;
                            hp1 = segundoAtaca(atk2, def1, hp1, cdmg2, con);
                            con2 = 1; con --;
                            if (ph2 == phdrag && con4 == 1) {
                                crate2 = crate2 - 5;
                                hp2 = hp2 + 20;
                                con4++;
                            }
                            if (hp2 > hpmax2) {
                                hp2 = hpmax2;
                            }
                        }
                        if (resp9 == 2) {
                            hp2 = hp2 + healpot2;
                            pot2--;
                        }
                        if (hp2 > hpmax2) {
                            hp2 = hpmax2;
                        }
                        resp9 = 0;
                        if (pot2 == 0) {
                            critroll = random.nextInt(99);
                            if (critroll < crate2) con4 = 1; con = 1;
                            hp1 = segundoAtaca(atk2, def1, hp1, cdmg2, con);
                            con2 = 1; con --;
                            if (ph2 == phdrag && con4 == 1) {
                                crate2 = crate2 - 5;
                                hp2 = hp2 + 20;
                                con4++;
                                System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                            }
                            if (hp2 > hpmax2) {
                                hp2 = hpmax2;
                            }
                        }
                    }


                }
                //En caso de que el desempate sea a favor del Jugador 2
                if (tiebr == 1) {
                    if (pot2 > 0) {
                        System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                        resp10 = in.nextInt();
                        while (resp10 < 1 || resp10 > 2) {
                            System.out.println("Jugador 2 pulsa 1 para atacar y 2 para usar una poción");
                            resp10 = in.nextInt();
                        }
                    }
                    if (resp10 == 1) {
                        critroll = random.nextInt(99);
                        if (critroll < crate2) con4 = 1; con = 1;
                        hp1 = segundoAtaca(atk2, def1, hp1, cdmg2, con);
                        con2 = 1; con --;
                        if (ph2 == phdrag && con4 == 1) {
                            crate2 = crate2 - 5;
                            hp2 = hp2 + 20;
                            con4++;
                            System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                        }
                        if (hp2 > hpmax2) {
                            hp2 = hpmax2;
                        }                    }
                    if (resp10 == 2) {
                        hp2 = hp2 + healpot2;
                        pot2--;
                        System.out.println(hp2);
                    }
                    if (hp2 > hpmax2) {
                        hp2 = hpmax2;
                        System.out.println(hp2);
                    }
                    resp10 = 0;
                    if (pot2 == 0) {
                        critroll = random.nextInt(99);
                        if (critroll < crate2) con4 = 1; con = 1;
                        hp1 = segundoAtaca(atk2, def1, hp1, cdmg2, con);
                        con2 = 1; con --;
                        if (critroll >= crate2) {
                            roll = random.nextInt(3);
                            switch (roll) {
                                case 0:
                                    hp1 = hp1 - (((atk2 * 2) / def1) + 25);
                                    con2 = 1;
                                    break;
                                case 1:
                                    hp1 = hp1 - (((atk2 * 2) / def1) + 30);
                                    con2 = 1;
                                    break;
                                case 2:
                                    hp1 = hp1 - (((atk2 * 2) / def1) + 35);
                                    con2 = 1;
                                    break;
                            }
                        }
                        if (ph2 == phdrag && con4 == 1) {
                            crate2 = crate2 - 5;
                            hp2 = hp2 + 20;
                            con4++;
                            System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                        }
                        if (hp2 > hpmax2) {
                            hp2 = hpmax2;
                        }
                    }
                    if (hp1 > 0) {
                        if (pot1 > 0) {
                            System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                            resp11 = in.nextInt();
                            while (resp11 < 1 || resp11 > 2) {
                                System.out.println("Jugador 1 pulsa 1 para atacar y 2 para usar una poción");
                                resp11 = in.nextInt();
                            }
                        }
                        if (resp11 == 1) {
                            critroll = random.nextInt(99);
                            if (critroll < crate1) con3 = 1; con = 1;
                            hp2 = primeroAtaca(atk1, def2, hp2, cdmg1, con);
                            con1 = 1; con --;
                            if (ph1 == phdrag && con3 == 1) {
                                crate1 = crate1 - 5;
                                hp1 = hp1 + 20;
                                con3++;
                                System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                            }
                            if (hp1 > hpmax1) {
                                hp1 = hpmax1;
                            }
                        }
                        if (resp11 == 2) {
                            hp1 = hp1 + healpot1;
                            pot1--;
                        }
                        if (hp1 > hpmax1) {
                            hp1 = hpmax1;
                        }
                        resp11 = 0;
                        if (pot1 == 0) {
                            critroll = random.nextInt(99);
                            if (critroll < crate1) con3 = 1; con = 1;
                            hp2 = primeroAtaca(atk1, def2, hp2, cdmg1, con);
                            con1 = 1; con --;
                            if (ph1 == phdrag && con3 == 1) {
                                crate1 = crate1 - 5;
                                hp1 = hp1 + 20;
                                con3++;
                                System.out.println("La probabilidad de crítico del dragón se reduce en un 5%");
                            }
                            if (hp1 > hpmax1) {
                                hp1 = hpmax1;
                            }
                        }

                    }

                }
            }
            //Pasiva del mono
            if (ph1 == phmon) {
                spe1 = spe1 + 5;
                System.out.println("La velocidad del mono ahora es " + spe1);
            }
            if (ph2 == phmon) {
                spe2 = spe2 + 5;
                System.out.println("La velocidad del mono ahora es " + spe2);
            }
            //Pasiva del lobo
            if (ph1 == phlob && con2 == 1) {
                crate1 = crate1 + 3;
                cdmg1 = cdmg1 + 20;
                System.out.println("La probabilidad de crítico del lobo aumenta en un 3% y su daño crítico en un 20%");
                con2--;
            }
            if (ph2 == phlob && con1 == 1) {
                crate2 = crate2 + 3;
                cdmg2 = cdmg2 + 20;
                System.out.println("La probabilidad de crítico del lobo aumenta en un 3% y su daño crítico en un 20%");
                con1--;
            }
            //Pasiva del dragón
            if (ph1 == phdrag && con3 == 0) {
                crate1 = crate1 + 5;
                System.out.println("La probabilidad de crítico del dragón aumenta en un 5%");
            }
            con3 = 0;
            if (ph2 == phdrag && con4 == 0) {
                crate2 = crate2 + 5;
                System.out.println("La probabilidad de crítico del dragón aumenta en un 5%");
            }
            con4 = 0;
            //Para que si un Jugador tiene la pasiva del mono no pueda superar los 200 de velocidad
            if (spe1 > 200) {
                spe1 = 200;
            }
            if (spe2 > 200) {
                spe2 = 200;
            }
            //Regeneración de Vida
            hp1 = hp1 + hr1;
            hp2 = hp2 + hr2;
            if (hp1 > hpmax1) {
                hp1 = hpmax1;
            }
            if (hp2 > hpmax2) {
                hp2 = hpmax2;
            }
            //Datos de la partida
            System.out.println("______________________________________________________________________________________________________________");
            System.out.println("Turno: " + turn);
            if (hp1 > 0) {
                System.out.println("Jugador 1 " + hp1 + barra.repeat(hp1 / 2));
            }
            if (hp2 > 0) {
                System.out.println("Jugador 2 " + hp2 + barra.repeat(hp2 / 2));
            }
            System.out.println("______________________________________________________________________________________________________________");
            turn ++;
        }
        //En caso de que gane el Jugador 2
        if (hp1 <= 0) {
            System.out.println("Ha ganado el Jugador 2");
        }
        //En caso de que gane el Jugador 1
        if (hp2 <= 0) {
            System.out.println("Ha ganado el Jugador 1");
        }
    }
}
