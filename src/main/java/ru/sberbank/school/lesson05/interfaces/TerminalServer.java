package ru.sberbank.school.lesson05.interfaces;

import ru.sberbank.school.lesson05.exceptions.IncorrectAmountOfMoneyException;
import ru.sberbank.school.lesson05.exceptions.CarriedOutMaintenanceWorkException;
import ru.sberbank.school.lesson05.exceptions.NotEnoughMoneyException;

public interface TerminalServer {

    void putMoney(int count) throws IncorrectAmountOfMoneyException, CarriedOutMaintenanceWorkException;

    void getMoney(int count) throws NotEnoughMoneyException, IncorrectAmountOfMoneyException, CarriedOutMaintenanceWorkException;

    int checkBalance() throws CarriedOutMaintenanceWorkException;
}
