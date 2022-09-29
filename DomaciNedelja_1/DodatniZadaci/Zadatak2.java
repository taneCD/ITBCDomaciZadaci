package DomaciNedelja1.DodatniZadaci;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //2. Написати програм који исписује збир свих унетих бројева док се не унесе 0
        //Напомена: Није неопходан детаљан испис као испод, али је пожељан
        Scanner sc = new Scanner(System.in);

        int n = 1;
        int suma = 0;
        while (n != 0) {
            if (suma == 0) {
                System.out.print("Unesi broj: ");
            } else {
                System.out.print("Zbir je: " + suma + ", unesite sledeci broj ili 0 za exit: ");
            }
            n = sc.nextInt();
            sc.nextLine();
            suma = suma + n;
        }
        System.out.println("");
        System.out.println("Ukupan zbir je: " + suma);
    }
}
