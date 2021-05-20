package com.test.hplus.controllers;

import com.test.hplus.beans.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * @author Mohammed Amr
 * @created 21/05/2021 - 01:24
 * @project hplus-app
 */

@Controller
public class UserProfileController {

    @PostMapping("/userprofile")
    public String getsUserProfile(@SessionAttribute("login")Login login, Model model) {
        System.out.println("In user profile controller!");
        return "profile";
    }
}
