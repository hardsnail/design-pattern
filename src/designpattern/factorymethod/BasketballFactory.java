package designpattern.factorymethod;

public class BasketballFactory implements AbstractBallFactory {

	@Override
	public Ball createBall() {
		return new Basketball();
	}

}
