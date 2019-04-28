package zadanieBank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Main {



    public static void main(String[] args) {

        //task3();

        //initWindow();

//        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass instanceA = outerClass.instance();
//        OuterClass.InnerClass instanceB = outerClass.new InnerClass();

        //instanceA.stop();
    }

    private static void task1(){
        initWindow();
        BankAccount1 account = new BankAccount1(1000);
        BankAccount1.BalanceCounter counter = account.new BalanceCounter(1.20);
        Timer timer = new Timer(1000, counter);
        timer.setInitialDelay(0);
        timer.start();

    }

    private static void task2(){
        initWindow();
        BankAccount2 account = new BankAccount2(100);
        Timer timer = new Timer(1000, account.createBalanceCounter(0.20));
        timer.setInitialDelay(0);
        timer.start();
    }

    private static void task3(){
        initWindow();
        BankAccount3 account = new BankAccount3(100, 0.004);
        Timer timer = new Timer(1000, account.createBalanceCounter());
        timer.setInitialDelay(0);
        timer.start();
    }

    private static void task4(){
        FunctionalInterface fi = new FunctionalInterface() {
            @Override
            public void init() {
                System.out.println("init");

            }
        };
    }

    private static void initWindow(){
        JFrame frame = new JFrame("Bank Account");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Close");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("close");
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });

        button.setBounds(0,0,150,150);
        button.setMargin(new Insets(10,10,10,10));
        frame.getContentPane().add(button, BorderLayout.CENTER);
        frame.pack();

        frame.setLocationRelativeTo(null); //todo zakomentować
        frame.setVisible(true);
    }


}
