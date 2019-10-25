package designpattern.factorymethod;

public class PinpangBallFactory implements AbstractBallFactory {

	@Override
	public Ball createBall() {
		return new PinpangBall();
	}

}
