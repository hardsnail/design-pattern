package designpattern.decorator;

/**
 * 抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 * 
 * @author Administrator
 *
 */
public class DrivableDecorator implements Drivable {

	public Drivable drivable;

	public DrivableDecorator(Drivable drivable) {
		this.drivable = drivable;
	}

	@Override
	public void drive() {
		drivable.drive();
	}

}
