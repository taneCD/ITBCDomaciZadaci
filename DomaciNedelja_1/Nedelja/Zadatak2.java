package DomaciNedelja1.Nedelja;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //2. Корисник може унети n бројева са тастатуре, програм се зауставља када
        //користин напише команду “stop”:
        //● Програм проверава сваки унос корисника (сваки број који корисник
        //унесе);
        //● Ако је број који је корисник унео дељив са 2, програм исписује “Broj je
        //deljiv sa 2”;
        //● Ако број није дељив са 2, програм исписује “Broj nije deljiv sa 2”.

        Scanner sc = new Scanner(System.in);
        int broj = 1;
        String unos = "";
        int unosB;

        while (true) {
            System.out.println("Unesi broj: ");
            unos = sc.next();

            if (unos.equals("stop")) {
                break;
            } else {
                unosB = Integer.parseInt(unos);
                if (unosB % 2 == 0) {
                    System.out.println("Br je deljiv sa 2.");
                } else {
                    System.out.println("Broj nije deljiv sa 2.");
                }
            }
        }
    }
}
