package by.eftech.webapp.web;


import by.eftech.webapp.service.TruckMiningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class RootController {

    @Autowired
    private TruckMiningService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getRoot(Principal principal, Model model) {
        model.addAttribute("trucks", service.getAllByDate());
        return "index";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getLoginAdmin(Principal principal) {
        return "admin-login";
    }

    @RequestMapping(value = "sitemap.xml", method = RequestMethod.GET)
    public String getXmlSitemap(Principal principal) {
        return "redirect:/static/sitemap.xml";


    }


    @RequestMapping(value = "robots.txt", method = RequestMethod.GET)
    public String getRobotsTxt(Principal principal) {
        return "redirect:/static/robots.txt";


    }

}
