package designpattern.factorymethod;

public class Client {

	private static String FACTORY_CLASS = "designpattern.factorymethod.PinpangBallFactory";

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> factoryClass = Class.forName(FACTORY_CLASS);
		AbstractBallFactory factory = (AbstractBallFactory) factoryClass.newInstance();
		Ball ball = factory.createBall();
		ball.play();
	}
}
