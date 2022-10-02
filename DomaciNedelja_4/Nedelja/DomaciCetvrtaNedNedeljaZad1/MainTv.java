package DomaciCetvrtaNedNedelja;

public class MainTv {
    public static void main(String[] args) {
        Televizor tv = new Televizor();

        tv.ukljuci();               //ukljucujemo TV
        tv.promeniProgramNavise();
        tv.promeniProgramNanize();
        tv.promeniProgramNanize();
        tv.promeniProgramNanize();
        tv.promeniProgramNanize();
        tv.pojacajTon();
        tv.pojacajTon();
        tv.pojacajTon();
        tv.pojacajTon();
        tv.pojacajTon();
        tv.pojacajTon();
        tv.promeniProgramNanize();
        tv.smanjiTon();
        tv.iskljuci();           //dok je TV iskljucen ne mozemo da menjamo kanale i da pojacavamo/smanjujemo ton
        tv.pojacajTon();
        tv.pojacajTon();
        tv.promeniProgramNavise();

        System.out.println(tv.ispisiParametre());
    }
}
