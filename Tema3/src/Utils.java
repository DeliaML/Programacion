import java.util.Scanner;

public class Utils {

    public static double miles2kilometers (double miles) {

        return miles * 1.60934;
    }

    public static double getTaxes (double eur, double porc) {

        double tax = eur * (porc / 100);
        tax = Math.round(tax * 100) / 100.0;
        return tax;
    }

    public static double getNetPrice (double eur, double porc) {

        double net = eur + (eur * (porc / 100));
        net = Math.round(net * 100) / 100.0;
        return net;
    }

    public static int getCoins(double eur) {

        eur = Math.round(eur * 100) / 100.0;
        int coin2 = 0;
        int coin1 = 0;
        int cent50 = 0;
        int cent20 = 0;
        int cent10 = 0;
        int cent5 = 0;
        int cent2 = 0;
        int cent1 = 0;
        while (eur >= 2) {
            coin2 ++;
            eur = eur - 2;
        } if (eur >= 1) {
            coin1 ++;
            eur = eur -1;
        }
        if (eur >= 0.50) {
            cent50 ++;
            eur = eur - 0.50;
        } while (eur >= 0.20) {
            cent20 ++;
            eur = eur - 0.20;
        } if (eur > 0.10) {
            cent10 ++;
            eur = eur - 0.10;
        } if (eur >= 0.05) {
            cent5 ++;
            eur = eur - 00.5;
        } while (eur >= 0.02) {
            cent2 ++;
            eur = eur - 00.2;
        } if (eur == 0.01) {
            cent1 ++;
            eur = eur - 00.1;
        }
        int coin = coin2;
        coin = coin * 10 + coin1;
        coin = coin * 10 + cent50;
        coin = coin * 10 + cent20;
        coin = coin * 10 + cent10;
        coin = coin * 10 + cent5;
        coin = coin * 10 + cent2;
        coin = coin * 10 + cent1;
        return coin;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}
