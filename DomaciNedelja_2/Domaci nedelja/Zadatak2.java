public class Zadatak2 {
    public static void main(String[] args) {
        //Napisati program koji nalazi drugi najveci broj u nizu
        int[] brojeviNiz = {333, 222, 33, 45, 1, 457, 768, 3, 6, 11, 17, 23, 44};
        int brojMax = brojeviNiz[0];
        for (int i = 0; i < brojeviNiz.length; i++) {
            if (brojMax < brojeviNiz[i]) {
                brojMax = brojeviNiz[i];
            }
        }
        int drugiNajveci = 0;
        for (int i = 0; i < brojeviNiz.length; i++) {
            if (drugiNajveci < brojeviNiz[i] && brojeviNiz[i] < brojMax) {
                drugiNajveci = brojeviNiz[i];
            }
        }
        System.out.println("Drugi najveci broj je: " + drugiNajveci+"!");
    }
}
