package designpattern.bridge;

public class MilkTeaLittleSize extends MilkTea {

	public MilkTeaLittleSize(Additable additable, SugarDegree sugarDegree) {
		super(additable, sugarDegree);
	}

	@Override
	public String getName() {
		return sugarDegree.degree() + "小杯奶茶加" + additable.name();
	}

}
