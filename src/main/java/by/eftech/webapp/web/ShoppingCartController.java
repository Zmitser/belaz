package by.eftech.webapp.web;

import by.eftech.webapp.service.TruckMiningService;
import by.eftech.webapp.utils.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/shopping-cart")
public class ShoppingCartController {

    @Autowired
    private TruckMiningService service;

    @RequestMapping(value = "/order-now/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String orderNow(@PathVariable(value = "id") int id, HttpSession session, Model model) {
        if (session.getAttribute("cart") == null) {
            List<Item> cart = new ArrayList<>();
            cart.add(new Item(service.get(id), 1));
            session.setAttribute("cart", cart);
        } else {
            List<Item> cart = (List<Item>) session.getAttribute("cart");
            int index = ifExisting(id, session);
            if (index == -1) {
                cart.add(new Item(service.get(id), 1));
            } else {
                int quantity = cart.get(index).getQuantity();
                cart.get(index).setQuantity(quantity + 1);
            }

            session.setAttribute("cart", cart);
        }
        return "redirect:/category/filter";
    }

    @RequestMapping(value = "/reduce/{id}", method = RequestMethod.GET)
    public String reduce(@PathVariable(value = "id") int id, HttpSession session) {

        List<Item> cart = (List<Item>) session.getAttribute("cart");

        if (cart.get(id).getQuantity() > 1) {
            Integer quantity = cart.get(id).getQuantity();
            cart.get(id).setQuantity(quantity - 1);
        } else {
            cart.remove(id);
        }
        session.setAttribute("cart", cart);
        return "cart";
    }


    @RequestMapping(value = "/add/{id}", method = RequestMethod.GET)
    public String add(@PathVariable(value = "id") int id, HttpSession session) {

        List<Item> cart = (List<Item>) session.getAttribute("cart");
        Integer quantity = cart.get(id).getQuantity();
        cart.get(id).setQuantity(quantity + 1);
        session.setAttribute("cart", cart);
        return "cart";
    }


    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public String remove(@PathVariable(value = "id") int id, HttpSession session) {

        List<Item> cart = (List<Item>) session.getAttribute("cart");
        cart.remove(id);
        session.setAttribute("cart", cart);
        return "cart";
    }


    private int ifExisting(int id, HttpSession session) {
        List<Item> cart = (List<Item>) session.getAttribute("cart");
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getTruckMining().getId() == id) {
                return i;
            }

        }
        return -1;
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String getNotFound(HttpSession session) {
        return "cart";
    }
}
