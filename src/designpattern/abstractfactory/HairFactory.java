package designpattern.abstractfactory;

public class HairFactory implements AbstractFactory {

	@Override
	public TV createTV() {
		return new TCLTV();
	}

	@Override
	public AirCondition createAirCondition() {
		return new TCLAirCondition();
	}

}
