package Tema2;

public class Ejercicio27 {
    public static void main(String[] args) {

        int num = 2;
        int cont = 1;
        int primo = 0;
        int contprim = 0;
        while (primo < 20) {
            //for
            while (cont <= num) {
                if (num % cont == 0) {
                    contprim ++;
                }
                cont ++;
            }
            if (contprim == 2) {
                primo ++;
                System.out.println("el primo número " + primo + " es " + num);
            }
            contprim = 0;
            cont = 1;
            num ++;
        }
    }
}
