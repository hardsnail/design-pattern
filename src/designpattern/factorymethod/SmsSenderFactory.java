package designpattern.factorymethod;

public class SmsSenderFactory implements SenderFactory {

    @Override
    public Sender produce() {
        return new SmsSender();
    }

}
