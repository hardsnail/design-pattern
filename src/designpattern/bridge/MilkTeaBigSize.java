package designpattern.bridge;

public class MilkTeaBigSize extends MilkTea {

	public MilkTeaBigSize(Additable additable, SugarDegree sugarDegree) {
		super(additable, sugarDegree);
	}

	@Override
	public String getName() {
		return sugarDegree.degree() + "大杯奶茶加" + additable.name();
	}

}
