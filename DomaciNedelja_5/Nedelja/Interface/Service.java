package PetaNedeljaUtorak.Interface;

public abstract class Service implements Priceable{
    public Service() {
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
