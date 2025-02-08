package OOPSconcepts;

public class FullTimeEmployeeI implements EmployeeInterface {

	private String  empName;
	private int empId;
	private String empDept;
	private double basicSalary;
	private double bonus;
	
	
	public FullTimeEmployeeI(String empName, int empId, String empDept, double basicSalary, double bonus) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.basicSalary = basicSalary;
		this.bonus = bonus;
	}

	@Override
	public void displayEmpDeatils() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Full Time Employee");
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Department: " + empDept);
		
		
	}

	@Override
	public double calSalary() {
		
		return basicSalary+bonus;
	}



}
