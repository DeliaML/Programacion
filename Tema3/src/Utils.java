

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

    public static int getCoins(int eur, int cent) {

        eur = eur * 100 + cent;
        int coin2 = 0;
        int coin1 = 0;
        int cent50 = 0;
        int cent20 = 0;
        int cent10 = 0;
        int cent5 = 0;
        int cent2 = 0;
        int cent1 = 0;
        while (eur >= 200) {
            coin2 ++;
            eur = eur - 200;
        } if (eur >= 100) {
            coin1 ++;
            eur = eur -100;
        }
        if (eur >= 50) {
            cent50 ++;
            eur = eur - 50;
        } while (eur >= 20) {
            cent20 ++;
            eur = eur - 20;
        } if (eur > 10) {
            cent10 ++;
            eur = eur - 10;
        } if (eur >= 5) {
            cent5 ++;
            eur = eur - 5;
        } while (eur >= 2) {
            cent2 ++;
            eur = eur - 2;
        } if (eur == 1) {
            cent1 ++;
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

    public static char getNIF (int nif) {

        int res = nif % 23;
        return switch (res) {
            case 0 -> 'T';
            case 1 -> 'R';
            case 2 -> 'W';
            case 3 -> 'A';
            case 4 -> 'G';
            case 5 -> 'M';
            case 6 -> 'Y';
            case 7 -> 'F';
            case 8 -> 'P';
            case 9 -> 'D';
            case 10 -> 'X';
            case 11 -> 'B';
            case 12 -> 'N';
            case 13 -> 'J';
            case 14 -> 'Z';
            case 15 -> 'S';
            case 16 -> 'Q';
            case 17 -> 'V';
            case 18 -> 'H';
            case 19 -> 'L';
            case 20 -> 'C';
            case 21 -> 'K';
            case 22 -> 'E';
            default -> '.';
        };
    }

    public static boolean validNIF (int nif, char dni) {

        if (nif >= 100000000 || nif <= 9999999  ) return false;

        return switch (dni) {
            case 'A','B','C','D','E','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z' -> true;
            default -> false;
        };
    }

    public static double calculateIRPF (double eur) {

        if (eur <= 12450) {
            eur = eur - (eur * 19 / 100);
            return eur;
        } else if (eur <= 20199) {
            eur = eur - (eur * 24 / 100);
            return eur;
        } else if (eur <= 35199) {
            eur = eur - (eur * 30 / 100);
            return eur;
        } else if (eur <= 59999) {
            eur = eur - (eur * 37 / 100);
            return eur;
        } else if (eur <= 299999) {
            eur = eur - (eur * 45 / 100);
            return eur;
        } else {
            eur = eur - (eur * 47 / 100);
            return eur;
        }
    }

    public static void main(String[] args) {

    }
}
