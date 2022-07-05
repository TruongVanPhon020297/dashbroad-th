package com.codegym.controller;


import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/product/list");

        List<Product> products = productService.findAll();
        modelAndView.addObject("products", products);

        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/product/create2");

        modelAndView.addObject("product", new Product());

        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView doCreate(@ModelAttribute Product product){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/product/create2");

        System.out.println(product.toString());

        productService.save(product);

        modelAndView.addObject("product", new Product());

        return modelAndView;
    }

    @GetMapping("/edit")
    public String showEdit(){
        return "/product/edit";
    }
}
