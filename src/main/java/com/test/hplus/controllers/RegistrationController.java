package com.test.hplus.controllers;

import com.test.hplus.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Mohammed Amr
 * @created 13/05/2021 - 16:17
 * @project hplus-app
 */

@Controller
public class RegistrationController {

    @PostMapping("/registeruser")
    public String registerUser(@ModelAttribute("newuser")User user) {
        System.out.println("In registration controller!");
        return "login";
    }
}
