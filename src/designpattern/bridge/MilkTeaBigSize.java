package designpattern.bridge;

public class MilkTeaBigSize extends MilkTea {

	public MilkTeaBigSize(Additable additable, SugarDegree sugarDegree) {
		super(additable, sugarDegree);
	}

	@Override
	public String getName() {
		return "大杯奶茶加" + sugarDegree.degree() + additable.name();
	}

}
