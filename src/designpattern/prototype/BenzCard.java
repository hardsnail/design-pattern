package designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BenzCard extends AbstractCard implements Cloneable, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6910554769990413147L;

	private Wheel wheel;
	
	private BenzEngine benzEngine;

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public BenzEngine getBenzEngine() {
		return benzEngine;
	}

	public void setBenzEngine(BenzEngine benzEngine) {
		this.benzEngine = benzEngine;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("--------------BenzCard clone----------------");
		return super.clone();
	}
	
	public BenzCard depthClone() throws IOException, ClassNotFoundException {
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(this);
		
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
		Object object = ois.readObject();
		return (BenzCard) object;
	}
}
