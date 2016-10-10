package ru.sberbank.school.lesson05.interfaces;

import ru.sberbank.school.lesson05.exceptions.AccountIsLockedException;
import ru.sberbank.school.lesson05.exceptions.IncorrectPinCodeException;

public interface PinValidator {

    void verifyPin(int pin) throws IncorrectPinCodeException, AccountIsLockedException;

}
