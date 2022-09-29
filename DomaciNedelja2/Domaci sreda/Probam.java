public class Probam {
    public static void main(String[] args) {

        int x = 136;
        int y = 18;


        int xDesetica = 0;
        if (x >= 10) xDesetica = (x % 100) / 10;
        int xJedinica = x % 10;

        int yDesetica = 0;
        if (y >= 10) yDesetica = (y % 100) / 10;
        int yJedinica = y % 10;

        int deseticaRez = xDesetica + yDesetica;
        int jedinicaRez = xJedinica + yJedinica;

        return(Integer.parseInt(Integer.toString(deseticaRez)+Integer.toString(jedinicaRez)));
    }
}
