package com.example.mvc.controller;

import com.example.mvc.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${codingLanguages}")
    private List<String> languages;

    @Value("${operatingSystems}")
    private List<String> operatingSystems;
    @GetMapping("/showStudentForm")
    public String showForm(Model model) {

        Student student = new Student();

        model.addAttribute("student", student);
        model.addAttribute("countries", countries);
        model.addAttribute("languages", languages);
        model.addAttribute("operatingSystems", operatingSystems);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String viewProcessedForm(@ModelAttribute("student") Student student, Model model) {

        System.out.println("The student info is :" + student.getFirstName() + " " + student.getLastName());
        return "student-confirmation";
    }
}
