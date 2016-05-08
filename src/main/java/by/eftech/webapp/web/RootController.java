package by.eftech.webapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RootController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getRoot() {
        return "index";
    }
    @RequestMapping(value = "/authentication", method = RequestMethod.GET)
    public String getAuth() {
        return "authentication";
    }

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public String getCart() {
        return "cart";
    }


    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String getCategory() {
        return "category-grid";
    }


    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public String getCheckout() {
        return "checkout";
    }


    @RequestMapping(value = "/compare", method = RequestMethod.GET)
    public String getCompare() {
        return "compare";
    }

    @RequestMapping(value = "/single-product", method = RequestMethod.GET)
    public String getProduct() {
        return "single-product";
    }

    @RequestMapping(value = "/wishlist", method = RequestMethod.GET)
    public String getWishlist() {
        return "wishlist";
    }
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String getNotFound() {
        return "404";
    }
}
