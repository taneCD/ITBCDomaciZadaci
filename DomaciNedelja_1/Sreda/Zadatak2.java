package DomaciNedelja1.Sreda;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //2. Написати програм који за унету годину проверава да ли је преступна
        //Година је преступна ако испуњава следеће:
        //Година је дељива са 4
        //Година је дељива са 400 или година није дељива са 100

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite godinu: ");

        int godina = sc.nextInt();

        if (godina % 4 == 0 && (godina % 400 == 0 || godina % 100 != 0)) {
            System.out.println("Godina je prestupna.");
        } else {
            System.out.println("Godina nije prestupna.");
        }
    }
}
