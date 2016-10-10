package main.ru.sberbank.school.lesson05.exceptions;

/**
 * Throws an exception if the amount of money is not enough.
 */
public class NotEnoughMoneyException extends Exception {

    public String getMessage() {
        return "Not enough money in the account.";
    }
}
