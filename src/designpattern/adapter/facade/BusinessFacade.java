package designpattern.adapter.facade;

public class BusinessFacade {

	FinanceDepartment financeDepartment = new FinanceDepartment();

	HrDepartment hrDepartment = new HrDepartment();

	public void reimburse() {
		financeDepartment.reimburse();
	}

	public void askForLeave() {
		hrDepartment.askForLeave();
	}
}
