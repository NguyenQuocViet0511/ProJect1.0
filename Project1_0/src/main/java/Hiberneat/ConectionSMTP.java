/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hiberneat;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

/**
 *
 * @author admin
 */
public class ConectionSMTP {

    private static final Session Email;

    static {

        final String fromEmail = "thuykieunguyen310@gmail.com";
        // Mat khai email cua ban
        final String password = "etqhxcumxrodcatq";
        // dia chi email nguoi nhan
        final String toEmail = "lonconbaby2210@gmail.com";
        final String subject = "Java Example Test";
        final String body = "Hello Admin";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.port", "587"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        Email = Session.getInstance(props, auth);

    }

    public static Session getEmail() {
        return Email;
    }
}
