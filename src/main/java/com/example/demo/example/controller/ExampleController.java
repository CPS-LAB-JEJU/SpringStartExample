package com.example.demo.example.controller;

import com.example.demo.example.domain.Example;
import com.example.demo.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExampleController {

    private final ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/")
    public String getIndexView() {
        return "index";
    }

    @GetMapping("/example/new")
    public String getNewView() {
        return "new";
    }

    @PostMapping("/example/new")
    public String create(ExampleForm form) {
        Example example = new Example(form.getTitle(), form.getContent());
        Long id = exampleService.newExample(example);
        return "redirect:/";
    }
}
