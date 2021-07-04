package currency;

public class MianClass {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(28);
        System.out.println(dollar.getKursNBU());
        dollar.setKursNBU(29);
        System.out.println(dollar.getKursNBU());
        System.out.println(dollar.getMarga());
        dollar.setMarga(0.11);
        System.out.println(dollar.getMarga());
        dollar.exchangeGrnToCurrency(1000);
        dollar.setKursNBU(30);
        dollar.exchangeGrnToCurrency(1000);
        dollar.setKursNBU(40);
        dollar.exchangeGrnToCurrency(1000);
        dollar.setMarga(0.14);
        dollar.exchangeGrnToCurrency(1000);

        dollar.exchangeCurrencyToGrn(100);

        Euro euro = new Euro(35);
        euro.exchangeCurrencyToGrn(1000);
        euro.exchangeGrnToCurrency(100);
        euro.setMarga(0.19);
        euro.exchangeGrnToCurrency(100);

        Uzbuzm uzbuzm = new Uzbuzm(0.0001);
        uzbuzm.exchangeGrnToCurrency(100);
        uzbuzm.setKursNBU(0.0026);
        uzbuzm.exchangeGrnToCurrency(100);
        System.out.println(uzbuzm.isFreeConv());

        Bitcoin bitcoin = new Bitcoin(100000);
        if (bitcoin instanceof IsFreeConverted) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }}