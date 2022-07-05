package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @GetMapping
    public String showList(){
        return "/product/list";
    }
    @GetMapping("/create")
    public String showCreate(){
        return "/product/create";
    }
    @GetMapping("/edit")
    public String showEdit(){
        return "/product/edit";
    }
}
