package by.eftech.webapp.web;

import by.eftech.webapp.model.Item;
import by.eftech.webapp.model.SellerOrder;
import by.eftech.webapp.service.OrderService;
import by.eftech.webapp.utils.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public String getCheckout(HttpSession session) {
        return "checkout";
    }


    @RequestMapping(value = "/continue-order", method = RequestMethod.POST)
    public String continueOrder(@Valid SellerOrder order, HttpSession session, BindingResult result, SessionStatus status) throws IOException {
        status.setComplete();
        List<Item> items = (List<Item>) session.getAttribute("cart");
        order.setItems(items);
        service.save(order);
        EmailSender sender = EmailSender.getInstance();
        StringBuilder builder = new StringBuilder();
        builder.append("From: ").append(order.getFullname()).append(" ").append(order.getLastname());
        builder.append("\n");
        builder.append("Company: ").append(order.getCompanyName());
        builder.append("\n");
        builder.append("Country: ").append(order.getCountry());
        builder.append("\n");
        builder.append("Orders: ");
        builder.append("\n");
        for (int i = 0; i < order.getItems().size(); i++) {
            builder.append(i + 1).append(". ").append(order.getItems().get(i).getMiningMachinery().getModel().getName()).append("\n");
            items.remove(i);
            i--;
        }
        sender.sendEmail(order.getEmailAddress(), builder.toString());
        return "redirect:/";
    }


    @RequestMapping(value = "/send-e", method = RequestMethod.POST)
    public void doSendEmail(HttpServletRequest request) {
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");

    }


}

