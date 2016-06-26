package by.eftech.webapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class RootController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getRoot(Principal principal) {
        return "index";
    }

}
