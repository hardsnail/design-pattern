package designpattern.adapter.clazz;

public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.specificRequest();
	}

}
