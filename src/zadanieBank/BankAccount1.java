package zadanieBank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount1 {
    private int balanse; // zmienna klasy zewnętrznej

    public BankAccount1(int balanse) { //konstr klasy zewn.
        this.balanse = balanse;
    }

    public class BalanceCounter implements ActionListener /*todo ActionListener*/ { //klasa wewnętrzna dynamiczna

        private double interestRate; //oprocentowanie

        public BalanceCounter(double interestRate) {
            this.interestRate = interestRate;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

    public int getBalanse() {
        return balanse;
    }

    public void setBalanse(int balanse) {
        this.balanse = balanse;
    }
}
