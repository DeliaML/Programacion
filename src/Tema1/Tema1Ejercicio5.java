package Tema1;

public class Tema1Ejercicio5 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("24 & 5 = " + (24 % 5));
        System.out.println("7 / 2 + 2.5 = " + (7 / 2 + 2.5));
        System.out.println("10.8 / 2 + 2 = " + (10.8 / 2 + 2));
        System.out.println("(4 + 6) * 3 + 2 * (5 - 1) = " + ((4+6) * 3 + 2 * (5-1)));
        System.out.println("5 / 2 + 17 % 3= " + (5 / 2 + 17 % 3));
        System.out.println("7 >= 5 OR 27 <> = " + (7 >= 5 || 27 != 8));
        System.out.println("(45 <= 7 ) OR NOT (5 >=7 ) = " + (45 <= 7 ||! (5 >= 7)));
        System.out.println("27 & 4 + 15 / 4 = " + (27 % 4 + 15 / 4));
        System.out.println("37 / 4 * 4 -2 = " + (37 / 4 * 4 - 2));
        System.out.println("(25 >= 7) AND NOT (7 <=2) = " + (25 >= 7 &&! (7<= 2)));
        System.out.println("('H' < 'J') AND ('9' <> '7' = " + ('H' < 'J' && 9 != 7));
        System.out.println("25 > 20 AND 13 > 5 = " + (25 > 20 && 13 > 5));
        System.out.println("10 + 4 < 15 - 3 OR 2 * 5 + 1 > 14 - 2 * 2 = " + (10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2));
        System.out.println("4 * 2 <= 8 OR 2 * 2 < 5 AND 4 > 3 + 1 = " + ((4 * 2 <= 8 || 2 * 2 < 5) && 4 > 3 + 1));
        System.out.println("10 <= 2 * 5 AND 3 < 4 OR NOT (8>7) AND 3 * 2 <= 4 * 2 - 1 = " + ((10 <= 2 * 5 && 3 < 4) ||! (8>7) && 3 * 2 <= 4 * 2 - 1));

    }
}
