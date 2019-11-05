package designpattern.decorator;

/**
 * 具体构件（Concrete Component）角色：实现抽象构件，通过装饰角色为其添加一些职责。
 * 
 * @author Administrator
 *
 */
public class Car implements Drivable {

	@Override
	public void drive() {
		System.out.println("drive Card");
	}

}
