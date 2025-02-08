package EmployeeManagementSystem;

public class ManagerEmployee extends FullTimeEmployee implements BonusProvider{
	

	public ManagerEmployee(String empName, int empId, String department, double baseSalary, int leaveBalance,
			double bonus) {
		super(empName, empId, department, baseSalary, leaveBalance, bonus);
		
	}

	@Override
	public double calulateBonus(double salary) {
		
		return salary*Bonus_Percentage;
	}
	@Override
	double calculateSalary() {
		return baseSalary + calulateBonus(baseSalary)+bonus;
	}

}
