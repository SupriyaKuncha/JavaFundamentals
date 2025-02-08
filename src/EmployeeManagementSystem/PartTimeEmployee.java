package EmployeeManagementSystem;

public class PartTimeEmployee extends Employee implements WorkHours{
	
	private int hours;
	private double salPerHour;
	


	public PartTimeEmployee(String empName, int empId, String department,int hours, double salPerHour) {
		super(empName, empId, department);
		this.hours = hours;
		this.salPerHour = salPerHour;
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
	public int getWorkHours() {
		
		return hours;
	}
	@Override
	double calculateSalary() {
		
		return salPerHour * hours ;
	}
	@Override
	String getEmployeementType() {
		// TODO Auto-generated method stub
		return "Part time employee" ;
	}
	@Override
	void provideBenfits() {
		System.out.println("No benifits provided");
	}

	
	

}
