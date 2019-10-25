package designpattern.abstractfactory;

public class Client {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = new HairFactory();
		TV tv = abstractFactory.createTV();
		tv.play();
		AirCondition airCondition = abstractFactory.createAirCondition();
		airCondition.use();
	}
}
