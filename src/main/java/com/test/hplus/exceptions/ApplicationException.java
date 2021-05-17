package com.test.hplus.exceptions;

/**
 * @author Mohammed Amr
 * @created 17/05/2021 - 21:46
 * @project hplus-app
 */
public class ApplicationException extends RuntimeException {

    public ApplicationException(String message) {
        super(message);
    }
}
