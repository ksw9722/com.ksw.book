package com.kswtest.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/error/404")
    public String error404(){
        return "ERROR404!!";
    }

    @GetMapping("/error")
    public String error(){
        return "Error!@#!!!";
    }

    @GetMapping("/error/500")
    public String error500(){
        return "ERROR500!!";
    }
}
