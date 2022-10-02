package DomaciCetvrtaNedNedeljaPlusPlus1;

public class Automobil {
    String marka;
    String model;
    int godinaProizvodnje;
    int vrednost;
    boolean isSold;
    int predjenihKilometara;
    Automobil(){
    }
    Automobil(String marka, String model, int godinaProizvodnje, int vrednost, boolean isSold, int getPredjenihKilometara){
        this.marka=marka;
        this.model=model;
        this.godinaProizvodnje=godinaProizvodnje;
        this.vrednost=vrednost;
        this.isSold=isSold;
        this.predjenihKilometara=getPredjenihKilometara;
    }
    public void prodaj(){
        if(isSold==false){
            isSold=true;
        }
    }
    public void vozi(int km){
        this.predjenihKilometara+=km;
    }
    @Override
    public String toString() {
        return "Automobil" +
                "marka=" + marka +"\n"+
                "model=" + model +"\n"+
                "godinaProizvodnje=" + godinaProizvodnje +"\n"+
                "vrednost=" + vrednost +"\n"+
                "isSold=" + isSold + "\n"+
                "predjeniKilometri=" + predjenihKilometara;
    }

}
