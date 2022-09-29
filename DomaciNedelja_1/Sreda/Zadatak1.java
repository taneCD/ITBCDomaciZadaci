package DomaciNedelja1.Sreda;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//1. Корисник уноси два реална броја
//1. Исписати да ли је производ ова два броја позитиван
//2. Исписати да ли је збир ова два броја већи од 150
//3. Исписати који је већи од ова два броја

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dva realna broja: ");

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println(x * y > 0);

        System.out.println(x + y > 150);

        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }
}
