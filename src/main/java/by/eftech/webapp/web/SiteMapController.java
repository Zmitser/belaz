package by.eftech.webapp.web;

import by.eftech.webapp.service.DumpTrucksCrossCountryCapacityService;
import by.eftech.webapp.service.TruckMiningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
@RequestMapping("/sitemap")
public class SiteMapController {

    @Autowired
    private TruckMiningService truckMiningService;

    @Autowired
    private DumpTrucksCrossCountryCapacityService dumpTrucksCrossCountryCapacityService;


    @RequestMapping(method = RequestMethod.GET)
    public String getSitemap(Model model, Principal principal) {
        model.addAttribute("truckMinings", truckMiningService.getAll());
        model.addAttribute("dumpTrucks", dumpTrucksCrossCountryCapacityService.getAll());
        return "sitemap";
    }
}
