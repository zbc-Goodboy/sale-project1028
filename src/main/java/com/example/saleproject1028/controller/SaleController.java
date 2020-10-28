package com.example.saleproject1028.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaleController {
    @RequestMapping("/")
    public String show(){
        return "show";
    }
}
