package OOPSconcepts;

public class PartTimeEmployeeI implements EmployeeInterface{
	private String  empName;
	private int empId;
	private String empDept;
	private double noOfHours;
	private double hourlyRate;

	public PartTimeEmployeeI(String empName, int empId, String empDept, double noOfHours, double hourlyRate) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.noOfHours = noOfHours;
		this.hourlyRate = hourlyRate;
	}


	@Override
	public double calSalary() {
		return noOfHours * hourlyRate;
	}


	@Override
	public void displayEmpDeatils() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Part Time Employee");
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Department: " + empDept);
		

		
	}
	@Override
	public void OrganizationPolicy() {
		System.out.println("All employees should follow company policy. Work Time: Flexible");
	}

}
