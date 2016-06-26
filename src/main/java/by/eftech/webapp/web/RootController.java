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


    @RequestMapping(value = "sitemap.xml", method = RequestMethod.GET)
    public String getXmlSitemap(Principal principal) {
        return "redirect:/static/sitemap.xml";

    }

    @RequestMapping(value = "robots.txt", method = RequestMethod.GET)
    public String getRobotsTxt(Principal principal) {
        return "redirect:/static/robots.txt";

    }

}
