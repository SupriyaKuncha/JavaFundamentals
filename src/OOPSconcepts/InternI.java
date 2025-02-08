package OOPSconcepts;

public class InternI implements EmployeeInterface {
	private String  empName;
	private int empId;
	private String empDept;
	private double stipend;
	public InternI(String empName, int empId, String empDept, double stipend) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.stipend = stipend;
	}


	@Override
	public void displayEmpDeatils() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Intern");
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Department: " + empDept);	
	}
	@Override
	public double calSalary() {
		
		return stipend;
	}
	

}
