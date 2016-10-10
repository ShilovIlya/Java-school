package main.ru.sberbank.school.lesson05.exceptions;

/**
 * Throws an exception if the pin code is not correct.
 */
public class IncorrectPinCodeException extends Exception {

    public String getMessage() {
        return "Pin code is incorrect.";
    }
}
