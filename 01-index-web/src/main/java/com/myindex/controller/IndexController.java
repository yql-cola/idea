package com.myindex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Myindex")
public class IndexController {

    @RequestMapping("test")
    public String Myindex(){
        return "index.html";
    }

    @RequestMapping("test1")
    public String admin_login(){
        return "admin_login.html";
    }

}
