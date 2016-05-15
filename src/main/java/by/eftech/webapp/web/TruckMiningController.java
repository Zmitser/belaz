package by.eftech.webapp.web;

import by.eftech.webapp.service.TruckMiningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TruckMiningController {

    @Autowired
    private TruckMiningService service;


    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ModelAndView getCategory() {
        return new ModelAndView("category-grid", "list", service.getAll());
    }


    @RequestMapping(value = "/single-product/{id}", method = RequestMethod.GET)
    public ModelAndView getProduct(@PathVariable("id") int id) {
        return new ModelAndView("single-product", "item", service.get(id));
    }


}
