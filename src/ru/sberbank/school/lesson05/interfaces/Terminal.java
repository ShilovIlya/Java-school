package ru.sberbank.school.lesson05.interfaces;

import ru.sberbank.school.lesson05.exceptions.NotEnoughMoneyException;

public interface Terminal {

    void checkBalance();

    void putMoney(int count);

    void getMoney(int count);

    void putPin(int pin);

}
