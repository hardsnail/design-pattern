package designpattern.factorymethod;

public class MailSenderFactory implements SenderFactory {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
