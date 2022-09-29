import java.util.Arrays;

public class Zadatak4 {
        //Ova funkcija menja vrednosti tzv swap od arr[i] i arr[j].
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
        //Ova funkcija je void pa ne vraca nista, ali sortira niz.
    public static void selectionSort(int[] arr) {
        // Petlja broji od nultog pa sve do duzine niza-1 indexa.
        // Ovde prolazimo kroz svaki broj niza i pomeramo u svakom krugu na sledeci broj
        for (int i = 0; i < arr.length - 1; i++) {
        // Додати коментар
        //Nalazimo minimalni broj u nesortiranom nizu
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
            // Додати коментар
            //Nalazimo sledeci najmanji broj u nizu
                if (arr[j] < arr[min]) {
                    min = j; // Додати коментар // Postavljamo sledeci najmanji kao najmanji
                }
            }
            // Додати коментар шта ова функција ради и шта представљају ови параметри
            //Funkcija menja mesta brojevima u nizu, najmanji postaljva na prvo mesto, pa posle drugi najmanji itd.

            swap(arr, min, i);
        }
    }
    public static void main(String[] args) {

        int[] arr = {3, 5, 8, 4, 1, 9, -2};
        selectionSort(arr);
        // Додати коментар шта се исписује
        //Ispisuje se niz poredjan po redu od najmanjeg do najveceg broja
        System.out.println(Arrays.toString(arr));
    }
}
