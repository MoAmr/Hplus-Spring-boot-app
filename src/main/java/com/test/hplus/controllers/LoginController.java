package com.test.hplus.controllers;

import com.test.hplus.beans.Login;
import com.test.hplus.beans.User;
import com.test.hplus.exceptions.ApplicationException;
import com.test.hplus.repositrory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

/**
 * @author Mohammed Amr
 * @created 17/05/2021 - 21:15
 * @project hplus-app
 */

@Controller
@SessionAttributes("login")
public class LoginController {


    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@ModelAttribute("login") Login login, HttpSession session) {
        //full session management
        //with session object
        // session.setAttribute("", "");
        User user = userRepository.searchByName(login.getUsername());
        if (user == null) {
            throw new ApplicationException("user not found!");
        }
        return "forward:/userprofile";
    }

    @ExceptionHandler(ApplicationException.class)
    public String handleException() {
        System.out.println("In exception handler of Login Controller");
        return "error";
    }
}
