import java.util.Scanner;

public class MenuMyMath {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("El nombre de las funciones son:");
        System.out.println("squarePerimeter");
        System.out.println("squareArea");
        System.out.println("rectanglePerimeter");
        System.out.println("rectangleArea");
        System.out.println("circlePerimeter");
        System.out.println("circleArea");
        System.out.println("siPrimo");
        System.out.println("noPrimo");
        System.out.println("numCifra");
        System.out.println("cifraPar");
        System.out.println("cifraImpar");
        System.out.println("numFact");
        System.out.println("recFact");
        System.out.println("ecuacionDet");
        System.out.println("sumaCifra");
        System.out.println("Escribe el nombre de la función que quieres usar");
        String resp = in.nextLine();
        switch (resp) {

            case "squarePerimeter":

                System.out.println("Introduce el lado");
                double ladp = in.nextDouble();
                double squareP = MyMath.squarePerimeter(ladp);
                System.out.println("El perimetro del cuadrado es " + squareP);
                break;

            case "squareArea":

                System.out.println("Introduce el lado");
                double lada = in.nextDouble();
                double squareA = MyMath.squareArea(lada);
                System.out.println("El area del cuadrado es " + squareA);
                break;

            case "rectanglePerimeter":

                System.out.println("Introduce la base");
                double basp = in.nextDouble();
                System.out.println("Introduce la altura");
                double altp = in.nextDouble();
                double recrangleP = MyMath.rectanglePerimeter(basp, altp);
                System.out.println("El perimetro del rectangulo es " + recrangleP);
                break;

            case "rectangleArea":

                System.out.println("Introduce la base");
                double basa = in.nextDouble();
                System.out.println("Introduce la altura");
                double alta = in.nextDouble();
                double recrangleA = MyMath.rectangleArea(basa, alta);
                System.out.println("El area del rectangulo es " + recrangleA);
                break;

            case "circlePerimeter":

                System.out.println("Introduce el radio");
                double radp = in.nextDouble();
                double circleP = MyMath.circlePerimeter(radp);
                System.out.println("El perimetro del circulo es " + circleP);
                break;

            case "circleArea":

                System.out.println("Introduce el radio");
                double rada = in.nextDouble();
                double circleA = MyMath.circleArea(rada);
                System.out.println("El area del circulo es " + circleA);
                break;

            case "siPrimo":

                System.out.println("Introduce un número");
                int nsi = in.nextInt();
                boolean siP = MyMath.siPrimo(nsi);
                if (siP) {
                    System.out.println("El número si es primo");
                } else {
                    System.out.println("El número no es primo");
                }
                break;

            case "noPrimo":

                System.out.println("Introduce un número");
                int nno = in.nextInt();
                boolean noP = MyMath.noPrimo(nno);
                if (!noP) {
                    System.out.println("El número si es primo");
                } else {
                    System.out.println("El número no es primo");
                }
                break;

            case "numCifra":

                System.out.println("Introduce un número");
                int nnc = in.nextInt();
                int numC = MyMath.numCifra(nnc);
                System.out.println("El número tiene " + numC + " cifras");
                break;

            case "cifraPar":

                System.out.println("Introduce un número");
                int ncp = in.nextInt();
                int cifraP = MyMath.cifraPar(ncp);
                System.out.println("El número tiene " + cifraP + " cifras pares");
                break;

            case "cifraImpar":

                System.out.println("Introduce un número");
                int nci = in.nextInt();
                int cifraI = MyMath.cifraImpar(nci);
                System.out.println("El número tiene " + cifraI + " cifras impares");
                break;

            case "numFact":

                System.out.println("Introduce un número");
                int nnf = in.nextInt();
                int numF = MyMath.numFact(nnf);
                System.out.println("El factorial del número es " + numF);
                break;

            case "recFact":

                System.out.println("Introduce un número");
                int nrf = in.nextInt();
                int recF = MyMath.recFact(nrf);
                System.out.println("El factorial del número es " + recF);

            case "ecuacionDet":

                System.out.println("Introduce la a de la ecacución");
                int deta = in.nextInt();
                System.out.println("Introduce la b de la ecuacuión");
                int detb = in.nextInt();
                System.out.println("Introduce la c de la ecuación");
                int detc = in.nextInt();
                int ecuacionD = MyMath.ecuacionDet(deta, detb, detc);
                System.out.println("La ecuacuión tiene " + ecuacionD + " posibles soluciones");

                break;

            case "sumaCifra":

                System.out.println("Introduce un número");
                int nsc1 = in.nextInt();
                System.out.println("Introduce otro número");
                int nsc2 = in.nextInt();
                int sumaC = MyMath.sumaCifra(nsc1, nsc2);
                System.out.println("La suma de las cifras de ambos números es " + sumaC);

                break;

            default:

                System.out.println("Asegurate que has escrito bien el nombre");
        }
    }
}
