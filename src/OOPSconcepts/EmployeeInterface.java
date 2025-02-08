package OOPSconcepts;

public interface EmployeeInterface {
	
	//by default abstract methods
	void displayEmpDeatils();
	double calSalary();

	
	//default
	default void OrganizationPolicy() {
		System.out.println("All employees should follow company policy. Work Time: 9-6");
	}
	//static
	static void CompanyTagLine() {
		System.out.println("Some tag line");
	}
}
