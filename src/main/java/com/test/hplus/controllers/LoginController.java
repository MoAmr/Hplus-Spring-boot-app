package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Mohammed Amr
 * @created 17/05/2021 - 21:15
 * @project hplus-app
 */

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login() {
        return "search";
    }
}
