package com.jawa.mvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showLoginPage")
    public String showLogin() {
        return "login-form";
    }

    @GetMapping("/accessDenied")
    public String showAccessDenied() {
        return "access-denied";
    }
}
