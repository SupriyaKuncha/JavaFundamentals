package EmployeeManagementSystem;

public class PayrollManager {
	public static void generatePayroll(Employee emp) {
		
		double salary = emp.calculateSalary();
		double tax = (emp instanceof Taxable) ? ((Taxable) emp).calculateTax(salary) :0.0;
		
		double netSalary = salary-tax;
		
		System.out.println("Payroll for : " + emp.getEmpName());
		System.out.println("Monthly Salary : " + salary);
		System.out.println("Tax Deduction : " + tax);
		System.out.println("Net Salary: " + netSalary);
	}

}
