package OOPSconcepts;

public class EmployeeMgmtApp {

	public static void main(String[] args) {
		FullTimeEmployeeI objf = new FullTimeEmployeeI("Ramnath", 345, "AI", 60000, 2000);
		objf.OrganizationPolicy();
		EmployeeInterface.CompanyTagLine();
		System.out.println("-----------------------------------------");
		FullTimeEmployee emp1 = new FullTimeEmployee("Supriya", 1234, "IT", 50000, 1000, 5);
		emp1.displayEmpDetails();
		System.out.println("Monthly salary is: "+ emp1.calSalary());
		if(emp1.applyLeave(5)) {
			System.out.println("Approved");
		}else {
			System.out.println("Not approved");
		}
		System.out.println("-----------------------------------------");
		PartTimeEmployee emp2 = new PartTimeEmployee("Alice", 17898, "UI/UX",48,1000);
		emp2.displayEmpDetails();
		System.out.println("Salary for part time employee for is : " + emp2.calSalary());
		if(emp2.applyLeave(5)) {
			System.out.println("Approved");
		}else {
			System.out.println("Not approved");
		}
		System.out.println("-----------------------------------------");
		Intern emp3 = new Intern("Brad", 17236, "UI/UX",30000,2);
		emp3.displayEmpDetails();
		System.out.println("Stipend for Intern is : " + emp3.calSalary());
		if(emp3.applyLeave(5)) {
			System.out.println("Approved");
		}else {
			System.out.println("Not approved");
		}
		
		System.out.println("-------- Interface -------");
		FullTimeEmployeeI emp4 = new FullTimeEmployeeI("Ram", 345, "AI", 60000, 2000);
		emp4.displayEmpDeatils();
		System.out.println("salary is: " + emp4.calSalary());
		emp4.OrganizationPolicy();
		System.out.println("------------------------------");
		PartTimeEmployeeI emp5 = new PartTimeEmployeeI("bala", 123, "ML", 70, 3000);
		emp5.displayEmpDeatils();
		System.out.println("salary is: " + emp5.calSalary());
		emp5.OrganizationPolicy();
		System.out.println("------------------------------");
		InternI emp6 = new InternI("Raj", 6757,"Marketing",50000);
		emp6.displayEmpDeatils();
		System.out.println("salary is: " + emp6.calSalary());
		emp6.OrganizationPolicy();
		System.out.println("------------------------------");
		

		
		

	}

}
