package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mohammed Amr
 * @created 21/05/2021 - 02:36
 * @project hplus-app
 */

@Controller
public class RedirectionController {

    @GetMapping("/redirectToLinkedIn")
    public String redirectOut() {
        System.out.println("In redirect controller");
        return "redirect:http://www.linkedin.com";
    }
}
