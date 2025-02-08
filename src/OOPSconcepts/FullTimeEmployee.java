package OOPSconcepts;

public class FullTimeEmployee extends Employee {
	
	//sal --> basicSalary + bonus
	private double basicSalary;
	private double bonus;
	private int leaveDays;

	public FullTimeEmployee(String empName, int empId, String empDept, double basicsal, double bonus, int leaveDays) {
		super(empName, empId, empDept);
		this.basicSalary = basicsal;
		this.bonus = bonus;
		this.leaveDays = leaveDays;
		
		
	}
	//getter setter

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//calculate salary 
	@Override
	double calSalary() {
		
		return basicSalary+bonus;
	}
	@Override
	public boolean applyLeave(int days) {
		int maxLeaveDays = 5;
		if(days<=maxLeaveDays) {
			maxLeaveDays = maxLeaveDays-days;
			return true;
			
		}else {
			return false;
		}
		
		
	}

	

}
