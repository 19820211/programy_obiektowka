package zadanieKantor;

public class Main {
    public static void main(String[] args) {

//        double d = CurrencyConverter.convert
//                (Currency.EUR, Currency.PLN);

        //System.out.println(d);
        //System.out.println(CurrencyConverter.convert(Currency.EUR, Currency.PLN));

        ExchangeOffice exchangeOffice = new ExchangeOffice(1000.00);
        exchangeOffice.showFunds();

        exchangeOffice.exchange(250, Currency.PLN, Currency.EUR);
        exchangeOffice.showFunds();

        //arrayCounter(80);

    }

    //Przykład z wyjątkiem na tablicy
//        public static int  arrayCounter(int index){
//            int[] numbers = {10,20,30,40,50,60};
//            try {
//                return numbers[index];
//            } catch (Exception e){
//                System.out.println("Wybrałeś liczbę z poza zakresu");
//            }
//            return -1;
//        }
//        int[] numbers = {10,20,30,40,50,60};
//        for (int i = 0; i < 8; i++) {
//            System.out.println(numbers[i]);
//        }



}
