public class Zadatak3 {
    public static int ispisPoruke(int[]niz, int x, int b){
        int brojacNegativnih=0;
        for(int i=x;i<=b;i++) {
            if (niz[i] < 0) {
                brojacNegativnih++;
            }
        }
        return brojacNegativnih;
    }
    public static void main(String[] args) {
        int[] nizP = {-333, -222, -33, 1, -457, 768, -3, -6, -11, 0, -23, -44};
        int x=2;
        int b=5;
        System.out.println("Od indeksa " +x+ " do indeksa " +b+ " ima " +ispisPoruke(nizP,x,b )+" negativna broja.");
    }
}
