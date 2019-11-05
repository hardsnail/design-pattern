package designpattern.bridge;

/**
 * Additable是对可添加对象的抽象，Additable可以是奶油、布丁<br>
 * SugarDegree是对甜度的抽象，SugarDegree可以是少糖、中度糖、很多糖<br>
 * MilkTea是按照规则区分的奶茶，并且可以添加Additable，选择SugarDegree<br>
 * Bridge模式用于对象可以根据多个维度划分，每个维度分别进行抽象和实现。再选择一个主维度进行抽象，并各个维度的抽象组合起来使用，这样，主维度的抽象依赖的是其它维度的抽象
 * 
 * @author Administrator
 *
 */
public class BridgeTest {

	public static void main(String[] args) {
		MilkTea milkTea = new MilkTeaBigSize(new AdditablePudding(), new SugarDegreeLittle());
		System.out.println(milkTea.getName());
	}

}
