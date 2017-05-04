package com.example;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Component
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public String Hello(){
        return "Test";
    }
}
