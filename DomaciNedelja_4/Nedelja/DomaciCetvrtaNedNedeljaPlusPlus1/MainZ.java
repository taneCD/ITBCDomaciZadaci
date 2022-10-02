package DomaciCetvrtaNedNedeljaPlusPlus1;

public class MainZ {
    public static void main(String[] args) {
        Zivotinja z1=new Zivotinja("pas", "Pandora", 10,true);
        Zivotinja z2=new Zivotinja("zmija", "Dorinda", 8,false);
        Zivotinja z3=new Zivotinja("Macka", "Ljubica", 3,false);
        System.out.println(z1);
        System.out.println("\n");
        System.out.println(z2);
        System.out.println("\n");
        System.out.println(z3);
        z2.vakcinisi();
        System.out.println(z2.daLiJeVakcinisana);

        Automobil a1=new Automobil("Mercedes","C220cdi",2010,4900,false,13600);
        Automobil a2=new Automobil("Renault","Megane",2015,7450,false, 17000);
        Automobil a3=new Automobil("Mitsubishi", "Lancer EVO", 2009,9700,false,29000);
        System.out.println(a1);
        System.out.println("\n");
        a1.prodaj();
        System.out.println(a1);
        System.out.println("\n");
        System.out.println(a3);
        a3.prodaj();
        System.out.println(a3);
        a3.vozi(1459);
        System.out.println(a3);

    }
}
