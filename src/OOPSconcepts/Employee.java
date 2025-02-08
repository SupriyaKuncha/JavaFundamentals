package OOPSconcepts;

abstract class Employee {
	
	//data members
	
	private String  empName;
	private int empId;
	private String empDept;
	public Employee(String empName, int empId, String empDept) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
	}
	
	//concrete method
	public void displayEmpDetails() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Department: " + empDept);
		
	}
	//abstract method
	abstract double calSalary();
	public abstract boolean applyLeave(int days); //true-->approved
	
	

}
