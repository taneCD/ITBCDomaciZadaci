public class DomaciZad2 {
    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] niz2 = {5, 20, 21, 22, 23, 24, 25, 26};

        boolean jednakiSu = daLiNizoviImajuPoklapanja(niz1, niz2); //proverava da li niz1 i niz2 imaju istih elemenata
        System.out.println(jednakiSu); //ispisuje true ili false
    }

    public static boolean daLiNizoviImajuPoklapanja(int[] nizA, int[] nizB) {
        for (int i = 0; i < nizA.length; i++) {
            for (int j = 0; j < nizB.length; j++) {
                if (nizA[i] == nizB[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}