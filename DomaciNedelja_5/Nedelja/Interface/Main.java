package PetaNedeljaUtorak.Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("** Izlaz                 -- 0");
        System.out.println("** WeightedProduct       -- 1 (" + (new WeightedProduct()).getPrice() +" DIN) **");
        System.out.println("** SingleProduct         -- 2 (" + (new SingleProduct()).getPrice() +" DIN) **");
        System.out.println("** SubscriptionService   -- 3 (" +(new SubscriptionService()).getPrice() +" DIN) **");
        System.out.println("** SinglePurchaseService -- 4 (" +(new SinglePurchaseService()).getPrice() +" DIN) **");

        int unos=1;
        ArrayList<Priceable>arr=new ArrayList<>();

        int brojac1=0;
        int brojac2=0;
        int brojac3=0;
        int brojac4=0;

        while(true){
            System.out.print("Unesi broj: ");
            unos= sc.nextInt();
            if(unos==0) {
                System.out.println("Kraj programa, suma total: ");
                break;
            } else {
                if (unos == 1) {
                    arr.add(new WeightedProduct());
                    brojac1++;
                    System.out.println("WeightedProduct dodat u korpu, trenutno "+brojac1 +" kom.");
                } else if (unos == 2) {
                    arr.add(new SingleProduct());
                    brojac2++;
                    System.out.println("SingleProduct dodat u korpu, trenutno "+brojac2 +" kom.");
                } else if (unos == 3) {
                    arr.add(new SubscriptionService());
                    brojac3++;
                    System.out.println("SubscriptionService dodat u korpu, trenutno "+brojac3 +" kom.");
                } else if (unos == 4) {
                    arr.add(new SinglePurchaseService());
                    brojac4++;
                    System.out.println("SinglePurchaseService dodat u korpu, trenutno "+brojac4 +" kom.");
                }
            }
        }
        double suma = 0;
        for (var el : arr) {
            suma=suma+el.getPrice();
        }
        System.out.println(suma);
    }
}
