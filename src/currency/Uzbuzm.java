package currency;

public class Uzbuzm extends Currency implements IsFreeConverted{
    public Uzbuzm(double kursNBUEx) {
        super(kursNBUEx);
    }

    @Override
    String getCurrencyName() {
        return "UZS";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }
}
