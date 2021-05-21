package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Mohammed Amr
 * @created 21/05/2021 - 02:19
 * @project hplus-app
 */

@Controller
public class LogoutController {

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        System.out.println("Ending user session");
        session.invalidate();
        //System.out.println(session.getAttribute("login"));
        return "login";
    }
}
