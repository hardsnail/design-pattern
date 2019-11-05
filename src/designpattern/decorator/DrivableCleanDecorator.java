package designpattern.decorator;

/**
 * 具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任<br>
 * 开完之后，需要对可以开的对象进行清洗
 * 
 * @author Administrator
 *
 */
public class DrivableCleanDecorator extends DrivableDecorator {

	public DrivableCleanDecorator(Drivable drivable) {
		super(drivable);
	}

	@Override
	public void drive() {
		super.drive();
		clean();
	}

	public void clean() {
		System.out.println("drivable 清洗干净");
	}
}
