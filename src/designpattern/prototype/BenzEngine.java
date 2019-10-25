package designpattern.prototype;

import java.io.Serializable;

public class BenzEngine implements Cloneable, Serializable{

	private static final long serialVersionUID = 9110198007851757044L;

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("--------------BenzEngine clone----------------");
		return super.clone();
	}
}
