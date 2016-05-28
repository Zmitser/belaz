package by.eftech.webapp.web;

import by.eftech.webapp.service.TruckMiningService;
import by.eftech.webapp.utils.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "/order-now/{id}", method = RequestMethod.GET)
    public String orderNow(@PathVariable(value = "id") int id, HttpSession session) {
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
        return "redirect:/category";
    }


//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
//    public String delete(@PathVariable(value = "id") int id, HttpSession session) {
//
//        List<Item> cart = (List<Item>) session.getAttribute("cart");
//        int index = ifExisting(id, session);
//
//        if (cart.get(index).getQuantity() > 1){
//            Integer quantity = cart.get(index).getQuantity();
//            cart.get(index).setQuantity(quantity - 1);
//        } else {
//            cart.remove(index);
//        }
//        session.setAttribute("cart", cart);
//        return "cart";
//    }


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
