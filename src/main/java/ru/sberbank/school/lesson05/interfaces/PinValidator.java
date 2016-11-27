package main.java.ru.sberbank.school.lesson05.interfaces;

import main.java.ru.sberbank.school.lesson05.exceptions.AccountIsLockedException;
import main.java.ru.sberbank.school.lesson05.exceptions.IncorrectPinCodeException;

public interface PinValidator {

    void verifyPin(int pin) throws IncorrectPinCodeException, AccountIsLockedException;

}
