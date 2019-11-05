package designpattern.flyweight;

public class Website implements Visitable {

	private String name;

	public Website(String name) {
		super();
		this.name = name;
	}

	@Override
	public void visit(User user) {
		System.out.println(user.getName() + "访问了" + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
