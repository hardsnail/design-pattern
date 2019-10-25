package designpattern.proxy.dynamic;

public class OrderServiceImpl implements OrderService {

	public void pay(Long orderId) {
		System.out.println("order payed, orderId is " + orderId);
	}

	public void refund(Long orderId) {
		System.out.println("order refunded, orderId is " + orderId);
	}
}
