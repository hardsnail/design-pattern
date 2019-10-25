package designpattern.proxy.statics;

public class Client {

	public static void main(String[] args) {
		OrderServiceProxy proxy = new OrderServiceProxy(new OrderService());
		proxy.pay();
	}
}
