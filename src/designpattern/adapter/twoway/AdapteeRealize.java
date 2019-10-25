package designpattern.adapter.twoway;

public class AdapteeRealize implements Adaptee {

	@Override
	public void specificRequest() {
		System.out.println("AdapteeRealize specificRequest");
	}

}
