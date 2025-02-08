package JavaBasics;
import java.util.Scanner;
public class AssignmentDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
        // Input number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
 
        // Declare arrays to store employee details
        String[] names = new String[numEmployees];
        String[] addresses = new String[numEmployees];
        double[] salaries = new double[numEmployees];
        double[] totalSalaries = new double[numEmployees];
 
        // Input employee details
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
 
            System.out.print("Enter address of employee " + (i + 1) + ": ");
            addresses[i] = scanner.nextLine();
 
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salaries[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
 
            totalSalaries[i] = salaries[i] * 3; // Total salary for 3 months
        }
 
        // Display employee records in tabular format
        System.out.println("\nEmployee Records:");
        System.out.printf("%-15s %-20s %-20s %-15s\n", "Name", "Address", "Salary", "Total (To be paid)");
 
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("%-15s %-20s %-20.2f %-15.2f\n", names[i], addresses[i], salaries[i], totalSalaries[i]);
        }
 
        scanner.close();
	}

}
