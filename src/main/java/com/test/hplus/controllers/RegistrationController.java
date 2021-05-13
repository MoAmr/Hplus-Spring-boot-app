package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Mohammed Amr
 * @created 13/05/2021 - 16:17
 * @project hplus-app
 */

@Controller
public class RegistrationController {

    @PostMapping("/registeruser")
    public String registerUser() {
        System.out.println("In registration controller!");
        return "login";
    }
}
