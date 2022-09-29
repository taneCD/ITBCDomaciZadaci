package DomaciNedelja1.DodatniZadaci;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //1. Написати збир целих бројева од N до M (Укључујући оба)
        //N и M се уносе са тастатуре
        //Напомена: N може бити и мање од M, видети Пример2
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite N i M: ");

        int n = sc.nextInt();
        int m = sc.nextInt();
        int suma = 0;

        if (n < m) {
            for (int i = n; i <= m; i++)
                suma = suma + i;
            System.out.print("Ispis: " + suma + " (");

            for (int i = n; i <= m; i++) {
                System.out.print(i);
                if (i < m)
                    System.out.print(" + ");
                if (i == m)
                    System.out.println(")");
            }
        } else if (n > m) {
            for (int i = m; i <= n; i++)
                suma = suma + i;
            System.out.print("Ispis: " + suma + " (");

            for (int i = m; i <= n; i++) {
                System.out.print(i);
                if (i < n)
                    System.out.print(" + ");
                if (i == n)
                    System.out.println(")");
            }
        }
    }
}
