package by.eftech.webapp.service;


import by.eftech.webapp.model.SellerOrder;

import javax.servlet.http.HttpSession;

public interface EmailService {

    void sendEmail(SellerOrder order, HttpSession session);
}
