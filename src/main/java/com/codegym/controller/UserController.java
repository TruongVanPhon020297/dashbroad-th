package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String showList(){
        return "/user/list";
    }
    @GetMapping("/create")
    public String showCreate(){
        return "/user/create";
    }
    @GetMapping("/edit")
    public String showEdit() {
        return "/user/edit";
    }
}
