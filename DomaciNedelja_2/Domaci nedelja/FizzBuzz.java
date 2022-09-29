import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {
    public static double digitron(double...brojevi){

        Scanner sc= new Scanner(System.in);
        System.out.println("Unesi 1 za sabiranje ili 2 za oduzimanje: ");
        int operator = sc.nextInt();
        double suma=0.0;

        if(operator==1){
            for(int i=0; i<brojevi.length; i++){
                suma=suma + brojevi[i];
            }
        }else if(operator==2) {
            for (int i=0;i<brojevi.length; i++) {
                suma = suma - brojevi[i];
            }
        }
            else{
            System.out.println("Pogresna fju.");
        }
            return suma;
    }
    public static void main(String[] args) {
        System.out.println(digitron(3,4,5,6, 7));
   }
}
