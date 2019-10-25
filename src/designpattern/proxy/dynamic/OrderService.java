package designpattern.proxy.dynamic;

public interface OrderService {
	public void pay(Long orderId);

	public void refund(Long orderId);
}
