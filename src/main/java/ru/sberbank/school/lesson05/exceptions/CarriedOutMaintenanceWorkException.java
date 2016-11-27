package ru.sberbank.school.lesson05.exceptions;

/**
 * Throws an exception if terminal server does not work.
 */
public class CarriedOutMaintenanceWorkException extends Exception {

    public String getMessage() {
        return "The server is down for scheduled maintenance.";
    }
}
