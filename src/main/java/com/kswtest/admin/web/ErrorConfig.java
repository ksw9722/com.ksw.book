package com.kswtest.admin.web;

import org.springframework.boot.autoconfigure.webservices.WebServicesProperties;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;


@Controller
public class ErrorConfig implements ErrorController {
    private final String PATH = "/error/";
    private String VIEW_PATH = "/errors";

    @RequestMapping(value=PATH)
    public String error(HttpServletRequest request){
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if(status!=null){
            int statusCode = Integer.valueOf(status.toString());

            if(statusCode == 404){
                return PATH+404;
            }

            if(statusCode==500){
                return PATH+500;
            }
            return "error";

        }else{
            return "error";
        }
    }

    @Override
    public String getErrorPath(){
        return "/error";
    }

}
