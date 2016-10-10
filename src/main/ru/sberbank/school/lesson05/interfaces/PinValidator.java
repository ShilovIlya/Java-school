package main.ru.sberbank.school.lesson05.interfaces;

import main.ru.sberbank.school.lesson05.exceptions.AccountIsLockedException;
import main.ru.sberbank.school.lesson05.exceptions.IncorrectPinCodeException;

public interface PinValidator {

    void verifyPin(int pin) throws IncorrectPinCodeException, AccountIsLockedException;

}
