package designpattern.decorator;

/**
 * Drivable是对可驾驶对象的抽象，实现类包含Car和Tank<br>
 * Drivable在drive结束之后，有可能需要进行清洗，也有可能需要加油，也可能需要进行其它操作<br>
 * DrivableDecorator就是对可驾驶对象的抽象装饰，清洗和加油分别实现具体的装饰
 * 
 */
public class DecoratorTest {

	public static void main(String[] args) {
		DrivableCleanDecorator decorator = new DrivableCleanDecorator(new Tank());
		decorator.drive();
	}

}
