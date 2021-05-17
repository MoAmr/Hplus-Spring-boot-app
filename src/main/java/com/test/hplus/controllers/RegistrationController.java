package com.test.hplus.controllers;

import com.test.hplus.beans.User;
import com.test.hplus.repositrory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

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
    public String registerUser(@Valid @ModelAttribute("newuser")User user, BindingResult result, Model model) {
        System.out.println("In registration controller!");

        if (result.hasErrors()) {
            return "register";
        }
        userRepository.save(user);
        model.addAttribute("dataSaved", "User registered successfully");
        return "login";
    }
}
