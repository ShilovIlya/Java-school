package ru.sberbank.school.test.lesson05;

import ru.sberbank.school.lesson05.implementations.TerminalImpl;

public class TerminalUserTest {
    public static void main(String[] args) {
        TerminalImpl terminal = new TerminalImpl();
        System.out.println("put 1: ");
        terminal.putMoney(1);
        System.out.println("get 1: ");
        terminal.getMoney(1);
        System.out.println("check balance: ");
        terminal.checkBalance();
        System.out.println("put 0000 pin: ");
        terminal.putPin(0000);
        terminal.putPin(0000);
        terminal.putPin(0000);

        try {
            Thread.currentThread().sleep(1000);
            System.out.println("put 0000 pin: ");
            terminal.putPin(0000);
            Thread.currentThread().sleep(1000);
            System.out.println("put 9999 pin: ");
            terminal.putPin(9999);
            Thread.currentThread().sleep(1000);
            System.out.println("put 8888 pin: ");
            terminal.putPin(8888);
            Thread.currentThread().sleep(1000);
            System.out.println("put 7777 pin: ");
            terminal.putPin(7777);
            Thread.currentThread().sleep(1000);
            System.out.println("put 6666 pin: ");
            terminal.putPin(6666);
            Thread.currentThread().sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("put 1234 pin: ");
        terminal.putPin(1234);

        System.out.println("check balance: ");
        terminal.checkBalance();

        System.out.println("get 2: ");
        terminal.getMoney(2);
        System.out.println("get 200: ");
        terminal.getMoney(200);
        System.out.println("put 5: ");
        terminal.putMoney(5);
        System.out.println("put 500: ");
        terminal.putMoney(500);
        System.out.println("check balance: ");
        terminal.checkBalance();
        System.out.println("get 300: ");
        terminal.getMoney(300);
        System.out.println("check balance: ");
        terminal.checkBalance();

    }
}
