package com.donutecommerce.donutecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("/shop")
    public String shop(){
        return "shop";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin-login";
    }

}
