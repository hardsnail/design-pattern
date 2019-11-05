package designpattern.flyweight;

/**
 * 有一个在线系统，为全国各地的用户提供网站查询服务，服务器先从数据库中读取相关网站的信息，然后创建该网站的对象。<br>
 * 这样就会造成相同的用户或者不同的用户访问相同的网站时，会创建多个该网站的对象。为了解决该问题，采用享元模。<br>
 * 
 * 
 * @author Administrator
 *
 */
public class FlyweightTest {

	public static void main(String[] args) {
		VisitableFactory visitableFactory = new VisitableFactory();
		Visitable v1 = visitableFactory.getVisitable("58同城网站");
		Visitable v2 = visitableFactory.getVisitable("51Job网站");
		Visitable v3 = visitableFactory.getVisitable("51Job网站");
		Visitable v4 = visitableFactory.getVisitable("51Job网站");
		System.out.println();
		v1.visit(new User("张三"));
		v2.visit(new User("李四"));
		v3.visit(new User("王五"));
		v4.visit(new User("赵六"));
	}

}
