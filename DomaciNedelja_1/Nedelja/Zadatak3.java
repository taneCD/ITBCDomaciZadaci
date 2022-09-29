package DomaciNedelja1.Nedelja;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //3*. Програм креира скривени број од 0 до 100, користик има на располагању
        //максимално 10 корака да пронађе скривени број, програм, након сваког унетог
        //покушаја исписује да ли је скривени број “мањи” или “већи” од унетог броја,
        //ако је број исти исписује “Браво! Пронашли сте број!” и програм се завршава.
        //● Програм креира насумичан (random) број од 0 до 100,помоћ - (int)
        //(Math.random() * 100); користимо класу Math са методом random() која
        //нам даје број између 0 и 1 (нпр. 0,20 ; 0,72 …) множимо са 100 да би
        //направили број од 0 до 100;
        //● Ако је број који је корисник унео једнак броју креираном од стране
        //рачунара исписати “Браво! Пронашли сте број!” и програм се прекида;
        //● Након 10 покушаја програм се зауставља.
        Scanner sc = new Scanner(System.in);
        int skriveniBroj = (int) (Math.random() * 100);

        int minBroj=0;
        int maxBroj=100;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Unesite broj: ");
            int broj = sc.nextInt();

            if(skriveniBroj<broj)
                maxBroj = broj;

            else if
            (skriveniBroj > broj)
                minBroj = broj;

            if (broj == skriveniBroj) {
                System.out.println("Pogodak!");
                break;
            } else {
                if (broj < skriveniBroj) {
                    System.out.println("Nas zamisljeni broj je veci. Sada znamo da je nas broj izmedju " + broj+"-"+maxBroj);
                } else {
                    System.out.println("Nas zamisljeni broj je manji. Sada znamo da je nas broj izmedju "+ minBroj+"-"+broj);
                }
            }
        }
    }
}
