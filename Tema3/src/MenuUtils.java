import java.util.Scanner;

public class MenuUtils {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce de 1 a 7 para escoger entre los siguientes modulos");
        System.out.println("miles2kilometers");
        System.out.println("getTaxes");
        System.out.println("getNetPrice");
        System.out.println("getCoins");
        System.out.println("getNIF");
        System.out.println("validNIF");
        System.out.println("calculateIRPF");
        int res = in.nextInt();
        while (res < 1 || res > 7) {
            System.out.println("Introduce un número del 1 al 7");
            res = in.nextInt();
        }
        switch (res) {

            case 1:

                System.out.println("Introduce las millas");
                double millas = in.nextDouble();
                double kilometros = Utils.miles2kilometers(millas);
                System.out.println(millas + " millas en kilometros es " + kilometros);

                break;

            case 2:

                System.out.println("Introduce la cantidad de euros");
                double euros = in.nextDouble();
                System.out.println("Introduce el porcentaje de impuestos");
                double porcentaje = in.nextDouble();
                double impuestos = Utils.getTaxes(euros, porcentaje);
                System.out.println("El dinero a pagar es " + impuestos);

                break;

            case 3:

                System.out.println("Introduce la cantidad de euros");
                double euro = in.nextDouble();
                System.out.println("Introduce el porcentaje");
                double percentage = in.nextDouble();
                double netprice = Utils.getNetPrice(euro, percentage);
                System.out.println("El valor es " + netprice);

                break;

            case 4:

                System.out.println("Introduce la cantidad de euros");
                int money = in.nextInt();
                System.out.println("Introduce la cantidad de centimos");
                int centimo = in.nextInt();
                while (centimo >= 100) {
                    System.out.println("Introduce una cantidad de centimos valida");
                    centimo = in.nextInt();
                } int coins = Utils.getCoins(money, centimo);
                System.out.println("Tienes las siguientes monedas empezando por 1 centimo de izquierda a derecha");
                System.out.println(coins);

                break;

            case 5:

                System.out.println("Introduce los numeros de tu NIF");
                int nif = in.nextInt();
                char letra = Utils.getNIF(nif);
                System.out.println("La letra de tu NIF es " + letra);

                break;

            case 6:

                System.out.println("Introduce los numeros de tu NIF");
                int cod = in.nextInt();
                System.out.println("Introduce la letra");
                char letter = in.next().charAt(0);
                boolean dni = Utils.validNIF(cod, letter);
                if (dni) System.out.println("Tu NIF es valido");
                else System.out.println("Tu NIF no es valido");

                break;

            case 7:

                System.out.println("Introduce tu sueldo anual");
                double sueldo = in.nextDouble();
                double irpf = Utils.calculateIRPF(sueldo);
                System.out.println("El IRPF a pagar es " + irpf);

                break;

            default:
        }
    }

}
