package by.eftech.webapp.web;

import by.eftech.webapp.model.SellerOrder;
import by.eftech.webapp.service.EmailService;
import by.eftech.webapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.security.Principal;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;


    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public String getCheckout(HttpSession session,
                              ModelMap modelMap,
                              Principal principal) {
        modelMap.put("order", new SellerOrder());
        return "checkout";
    }


    @RequestMapping(value = "/continue-order", method = RequestMethod.POST)
    public String continueOrder(@ModelAttribute("order") @Valid SellerOrder order,
                                BindingResult result,
                                HttpSession session,
                                SessionStatus status,
                                ModelMap model,
                                Principal principal) throws IOException {
        if (result.hasErrors()) {
            return "/checkout";
        } else {
            status.setComplete();
            service.save(order);
            emailService.sendEmail(order, session);
        }

        return "redirect:/";
    }


    @RequestMapping(value = "/send-e", method = RequestMethod.POST)
    public void doSendEmail(HttpServletRequest request, Principal principal) {
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");

    }


}


