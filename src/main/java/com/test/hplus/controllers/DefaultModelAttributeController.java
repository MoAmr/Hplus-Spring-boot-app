package com.test.hplus.controllers;

import com.test.hplus.beans.Login;
import com.test.hplus.beans.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mohammed Amr
 * @created 17/05/2021 - 22:16
 * @project hplus-app
 */

@ControllerAdvice
public class DefaultModelAttributeController {

    @ModelAttribute("newuser")
    public User getDefaultUser() {
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems() {
        return Arrays.asList(new String[]{"Male", "Female", "Other"});
    }

    @ModelAttribute("login")
    public Login getDefaultLogin() {
        return new Login();
    }
}
