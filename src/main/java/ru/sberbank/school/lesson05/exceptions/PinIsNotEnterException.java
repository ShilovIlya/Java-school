package ru.sberbank.school.lesson05.exceptions;

/**
 * Throws an exception if pin is not enter.
 */
public class PinIsNotEnterException extends Exception {

    public String getMessage() {
        return "Pin is not entered.";
    }
}
