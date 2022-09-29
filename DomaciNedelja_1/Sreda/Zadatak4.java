package DomaciNedelja1.Sreda;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //4. Написати програм који исписује парне природне бројеве до унетог броја
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");

        int z = sc.nextInt();
        System.out.print("Ispis: ");
        for (int i = 1; i <= z; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                if(i<z-1)
                    System.out.print(",");
            }
        }
    }
}
