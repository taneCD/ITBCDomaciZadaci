import java.util.ArrayList;
import java.util.Scanner;

public class DomaciZad1 {
    public static int wordCount(ArrayList<String>lista) {

        int brojac = 0;
        for (int i = 0; i < lista.size(); i++) {
            String trenutno = lista.get(i);
            if (trenutno.length() >= 2) {
                if (trenutno.charAt(0) == trenutno.charAt(trenutno.length() - 1)) {
                    brojac++;
                }
            }
        }
        return brojac;
    }
    //Napisite Java program za brojanje stringova u kojima je duzina
    //stringa 2 ili vi²e, a prvi i poslednji znak isti sa date liste stringova. //Stringove uneti sa tastature pomo¢u skenera i unabici u
    //ArrayList strukturu podataka
    // Potrebno je napraviti funkciju
    //ArrayList : ['abc', 'xyz', 'aba', '1221']
    //Expected Result : 2

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String unos = "";
        int brojac=0;
        ArrayList<String> lista = new ArrayList<String>();

        while (true) {
            System.out.println("Unesi rec: ");
            unos = sc.next();
            if (unos.equals("stop"))
                break;
            else {
                lista.add(unos);
            }
        }
        System.out.println(wordCount(lista));
    }
}
