package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class TemplateController {

    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","YQL");
        return "hello";

    }
}
