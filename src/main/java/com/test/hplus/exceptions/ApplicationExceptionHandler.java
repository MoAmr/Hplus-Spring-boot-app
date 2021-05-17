package com.test.hplus.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Mohammed Amr
 * @created 17/05/2021 - 22:08
 * @project hplus-app
 */

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(ApplicationException.class)
    public String handleException() {
        System.out.println("In global exception handler");
        return "error";
    }
}
