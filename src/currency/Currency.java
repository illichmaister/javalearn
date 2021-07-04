package currency;

import sun.util.resources.cldr.aa.CurrencyNames_aa_ER;

abstract class Currency {
    private double kursNBU;
    private double marga = 0.1;

    public Currency(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public double exchangeGrnToCurrency(int numberOfGrn) {
        double kursBuy = kursNBU * (1 + marga);
        double tempResult = numberOfGrn / kursBuy;
        System.out.println(String.format("For %s UAH you got %s %s by kurs %s", numberOfGrn, tempResult, getCurrencyName(), kursBuy));
        return tempResult;
    }

    public double exchangeCurrencyToGrn(int numberOfCurrency) {
        double kursSell = kursNBU * (1 - marga);
        double tempResult = numberOfCurrency * kursSell;
        System.out.println(String.format("For %s %s you got %s UAH by kurs %s", numberOfCurrency, getCurrencyName(), tempResult, kursSell));
        return tempResult;
    }

//    public double exchangeVoid(int numberOfCurrency){
//
//    }

    abstract String getCurrencyName();
}
