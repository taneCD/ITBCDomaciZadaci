import java.util.Arrays;

public class KataSum {
    public static int[] sumaRet(int[] numbers) {
        int suma = 0;


        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > 0) {
                numbers += numbers[i];
            }

        }
        return numbers;
    }

    public static void main(String[] args) {
        int[]eee={1,-4,7,12};
        int[]eee2=sumaRet(eee);
        System.out.println(Arrays.toString(eee2));
//        System.out.println(Arrays.toString(sumaRet);

    }
}
