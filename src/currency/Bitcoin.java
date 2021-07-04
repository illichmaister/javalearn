package currency;

public class Bitcoin extends Currency {
    public Bitcoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "BTC";
    }

    @Override
    public double exchangeGrnToCurrency(int numberOfGrn) {
        System.out.println("это запрещено");
        return numberOfGrn;
    }

}
