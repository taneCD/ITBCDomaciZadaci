import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DomaciZad3 {
    public static void main(String[] args) {
        ArrayList<String> lista = unesiVrednosti();
        System.out.println(izvuciRandomTextIzListe(lista));
    }

    public static ArrayList<String> unesiVrednosti() {
        Scanner sc = new Scanner(System.in);
        String unos = "";
        ArrayList<String> uneteVrednosti = new ArrayList<String>();
        System.out.println("Unesi tekst za listu iz koje ce se nasumice izvuci jedan element (unesi 'stop'za prekid):");
        while (true) {
            unos = sc.next();
            if (unos.equals("stop")) {
                break;
            }
            else {
                uneteVrednosti.add(unos);
            }
        }
        return uneteVrednosti;
    }

    public static String izvuciRandomTextIzListe(ArrayList<String> lista) {
        Random rand = new Random();
        int randIndex = rand.nextInt(lista.size());
        String randText = lista.get(randIndex);
        return randText;
    }
}
