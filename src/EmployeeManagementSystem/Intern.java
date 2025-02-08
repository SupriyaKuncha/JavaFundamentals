package EmployeeManagementSystem;


public class Intern extends Employee{
	private double stipend = 50000;
	
	public Intern(String empName, int empId, String department, int leaveBalance) {
		super(empName, empId, department, leaveBalance);
	}

	@Override
	public String getName() {
		
		return empName;
	}
	@Override
	public int getId() {
		
		return empId;
	}
	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return stipend;
	}

	@Override
	String getEmployeementType() {
		// TODO Auto-generated method stub
		return "Employee type: Intern";
	}

	@Override
	void provideBenfits() {
		System.out.println("No benifits");
		
	}


	

}
