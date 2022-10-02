package DomaciCetvrtaNedNedeljaZad2;

public class Boca {
    int zapremina;
    Boca() {
    }
    Boca(int zapremina) {
        this.zapremina = zapremina;
    }
    @Override
    public String toString() {
        return "Zapremina Boce je: " + zapremina;
    }
    public boolean equals(Boca bocaZaPoredjenje) {
        if (this.zapremina == bocaZaPoredjenje.zapremina) {
            return true;
        }else{
            return false;
        }
    }
}
