package designpattern.adapter.twoway;

public class TargetRealize implements Target {

	@Override
	public void request() {
		System.out.println("TargetRealize request");
	}

}
