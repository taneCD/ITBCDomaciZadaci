package PetaNedelja.Petak.Complex;

public class Complex {
    double realniBr;
    double imaginarniBr;

    public Complex(double realniBr, double imaginarniBr) {
        this.realniBr = realniBr;
        this.imaginarniBr = imaginarniBr;
    }
    double getReal() {
        return realniBr;
    }
    double getImag() {
        return imaginarniBr;
    }
    Complex add(Complex t){
        double komplex=imaginarniBr+t.getImag();
        double realni=realniBr+t.getReal();
        return new Complex(realni, komplex);
    }
    Complex subtract(Complex t){
        double komplex=imaginarniBr-t.getImag();
        double realni=realniBr-t.getReal();
        return new Complex(realni, komplex);
    }
    Complex multiply(Complex t){
        double komplex=imaginarniBr*t.getImag();
        double realni=realniBr*t.getReal();
        return new Complex(realni, komplex);
    }
    Complex divide(Complex t){
        double komplex=imaginarniBr/t.getImag();
        double realni=realniBr/t.getReal();
        return new Complex(realni, komplex);
    }
    @Override
    public String toString() {
        if(imaginarniBr<0) {
            return (int) realniBr + "" + (int) imaginarniBr+ "i";
        }
        else{
            return (int) realniBr + "+" + (int) imaginarniBr + "i";
        }
    }
}
