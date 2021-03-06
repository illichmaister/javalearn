package currency;

public class CurrencyExchange {
    public static void main(String[] args) {
        Currency workingCurrency;
        Dollar dollar = new Dollar(28);
        Euro euro = new Euro(32);

        ListOfCurrency.addCurrency(dollar);
        ListOfCurrency.addCurrency(euro);
        ListOfCurrency.addCurrency(new Bitcoin(10000));

        int currencyNumber = 100;
        do {
            CurrencyMenu.printCurrencyMenu();
            currencyNumber = CurrencyMenu.getNumberOfCurrencyFromConsole();
            if (currencyNumber == 0) {
                System.out.println("Wrong currency. Try again!");
                continue;
            } else if (currencyNumber != 100) {
                workingCurrency = CurrencyMenu.setCurrency(currencyNumber);
                System.out.println("Currency " + workingCurrency.getCurrencyName() + " is " + workingCurrency.getKursNBU());

                boolean exitActionsMenu;
                do {
                    MenuActions.printActionsMenu(workingCurrency);
                    int menuNumber = MenuActions.getNumberOfCurrencyFromConsole();
                    exitActionsMenu = (menuNumber!=100);
                    if (exitActionsMenu){
//                        System.out.println("Some Actions");
                        MenuActions.doActionsWithCurrency(workingCurrency, menuNumber);
                    }



                } while (exitActionsMenu);
            }

        } while (currencyNumber != 100);
    }
}
