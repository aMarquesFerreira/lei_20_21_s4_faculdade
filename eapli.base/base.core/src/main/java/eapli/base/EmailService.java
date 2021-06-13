package eapli.base;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * EmailService class
 */
public class EmailService {

    private String to;
    private String from;
    private Session session;

    /**
     * EmailService class constructor
     *
     * @param to
     * @param from
     */
    public EmailService(String to, String from) {
        session = Session.getInstance(System.getProperties());
        this.to = to;
        this.from = from;
    }

    /**
     * EmailService class constructor
     * @param to
     * @param from
     * @param session
     */
    public EmailService(String to, String from, Session session) {
        this.to = to;
        this.from = from;
        this.session = session;
    }

    /**
     * Getter of To attribute
     * @return
     */
    public String getTo() {
        return to;
    }

    /**
     * Setter of To attribute
     * @param to
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Getter of From attribute
     * @return
     */
    public String getFrom() {
        return from;
    }

    /**
     * Setter of From attribute
     * @param from
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sends an email through JavaMail API and SMTP Protocol
     * @param subject
     * @param body
     *
     * @return boolean
     */
    public boolean send(String subject, String body) {
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(subject);
            message.setText(body);

            Transport transport = session.getTransport();
            transport.connect();
            Transport.send(message);
            transport.close();
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
    }
}
