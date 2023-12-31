package com.example.mvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringMvcController {

    @GetMapping("/")
    public String getHello(Model theModel) {
        theModel.addAttribute("theDate", new java.util.Date());
        return "Hello";
    }

    @RequestMapping("/showForm")
    public String getForm() {
        return "view-form";
    }

    @RequestMapping("/processForm")
    public String viewForm(HttpServletRequest httpServletRequest, Model model) {
        String name = httpServletRequest.getParameter("studentName");
        String result = "Hi " + name.toUpperCase() + "!";
        model.addAttribute("message", result);
        return "Hello-world";
    }

    @RequestMapping("/processFormVersion2")
    public String viewFromSecondVersion(
            @RequestParam("studentName") String studentName, Model model) {
        model.addAttribute("message", "Yo ... " + studentName.toUpperCase());
        return "Hello-world";
    }
}
