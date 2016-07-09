package by.eftech.webapp.service.impl;


import by.eftech.webapp.model.Item;
import by.eftech.webapp.model.SellerOrder;
import by.eftech.webapp.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    JavaMailSender mailSender;


    @Override
    @Async
    public void sendEmail(SellerOrder order, HttpSession session) {
        try {
            sendRichEmail(order, session);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }


    public void sendRichEmail(SellerOrder order, HttpSession session) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom("mytimetable11@gmail.com"); //<co id="co_addressSimpleEmail"/>
        helper.setTo("timetable11recipient@gmail.com");
        helper.setSubject("New spittle from ");
        List<Item> items = (List<Item>) session.getAttribute("cart");
        order.setItems(items);
        StringBuilder builder = new StringBuilder();
        builder.append("<html><body>").append("<p>").append("From: ").append(order.getFullname()).append(" ").append(order.getLastname()).append("</p>");
        builder.append("<p>").append("Company: ").append(order.getCompanyName()).append("</p>");
        builder.append("<p>").append("Country: ").append(order.getCountry()).append("</p>");
        builder.append("<p>").append("Orders: ").append(order.getCountry()).append("</p>");
        builder.append("<table style='border: 1px solid black; border-collapse: collapse;'>").append("<thead>")
                .append("<tr>")
                .append("<th style='border: 1px solid black;'>")
                .append("N")
                .append("</th>")
                .append("<th style='border: 1px solid black;'>")
                .append("Model Name")
                .append("</th>")
                .append("<th style='border: 1px solid black;'>")
                .append("Quantity")
                .append("</th>")
                .append("<th style='border: 1px solid black;'>")
                .append("Price Per One")
                .append("</th>")
                .append("</tr>")
                .append("</thead>")
                .append("<tbody>");
        for (int i = 0; i < order.getItems().size(); i++) {
            builder.append("<tr>")
                    .append("<td style='border: 1px solid black;'>")
                    .append(i + 1)
                    .append("</td>")
                    .append("<td style='border: 1px solid black;'>")
                    .append(order.getItems().get(i).getMiningMachinery().getModel().getName())
                    .append("</td>")
                    .append("<td style='border: 1px solid black;'>")
                    .append(order.getItems().get(i).getQuantity())
                    .append("</td>")
                    .append("<td style='border: 1px solid black;'>")
                    .append(order.getItems().get(i).getMiningMachinery().getPrice())
                    .append("</td>")
                    .append("</tr>");
            items.remove(i);
            i--;
        }
        builder.append("</tbody>").append("</table>").append("</body>").append("</html>");
        helper.setText(builder.toString(), true);

        mailSender.send(message);
    }
}
