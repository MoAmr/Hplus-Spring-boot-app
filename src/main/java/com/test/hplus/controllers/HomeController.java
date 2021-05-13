package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
