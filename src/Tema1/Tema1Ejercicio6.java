package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio6 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Introduce el radio");
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();{
            double A = 3.14 * R * R;
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println(A);
        }
    }
}
