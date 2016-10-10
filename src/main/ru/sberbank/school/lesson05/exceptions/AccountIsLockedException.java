package main.ru.sberbank.school.lesson05.exceptions;

/**
 * Throws an exception when you try to enter a PIN code at the time of account lockout.
 * Account blocked if the number of attempts is greater than 3.
 */
public class AccountIsLockedException extends Exception {
    private long lockedTime;

    public AccountIsLockedException() {}

    public AccountIsLockedException(long time) {
        lockedTime = time;
    }

    public long getLockedTime() {
        return lockedTime;
    }

    public String getMessage() {
        return "Account is locked for " + (lockedTime / 1000) + " seconds.";
    }
}
