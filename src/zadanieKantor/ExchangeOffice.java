package zadanieKantor;

import java.util.HashMap;
import java.util.Map;

public class ExchangeOffice {

    private Map<Currency, Double> availableFunds;

    public ExchangeOffice (double startFunds){
        this.availableFunds = new HashMap<>();
        for (Currency c: Currency.values()){
            availableFunds.put(c, startFunds);
        }

    }

    public void showFunds(){//ile mamy pieniedzy i ile możemy wrzucić
        System.out.print("Currency funds: ");//obecne pieniądze
        for (Map.Entry<Currency, Double> entry: availableFunds.entrySet()){
            Currency key = entry.getKey();
            Double value = entry.getValue();
            System.out.print(value + " " + key.getName());
        }
    }

    public  void exchange(double amount, Currency from, Currency to){
        double available = availableFunds.get(to);
        double needed = amount * 0.8 * CurrencyConverter.convert(from, to);

        if (available >= needed){
            availableFunds.put(from, availableFunds.get(from) + amount);
            availableFunds.put(to, availableFunds.get(to) - needed);//pobieranie waluty
            System.out.println("Exchanging "
                    + amount //kwota, ilość
                    + " "
                    + from.getName()//jaka waluta
                    + " to "
                    + needed + " "
                    + to.getName());
        }
        else {
            System.out.println("Cannot exchange " + + amount
                    + " "
                    + from.getName()
                    + " to "
                    + needed + " "
                    + to.getName());
        }
    }


}
