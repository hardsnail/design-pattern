package designpattern.proxy.dynamic;

public class Client {

	public static void main(String[] args) throws Throwable {

		OrderServiceImpl orderservice = new OrderServiceImpl();

		LogInvocationHandler invocationHandler = new LogInvocationHandler();
		OrderService object = (OrderService) invocationHandler.getProxy(orderservice);
		object.pay(1L);
		object.refund(1l);
	}

}
