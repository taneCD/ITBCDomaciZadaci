package DomaciCetvrtaNedNedeljaPlusPlus1;

public class Zivotinja {
    String vrstaZivotinje;
    String imeZivotinje;
    int godineZivotinje;
    boolean daLiJeVakcinisana;
    Zivotinja(){}
    Zivotinja(String vrstaZivotinje, String imeZivotinje, int godineZivotinje, boolean daLiJeVakcinisana){
        this.vrstaZivotinje=vrstaZivotinje;
        this.imeZivotinje=imeZivotinje;
        this.godineZivotinje=godineZivotinje;
        this.daLiJeVakcinisana=daLiJeVakcinisana;
    }
    public void vakcinisi() {
        if (!daLiJeVakcinisana) {
            daLiJeVakcinisana = true;
        }
    }
    @Override
    public String toString() {
        return "Zivotinja " + "\n"+
                "vrstaZivotinje='" + vrstaZivotinje + '\'' + "\n"+
                "imeZivotinje='" + imeZivotinje + '\'' +"\n"+
                "godineZivotinje=" + godineZivotinje +"\n"+
                "daLiJeVakcinisana=" + daLiJeVakcinisana;
    }
}
