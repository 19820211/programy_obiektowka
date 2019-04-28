package zadanieBank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount3 {

    private int balanse; // zmienna klasy zewnętrznej
    private double interestRate;

    public BankAccount3(int balanse, double interestRate) { //konstr klasy zewn.
        this.balanse = balanse;
        this.interestRate = interestRate;
    }

    public ActionListener createBalanceCounter(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int newBalance = (int)(BankAccount3.this.balanse * interestRate);
                System.out.println("Changing account balance from "
                        //+ balanse /*BankAccount2.this.balance*/
                        + BankAccount3.this.balanse
                        + " to "
                        + newBalance);
                balanse += newBalance;
            }
        };
    }

    public int getBalanse() {
        return balanse;
    }

    public void setBalanse(int balanse) {
        this.balanse = balanse;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
