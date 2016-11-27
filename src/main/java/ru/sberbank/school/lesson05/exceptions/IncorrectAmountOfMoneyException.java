package main.java.ru.sberbank.school.lesson05.exceptions;

/**
 * Throws an exception if the amount of the argument is not a multiple of 100.
 */
public class IncorrectAmountOfMoneyException extends Exception {

    public String getMessage() {
        return "The amount of money is not correct, it should be a multiple of 100.";
    }
}
