package com.example.boyang.mykeeper.Exceptions;

/**
 * Created by boyang on 6/12/17.
 */

/**
 * Signal that data does not fulfill certain constrains
 */
public class IllegalValueException extends Exception {
    public IllegalValueException(String msg) {
        super(msg);
    }
    public IllegalValueException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
