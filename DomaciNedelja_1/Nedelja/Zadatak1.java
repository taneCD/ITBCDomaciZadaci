package DomaciNedelja1.Nedelja;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //1. Написати програм који броји кораке корисника:
        //● Корисник се шета помоћу тастера (w-горе, a- лево, s-доле, d-десно);
        //● Програм памти колико је корисник пута ишао горе, лево, доле и десно;
        //● Програм се зауставља ако корисник унесе било који карактер сем
        //(w,s,a,d);
        //● На крају програм исписује број корисникових корака ка свим странама.

        Scanner sc = new Scanner(System.in);

        int brojacW = 0;
        int brojacS = 0;
        int brojacA = 0;
        int brojacD = 0;
        char unoss = ' ';

        boolean uslov = true;

        System.out.println("Prosetajte se sa tasterima W, S, A, D: ");
        while (uslov) {

            unoss = sc.next().charAt(0);  //toLowerCase(Locale.ROOT)
            unoss = Character.toLowerCase(unoss);

            if (unoss == 'w') {
                brojacW = brojacW + 1;
            }
            if (unoss == 's') {
                brojacS = brojacS + 1;
            }
            if (unoss == 'a') {
                brojacA = brojacA + 1;
            }
            if (unoss == 'd') {
                brojacD = brojacD + 1;
            }
            if (unoss != 'w' && unoss != 'a' && unoss != 's' && unoss != 'd') {
                uslov = false;
            }
        }
        String korak = "koraka";
        if (brojacW == 1)
            korak = "korak";

        System.out.println("Izlaz: ");
        System.out.println("Korisnik je prosao " + brojacW + " " + korak + " na gore, " + brojacS + " na dole, " + brojacA + " levo i " + brojacD + " desno.");
    }
}
