package DomaciCetvrtaNedNedeljaZad2;

public class VinskaBoca extends Boca{
    String nazivVina;
    VinskaBoca(){
    }
    VinskaBoca(String nazivVina, int zapremina){
        super(zapremina);
        this.nazivVina=nazivVina;
    }
    @Override
    public String toString() {
        return super.toString()+ "\n"+"Naziv vina: "+nazivVina;
    }
}
