package designpattern.bridge;

/**
 * MilkTea是对奶茶的抽象，按照规格区分，已知的规则包含大杯、中杯、小杯<br>
 * MilkTea可以添加Additable，也可以选择SugarDegree
 *
 */
public abstract class MilkTea {

	protected Additable additable;

	protected SugarDegree sugarDegree;

	public MilkTea(Additable additable, SugarDegree sugarDegree) {
		this.additable = additable;
		this.sugarDegree = sugarDegree;
	}

	public abstract String getName();

}
