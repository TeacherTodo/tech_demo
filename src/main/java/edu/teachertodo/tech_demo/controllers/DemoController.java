package edu.teachertodo.tech_demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class DemoController
{
    @GetMapping("/student")
    public String student(Model model)
    {
        return "student";
    }

    @GetMapping("/admin")
    public String admin(Model model)
    {
        return "admin";
    }

    @GetMapping("/data")
    public String data(Model model)
    {
        return "data";
    }
}