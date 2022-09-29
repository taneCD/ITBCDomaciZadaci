package DomaciNedelja1.Sreda;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //3. Корисник уноси троцифрен број: (претпоставити добар унос)
        //1. Извући цифре броја и исписати их кориснику
        //2. Проверити и исписати да ли је број Армстронгов
        //Број је Армстронгов ако је једнак збиру кубова њ
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite trocifren broj: ");

        int broj = sc.nextInt();

        int cifra1 = broj / 100;
        int cifra2 = (broj % 100) / 10;
        int cifra3 = broj % 10;

        System.out.println("Cifra stotine je: " + cifra1);
        System.out.println("Cifra desetice je: " + cifra2);
        System.out.println("Cifra jedinice je: " + cifra3);

        double aBroj = Math.pow(cifra1, 3);
        double bBroj = Math.pow(cifra2, 3);
        double cBroj = Math.pow(cifra3, 3);
        double zbirBroj = aBroj + bBroj + cBroj;

        if (broj == zbirBroj) {
            System.out.println("Broj jeste Armstrongov.");
        } else {
            System.out.println("Ovo nije Armstrongov broj");
        }
    }
}
