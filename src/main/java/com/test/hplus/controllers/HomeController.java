package com.test.hplus.controllers;

import com.test.hplus.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mohammed Amr
 * @created 07/05/2021 - 16:54
 * @project springmvcmaven
 */

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome() {
        System.out.println("In home controller!");
        return "index";
    }

    @GetMapping("/goToSearch")
    public String goToSearch() {
        System.out.println("Going to search page!");
        return "search";
    }

    @GetMapping("/goToLogin")
    public String goToLogin() {
        System.out.println("Going to login page!");
        return "login";
    }

    @GetMapping("/goToRegistration")
    public String goToRegistration() {
        System.out.println("Going to Registration page!");
        return "register";
    }

    @ModelAttribute("newuser")
    public User getDefaultUser() {
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems() {
        return Arrays.asList(new String[]{"Male", "Female", "Other"});
    }
}
