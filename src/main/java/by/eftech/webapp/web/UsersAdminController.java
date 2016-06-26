package by.eftech.webapp.web;

import by.eftech.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class UsersAdminController {

    @Autowired
    private UserService service;

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/admin/users", method = RequestMethod.GET)
    public ModelAndView getUploadFile(Principal principal) {
        return new ModelAndView("users-admin", "trucks", service.getAll());

    }
}
