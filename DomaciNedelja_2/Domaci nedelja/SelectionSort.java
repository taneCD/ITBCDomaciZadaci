import java.util.Arrays;

public class SelectionSort {
    public static void swap (int[]niz, int x, int y){
                int temp=niz[x];
                niz[x]=niz[y];
                niz[y]=temp;
    }
    public static void selectionSort(int[]niz){
        for(int i=0; i<niz.length-1;i++){
            int min=i;
            for(int j=i+1;j< niz.length;j++){
                if(niz[j]<niz[min]){
                    min=j;
                }
            }
            swap(niz, min, i);
        }
    }
    public static void main(String[] args) {
        int []niz={3, 23, 4,-6, 44, 645, -344, -4};
        selectionSort(niz);
        System.out.println(Arrays.toString(niz));

    }
}
