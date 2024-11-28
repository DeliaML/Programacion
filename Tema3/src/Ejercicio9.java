import java.util.Scanner;

public class Ejercicio9 {

    public static void isTriangle(String let, int line) {

        int cont = 1;
        int linecont = 0;
        while (cont < line) {
            System.out.printf((" ").repeat(line-cont));
            System.out.println(let.repeat(cont + linecont));
            linecont ++;
            cont ++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un caracter");
        String carh = in.nextLine();
        System.out.println("Introduce el número de lineas del triangulo");
        int tri = in.nextInt();
        isTriangle(carh, tri);
    }
}
