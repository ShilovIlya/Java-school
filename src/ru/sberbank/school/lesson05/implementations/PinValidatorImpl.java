package ru.sberbank.school.lesson05.implementations;

import ru.sberbank.school.lesson05.exceptions.AccountIsLockedException;
import ru.sberbank.school.lesson05.exceptions.IncorrectPinCodeException;
import ru.sberbank.school.lesson05.interfaces.PinValidator;

public class PinValidatorImpl implements PinValidator {
    private int correctPin = 0000;
    private int pinErrorEnterCount;

    PinValidatorImpl() {
        pinErrorEnterCount = 0;
    }
    @Override
    public boolean verifyPin(int pin) throws IncorrectPinCodeException, AccountIsLockedException {
        if (pinErrorEnterCount >= 4) {
            throw new AccountIsLockedException();

        }
        if (pin == correctPin) {
            pinErrorEnterCount = 0;
            return true;
        } else {
            pinErrorEnterCount += 1;
            } else {
                throw new IncorrectPinCodeException();
            }
        }
    }
}
