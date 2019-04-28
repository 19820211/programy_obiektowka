package zadanieBank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount2 {
    private int balanse; // zmienna klasy zewnętrznej

    public BankAccount2(int balanse) { //konstr. klasy zewn.
        this.balanse = balanse;
    }

    public ActionListener createBalanceCounter(double interestRate){
        class BalanceCounter implements ActionListener{
            private double interestRate; //oprocentowanie

            public BalanceCounter(double interestRate) {
                this.interestRate = interestRate;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                int newBalance = (int)(BankAccount2.this.balanse * interestRate);
                System.out.println("Changing account balance from "
                        //+ balanse /*BankAccount2.this.balance*/
                        + BankAccount2.this.balanse
                        + " to "
                        + newBalance);
                balanse = newBalance;
            }
        }
        return new BalanceCounter(interestRate); //zwraca klasę wewnętrzną lokalną
    }

    public int getBalanse() {
        return balanse;
    }

    public void setBalanse(int balanse) {
        this.balanse = balanse;
    }
}
