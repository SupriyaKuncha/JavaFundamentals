package EmployeeManagementSystem;

abstract class Employee implements Person{
	protected String  empName;
	protected int empId;
	protected String department;
	protected double baseSalary;
	protected int leaveBalance;
	//fulltime
	public Employee(String empName, int empId, String department, double baseSalary, int leaveBalance) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.department = department;
		this.baseSalary = baseSalary;
		this.leaveBalance = leaveBalance;
	}
	//parttime
	public Employee(String empName, int empId, String department) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.department = department;

	}
	
	//intern
	public Employee(String empName, int empId, String department, int leaveBalance) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.department = department;
		this.leaveBalance = leaveBalance;
	}
	
	//getter and setter
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public int getLeaveBalance() {
		return leaveBalance;
	}


	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}

	
	//abstract methods
	abstract double calculateSalary();
	abstract String getEmployeementType();
	abstract void provideBenfits();
	
	//LeaveManagement
	public boolean requestLeaves(int days) {
		if(days<=leaveBalance) {
			leaveBalance-=days;
			System.out.println("Leave approved!");
			return true;
		}else {
			System.out.println("Leave not approved!");
			return false;
			
		}
	}
	
	@Override
	public void displayInfo() {
		
		System.out.println("-------------------------");
		System.out.println("Employee name: " + empName +"\n"+ "Employee Id: " + empId +"\n"+ "Employee department: " + department);
		System.out.println("Employee type: " + getEmployeementType());
		System.out.println("Monthly salary: " + calculateSalary());
		System.out.println("Leave Balance: " + leaveBalance);
		provideBenfits();
		
	}

}
