package by.eftech.webapp.web;

import by.eftech.webapp.utils.EmailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
@RequestMapping("/email")
public class EmailController {


    @RequestMapping(value = "/change", method = RequestMethod.POST)
    public String changeEmail(@RequestParam(name = "email") String email, Principal principal){
        EmailSender.setToEmail(email);
        return "redirect:/category";
    }
}
