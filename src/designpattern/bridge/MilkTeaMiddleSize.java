package designpattern.bridge;

public class MilkTeaMiddleSize extends MilkTea {

	public MilkTeaMiddleSize(Additable additable, SugarDegree sugarDegree) {
		super(additable, sugarDegree);
	}

	@Override
	public String getName() {
		return sugarDegree.degree() + "中杯奶茶加" + additable.name();
	}

}
