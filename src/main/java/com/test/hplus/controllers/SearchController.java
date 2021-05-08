package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Mohammed Amr
 * @created 09/05/2021 - 01:25
 * @project hplus-app
 */

@Controller
public class SearchController {

    @GetMapping("/search")
    public String search(@RequestParam("search") String search, Model model) {
        System.out.println("In search controller!");
        System.out.println("search criteria: " + search);
        return "search";
    }

}
