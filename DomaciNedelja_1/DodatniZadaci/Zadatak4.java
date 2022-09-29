package DomaciNedelja1.DodatniZadaci;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //4. Написати програм који исписује природне бројеве до унетог броја на сл. начин
        //Ако је број дељив са 3 - Исписујемо Fizz
        //Ако је број дељив са 5 - Исписујемо Buzz
        //Ако је број дељив са 3 и са 5 - Исписујемо FizzBuzz
        //Ако није испуњен ни један услов изнад - Исписујемо тај број
        Scanner sc = new Scanner(System.in);

        System.out.print("Upisi br: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else {
                System.out.println(i);
            }
        }
    }
}
