import java.util.Arrays;

public class NedeljaZadatak2 {
    public static void main(String[] args) {

        int[][] matrix = {
                { 3, 2, 1, 7},
                { 9, 11, 5, 4},
                { 6, 0, 13, 17},
                { 7, 21, 14, 15 }
        };
        int[] prviRed = matrix[0];// { 3, 2, 1, 7 }
        int elemenataUJednomRedu = prviRed.length; // 4 elementa
        int[] niz = new int[elemenataUJednomRedu]; //novi niz sa 4 elementa
        int nizMax=0;

        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                niz[j]=niz[j]+matrix[i][j];
            }
        }
        int najveciBr = 0;
        int najvecaKolona = 0;
        for (int i=0;i<niz.length;i++) {
            if (niz[i]>najveciBr) {
                najveciBr = niz[i];
                najvecaKolona = i;
            }
        }

        for (int i = 0; i < matrix.length; i++){
            int tmp=matrix[i][0];
            matrix[i][0]=matrix[i][najvecaKolona];
            matrix[i][najvecaKolona] = tmp;
        }

        for (int i = 0; i<matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
