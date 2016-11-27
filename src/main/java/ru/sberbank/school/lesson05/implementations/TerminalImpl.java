package main.java.ru.sberbank.school.lesson05.implementations;

import main.java.ru.sberbank.school.lesson05.exceptions.*;
import main.java.ru.sberbank.school.lesson05.interfaces.TerminalServer;
import main.java.ru.sberbank.school.lesson05.interfaces.PinValidator;
import main.java.ru.sberbank.school.lesson05.interfaces.Terminal;

public class TerminalImpl implements Terminal {
    private final TerminalServer server = new TerminalServerImpl();;
    private final PinValidator pinValidator = new PinValidatorImpl();
    private boolean validPin = false;

    @Override
    public void checkBalance() {
        try {
            checkPin();
            Integer balance = server.checkBalance();
            new MessageHandler("Account balance is " + balance.toString());
        } catch (PinIsNotEnterException | CarriedOutMaintenanceWorkException e) {
            new MessageHandler(e.getMessage());
        }
    }

    @Override
    public void putMoney(int count) {
        try {
            checkPin();
            server.putMoney(count);
            new MessageHandler("Account credited for the amount of " + count);
        } catch (PinIsNotEnterException | IncorrectAmountOfMoneyException | CarriedOutMaintenanceWorkException e) {
            new MessageHandler(e.getMessage());
        }
    }

    @Override
    public void getMoney(int count) {
        try {
            checkPin();
            server.getMoney(count);
            new MessageHandler("Account reduced by " + count);
        } catch (PinIsNotEnterException | IncorrectAmountOfMoneyException | CarriedOutMaintenanceWorkException | NotEnoughMoneyException e) {
            new MessageHandler(e.getMessage());
        }
    }

    @Override
    public void putPin(int pin) {
        try {
            pinValidator.verifyPin(pin);
            validPin = true;
            new MessageHandler("Pin is correct.");
        } catch (AccountIsLockedException | IncorrectPinCodeException e) {
            new MessageHandler(e.getMessage());
        }
    }

    private void checkPin() throws PinIsNotEnterException{
        if (!validPin) {
            throw new PinIsNotEnterException();
        }
    }
}
