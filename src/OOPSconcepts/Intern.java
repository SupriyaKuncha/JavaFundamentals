package OOPSconcepts;

public class Intern extends Employee{
	private double stipend;
	private int leaveDays;

	public Intern(String empName, int empId, String empDept, double stipend, int leaveDays) {
		super(empName, empId, empDept);
		this.stipend = stipend;
		this.leaveDays = leaveDays;
		
	}

	public double getStipend() {
		return stipend;
	}

	public void setStipend(double stipend) {
		this.stipend = stipend;
	}

	@Override
	double calSalary() {
		
		return stipend;
	}

	@Override
	public boolean applyLeave(int days) {
		int maxLeaveDays = 3;
		if(days<=maxLeaveDays) {
			maxLeaveDays = maxLeaveDays-days;
			return true;
			
		}else {
			return false;
		}
	}
	

}
