package PetaNedelja.Petak.Complex;

import PetaNedelja.Petak.Complex.Complex;

public class Main {
    public static void main(String[] args){
        Complex real1=new Complex(10,14);
        Complex real2=new Complex(5,9);

        var Complex1=real1.add(real2);
        System.out.println(Complex1);
        var Complex2=real1.subtract(real2);
        System.out.println(Complex2);
        var Complex3=real1.multiply(real2);
        System.out.println(Complex3);
        var Complex4=real1.divide(real2);
        System.out.println(Complex4);
    }
}
