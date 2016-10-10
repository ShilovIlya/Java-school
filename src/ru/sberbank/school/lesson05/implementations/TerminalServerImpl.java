package ru.sberbank.school.lesson05.implementations;

import ru.sberbank.school.lesson05.exceptions.CarriedOutMaintenanceWorkException;
import ru.sberbank.school.lesson05.exceptions.IncorrectAmountOfMoneyException;
import ru.sberbank.school.lesson05.exceptions.NotEnoughMoneyException;
import ru.sberbank.school.lesson05.interfaces.TerminalServer;

public class TerminalServerImpl implements TerminalServer{
    private int balance = 400;
    private boolean workException = false;

    @Override
    public void putMoney(int count) throws IncorrectAmountOfMoneyException, CarriedOutMaintenanceWorkException{
        if (workException == true) {
            throw new CarriedOutMaintenanceWorkException();
        }
        if (count % 100 != 0) {
            throw new IncorrectAmountOfMoneyException();
        }
        balance += count;
    }

    @Override
    public void getMoney(int count) throws NotEnoughMoneyException, IncorrectAmountOfMoneyException,
                                                                            CarriedOutMaintenanceWorkException {
        if (workException == true) {
            throw new CarriedOutMaintenanceWorkException();
        }
        if (count % 100 != 0) {
            throw new IncorrectAmountOfMoneyException();
        }
        if (count > balance) {
            throw new NotEnoughMoneyException();
        }
        balance -= count;
    }

    @Override
    public int checkBalance() throws CarriedOutMaintenanceWorkException{
        if (workException == true) {
            throw new CarriedOutMaintenanceWorkException();
        }
        return balance;
    }
}
