package by.eftech.webapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTTPErrorHandlerController {

    @RequestMapping(value="/400")
    public String error400(){
        System.out.println("custom error handler");
        return "/400";
    }

    @RequestMapping(value="/404")
    public String error404(){
        System.out.println("custom error handler");
        return "/404";
    }

    @RequestMapping(value="/500")
    public String error500(){
        System.out.println("custom error handler");
        return "/500";
    }



}
