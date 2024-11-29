import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Introduce de a a-i para hacer los ejercicios del 1-9");
        String answer = in.nextLine();
        switch (answer) {
            case "a":


                System.out.println("Dame un número");
                int num = in.nextInt();
                System.out.println(Ejercicio1.numberSign(num));
                break;


            case "b":


                System.out.println("Introduce tu edad");
                int edad = in.nextInt();
                boolean result = Ejercicio2.isAdult(edad);
                if (result) {
                    System.out.println("Eres mayor de edad");
                } else {
                    System.out.println("Eres menor de edad");
                }
                break;


            case "c":


                System.out.println("Dame el radio");
                double rad = in.nextDouble();
                boolean result1 = Ejercicio3.validRadius(rad);
                while (!result1) {
                    System.out.println("El radio tiene que ser positivo");
                    rad = in.nextDouble();
                    result1 = Ejercicio3.validRadius(rad);
                }
                double area = Ejercicio3.calculateCircleArea(rad);
                double perimeter = Ejercicio3.calculateCirclePerimeter(rad);
                System.out.println("El area del circulo es " + area);
                System.out.println("El perimetro del circulo es " + perimeter);
                break;


            case "d":


                Ejercicio4.showMenu();
                int result2 = in.nextInt();
                while (result2 < 1 || result2 > 2) {
                    System.out.println("Introduce 1 o 2");
                    Ejercicio4.showMenu();
                    result2 = in.nextInt();
                }
                if (result2 == 1) {
                    System.out.println("Dame una cantidad en euros");
                    double euro = in.nextDouble();
                    double dollar = Ejercicio4.euro2dollar(euro);
                    System.out.println("La misma cantidad en dolares es " + dollar);
                } else {
                    System.out.println("Dame una cantidad en dolares");
                    double dollar = in.nextDouble();
                    double euro = Ejercicio4.dollar2euro(dollar);
                    System.out.println("La misma cantidad en euros es " + euro);
                }
                break;


            case "e":


                System.out.println("Dame un número del 1 al 10");
                int mult = in.nextInt();
                while (mult < 1 || mult > 10) {
                    System.out.println("El número tiene que ser del 1 al 10");
                    mult = in.nextInt();
                }
                Ejercicio5.isTabla(mult);
                break;


            case "f":


                Ejercicio6.isTabla10();
                break;


            case "g":


                int num1 = 1;
                while (num1 != 0) {
                    System.out.println("Pulsa 0 para salir");
                    System.out.println("Introduce un número");
                    num1 = in.nextInt();
                    Ejercicio7.isPrimo(num1);
                }
                break;


            case "h":


                System.out.println("Dame el dia del més");
                int dia = in.nextInt();
                int anho = 1;
                while (dia <= 0 || dia > 31) {
                    System.out.println("Introduce un dia del 1 al 31");
                    dia = in.nextInt();
                }
                System.out.println("Dame el mes");
                int mes = in.nextInt();
                while (mes <= 0 || mes > 12) {
                    System.out.println("Introduce un mes del 1 al 12");
                    mes = in.nextInt();
                }
                if (mes == 2) {
                    System.out.println("Introduce un año");
                    anho = in.nextInt();
                    while (anho < 0) {
                        System.out.println("Introduce un año mayor a 0");
                        anho = in.nextInt();
                    }
                }
                boolean result3 = Ejercicio8.dayCalc(dia, mes, anho);
                if (result3) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("La fecha es incorrecta");
                }
                break;




            case "i":


                System.out.println("Introduce un caracter");
                String carh = in.nextLine();
                System.out.println("Introduce el número de lineas del triangulo");
                int tri = in.nextInt();
                Ejercicio9.isTriangle(carh, tri);
                break;


            default:


                System.out.println("Introduce un cáracter correcto");
        }
    }
}


