package designpattern.adapter.twoway;

public class AdapterTest {

	public static void main(String[] args) {
		Adaptee adaptee = new Adapter(new AdapteeRealize());
		adaptee.specificRequest();

		Target target = new Adapter(new TargetRealize());
		target.request();
	}
}
