package by.eftech.webapp.web;


import by.eftech.webapp.service.DumpTrucksCrossCountryCapacityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class DumpTrucksCrossCountryCapacityAdminController {

    @Autowired
    private DumpTrucksCrossCountryCapacityService service;

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/admin/admin-dump-trucks-capacity", method = RequestMethod.GET)
    public ModelAndView getUploadFile(Principal principal) {
        return new ModelAndView("dump-trucks-capacity-admin", "trucks", service.getAll());

    }
}
