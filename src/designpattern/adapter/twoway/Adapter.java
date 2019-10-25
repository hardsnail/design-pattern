package designpattern.adapter.twoway;

public class Adapter implements Adaptee, Target {

	private Adaptee adaptee;

	private Target target;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public Adapter(Target target) {
		this.target = target;
	}

	@Override
	public void request() {
		target.request();
	}

	@Override
	public void specificRequest() {
		adaptee.specificRequest();
	}

}
