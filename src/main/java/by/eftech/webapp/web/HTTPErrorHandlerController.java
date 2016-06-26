package by.eftech.webapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HTTPErrorHandlerController {

    @RequestMapping(value="/400")
    public String error400(Principal principal){
        System.out.println("custom error handler");
        return "/400";
    }

    @RequestMapping(value="/404")
    public String error404(Principal principal){
        System.out.println("custom error handler");
        return "/404";
    }

    @RequestMapping(value="/403")
    public String error403(Principal principal){
        System.out.println("custom error handler");
        return "/403";
    }
    @RequestMapping(value="/500")
    public String error500(Principal principal){
        System.out.println("custom error handler");
        return "/500";
    }



}
