package designpattern.factorymethod;

public class Main {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.send("mail");
        orderService.sendByFactory("sms");
    }

}
