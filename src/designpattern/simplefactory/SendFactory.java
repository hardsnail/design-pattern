package designpattern.simplefactory;

public class SendFactory {

    public static Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            return null;
        }
    }
}
