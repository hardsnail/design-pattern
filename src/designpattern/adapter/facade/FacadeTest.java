package designpattern.adapter.facade;

/**
 * 公司部门有很多，不同的业务需要找不同的部门，这样会给做业务的人带来麻烦<b>
 * Facade模式解决上面的问题，由BusinessFacade负责了解各个业务应该找谁，而具体需要做业务的人直接和BusinessFacade联系
 * 
 * @author Administrator
 *
 */
public class FacadeTest {

	public static void main(String[] args) {
		BusinessFacade businessFacade = new BusinessFacade();
		businessFacade.askForLeave();
	}

}
