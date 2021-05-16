package com.test.hplus.controllers;

import com.test.hplus.beans.User;
import com.test.hplus.repositrory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Mohammed Amr
 * @created 13/05/2021 - 16:17
 * @project hplus-app
 */

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/registeruser")
    public String registerUser(@ModelAttribute("newuser")User user, Model model) {
        System.out.println("In registration controller!");
        userRepository.save(user);
        model.addAttribute("dataSaved", "User registered successfully");
        return "login";
    }
}
