import java.util.Arrays;

public class DomaciNedelja1 {
public static int[] niz(int [][]matrix){
    int[] suma = new int[matrix.length];
    int najveciBr = 0;
    int najveciIndex = 0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            suma[i] = suma[i] + matrix[i][j];
        }
    }
    for (int i = 0; i < suma.length; i++) {
        if (najveciBr < suma[i]) {
            najveciBr = suma[i];
            najveciIndex = i;
        }
    }
    return matrix[najveciIndex];
}
    public static void main(String[] args) {
        int[][] matrix = {{3, 2, 1, 7},
                          {9, 11, 5, 4},
                          {6, 0, 13, 17},
                          {7, 21, 14, 15}};
      
        System.out.println(Arrays.toString(niz(matrix)));
    }
}

