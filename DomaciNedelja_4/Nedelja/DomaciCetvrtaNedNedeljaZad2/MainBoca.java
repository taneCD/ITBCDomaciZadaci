package DomaciCetvrtaNedNedeljaZad2;

public class MainBoca {

    public static void main(String[] args) {
        Boca bootle1=new Boca(3);
        Boca bootle2=new VinskaBoca("Chardoney Vasic",3);
        Boca bootle3=new RonilackaBoca(15,4);

        System.out.println(bootle1);
        System.out.println("\n");
        System.out.println(bootle2);
        System.out.println("\n");
        System.out.println(bootle3);
        System.out.println("\n");

        System.out.println(bootle1.equals(bootle3)); //Poredjenje zapremina boca

    }
}
