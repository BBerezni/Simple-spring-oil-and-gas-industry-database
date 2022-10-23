package com.example.simple.spring.oil.and.gas.industry.database.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataController {

    @RequestMapping("/")
    public String indexPage(){
        return "index";
    }
}
