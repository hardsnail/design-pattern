package designpattern.simplefactory;

public class OrderService {

    public void send(String type) {
        Sender sender = null;
        if ("mail".equals(type)) {
            sender = new MailSender();
        } else if ("sms".equals(type)) {
            sender = new SmsSender();
        }
        sender.send();
    }

    public void sendByFactory(String type) {
        Sender sender = SendFactory.produce(type);
        sender.send();
    }
}
