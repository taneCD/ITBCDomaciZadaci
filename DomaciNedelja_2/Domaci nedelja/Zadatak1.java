import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisi program koji okrece string naopacke i ispisuje.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi rec: ");
        String rec = sc.nextLine();
        String novaRec = " ";
        for (int i = rec.length() - 1; i >= 0; i--) {
            novaRec = novaRec + rec.charAt(i);
        }
        System.out.println(novaRec);
    }
}
