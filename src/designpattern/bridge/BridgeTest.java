package designpattern.bridge;

public class BridgeTest {

	public static void main(String[] args) {
		MilkTea milkTea = new MilkTeaBigSize(new AdditablePudding(), new SugarDegreeLittle());
		System.out.println(milkTea.getName());
	}

}
