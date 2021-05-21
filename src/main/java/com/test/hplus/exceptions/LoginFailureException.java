package com.test.hplus.exceptions;

/**
 * @author Mohammed Amr
 * @created 21/05/2021 - 04:05
 * @project hplus-app
 */
public class LoginFailureException extends Exception {

    public LoginFailureException(String message) {
        super(message);
    }
}
