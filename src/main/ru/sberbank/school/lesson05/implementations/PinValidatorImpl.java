package main.ru.sberbank.school.lesson05.implementations;

import main.ru.sberbank.school.lesson05.exceptions.AccountIsLockedException;
import main.ru.sberbank.school.lesson05.exceptions.IncorrectPinCodeException;
import main.ru.sberbank.school.lesson05.interfaces.PinValidator;

import java.util.Date;

public class PinValidatorImpl implements PinValidator {
    private final int correctPin = 1234;
    private int pinErrorEnterCount;
    private long errorDate;

    PinValidatorImpl() {
        pinErrorEnterCount = 0;
        errorDate = new Date().getTime();
    }

    @Override
    public void verifyPin(int pin) throws IncorrectPinCodeException, AccountIsLockedException {
        checkDate();
        checkErrorEnterCount();
        checkCorrectPint(pin);
    }

    private void checkCorrectPint(int pin) throws IncorrectPinCodeException{
        if (pin == correctPin) {
            pinErrorEnterCount = 0;
        } else {
            pinErrorEnterCount += 1;
            throw new IncorrectPinCodeException();
        }
    }

    private void checkDate() throws AccountIsLockedException {
        long lockedTime = errorDate - new Date().getTime();
        if (lockedTime > 0) {
            throw new AccountIsLockedException(lockedTime);
        }
    }

    private void checkErrorEnterCount() throws AccountIsLockedException {
        if (pinErrorEnterCount > 3) {
            long time = new Date().getTime();
            errorDate =  time + 5000;
            pinErrorEnterCount = 0;
            throw new AccountIsLockedException(5000);
        }
    }
}

