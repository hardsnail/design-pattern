package designpattern.bridge;

public abstract class MilkTea {

	protected Additable additable;

	protected SugarDegree sugarDegree;

	public MilkTea(Additable additable, SugarDegree sugarDegree) {
		this.additable = additable;
		this.sugarDegree = sugarDegree;
	}

	public abstract String getName();

}
