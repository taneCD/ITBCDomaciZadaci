package DomaciCetvrtaNedNedeljaZad2;

public class RonilackaBoca extends Boca{
    int masa;

    RonilackaBoca(){
    }
    RonilackaBoca(int masa, int zapremina){
        super(zapremina);
        this.masa=masa;
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+"Masa boce: "+masa;
    }
}
