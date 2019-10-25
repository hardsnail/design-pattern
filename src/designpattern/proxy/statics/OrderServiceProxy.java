package designpattern.proxy.statics;

public class OrderServiceProxy {

	private OrderService orderService;

	public OrderServiceProxy(OrderService orderService) {
		this.orderService = orderService;
	}

	public void pay() {
		before();
		orderService.pay();
		after();
	}

	private void before() {
		System.out.println("before pay");
	}

	private void after() {
		System.out.println("after pay");
	}
}
