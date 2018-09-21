package designpattern.factorymethod;

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
        Sender sender = null;
        SenderFactory senderFactory = null;
        if ("mail".equals(type)) {
            senderFactory = new MailSenderFactory();
            sender = senderFactory.produce();
        } else if ("sms".equals(type)) {
            senderFactory = new SmsSenderFactory();
            sender = senderFactory.produce();
        }
        sender.send();
    }
}
