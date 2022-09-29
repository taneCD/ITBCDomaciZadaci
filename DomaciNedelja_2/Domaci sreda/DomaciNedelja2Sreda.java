public class DomaciNedelja2Sreda {

    //1. Написати функцију која проверава да ли је година преступна
    public static boolean prestupnaGodina(int godina) {

        if (godina % 4 == 0 && (godina % 400 == 0 || godina % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    //2. Написати функцију која проверава да ли је троцифрен број Армстронгов или није
    public static boolean armstrongovBroj(int armBroj) {

        int cifra1 = armBroj / 100;
        int cifra2 = (armBroj % 100) / 10;
        int cifra3 = armBroj % 10;

        double aBroj = Math.pow(cifra1, 3);
        double bBroj = Math.pow(cifra2, 3);
        double cBroj = Math.pow(cifra3, 3);
        double zbirBroj = aBroj + bBroj + cBroj;

        if (armBroj == zbirBroj) {
            return true;
        } else {
            return false;
        }
    }

    //  4. Написати функцију која ИСПИСУЈЕ да ли је број мањи, једнак или већи од другог броја
    public static String brojProvera(int brojPrvi, int brojDrugi) {

        if (brojPrvi > brojDrugi) {
            return "Broj je veci od drugog broja.";
        }
        else if (brojPrvi == brojDrugi) {
            return "Broj je isti kao i drugi broj.";
        }
        else  {
            return "Broj je manji od drugog broja.";
        }
    }

    //5. Zadatak:
    //https://www.codewars.com/kata/5effa412233ac3002a9e471d/java

    public static int saberiBrojeve(int x, int y) {

        int xStotina = 0;
        if (x >= 100) xStotina = (int) x / 100;
        int xDesetica = 0;
        if (x >= 10) xDesetica = (x % 100) / 10;
        int xJedinica = x % 10;

        int yStotina = 0;
        if (y >= 100) yStotina = (int) y / 100;
        int yDesetica = 0;
        if (y >= 10) yDesetica = (y % 100) / 10;
        int yJedinica = y % 10;

        int stotinaRez = xStotina + yStotina;
        int deseticaRez = xDesetica + yDesetica;
        int jedinicaRez = xJedinica + yJedinica;

        return Integer.parseInt(Integer.toString(stotinaRez)+Integer.toString(deseticaRez)+Integer.toString(jedinicaRez));
    }

    public static void main(String[] args) {

        System.out.println(prestupnaGodina(1992));
        System.out.println(armstrongovBroj(370));
        System.out.println(brojProvera(999, 999));
        System.out.println(saberiBrojeve(363,172));
    }
}