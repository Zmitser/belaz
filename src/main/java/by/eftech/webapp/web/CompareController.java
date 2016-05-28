package by.eftech.webapp.web;

import by.eftech.webapp.model.TruckMining;
import by.eftech.webapp.service.TruckMiningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/compare")
public class CompareController {


    @Autowired
    private TruckMiningService service;

    @RequestMapping(value = "/compare-this/{id}", method = RequestMethod.GET)
    public String putProductForCompare(@PathVariable("id") int id, HttpSession session) {
        if (session.getAttribute("compare") == null) {
            List<TruckMining> compare = new ArrayList<>();
            compare.add(service.get(id));
            session.setAttribute("compare", compare);
        } else {
            List<TruckMining> compare = (List<TruckMining>) session.getAttribute("compare");
            compare.add(service.get(id));
            session.setAttribute("compare", compare);
        }
        return "redirect:/category";
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String getNotFound(HttpSession session) {
        return "cart";
    }


    @RequestMapping(value = "/compare-list", method = RequestMethod.GET)
    public String getCompare(HttpSession session) {
        return "compare";
    }



    @RequestMapping(value = "/compare-list/remove/{index}", method = RequestMethod.GET)
    public String getCompare(@PathVariable(value = "index") int index, HttpSession session) {
        List<TruckMining> compare = (List<TruckMining>) session.getAttribute("compare");
        compare.remove(index);
        return "redirect:/compare/compare-list";
    }
}