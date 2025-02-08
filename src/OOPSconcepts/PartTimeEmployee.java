package OOPSconcepts;

public class PartTimeEmployee extends Employee {
	//sal --> hourly * ratePerhour
	private double noOfHours;
	private double hourlyRate;
	public PartTimeEmployee(String empName, int empId, String empDept, double noOfHours, double hourlyRate) {
		super(empName, empId, empDept);
		this.noOfHours = noOfHours;
		this.hourlyRate = hourlyRate;
	}
	public double getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(double noOfHours) {
		this.noOfHours = noOfHours;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	@Override
	double calSalary() {
		return noOfHours * hourlyRate;
	}
	@Override
	public boolean applyLeave(int days) {

			return false;
	}
	

}
