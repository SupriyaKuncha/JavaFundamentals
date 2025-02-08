
package JavaBasics;
import java.util.Scanner;
public class Conditionals {
	

	public static void main(String[] args) {
		// if else ladder
		double rating = 4.7;
		double salary=50000;
		if(rating>=1 && rating<=2) {
			System.out.println("No Increment");
			System.out.println(salary);
			
		}else if(rating>2 && rating<=3.5) {
			System.out.println("5% Increment");
			double salaryIncrement=salary*0.05;
			System.out.println(salaryIncrement+salary);
			
		}else if(rating>3.5 && rating<=4.5) {
			System.out.println("8% Increment");
			double salaryIncrement=salary*0.08;
			System.out.println(salaryIncrement+salary);
			
		}else if(rating>4.5 && rating<=5) {
			System.out.println("10% Increment");
			double salaryIncrement=salary*0.1;
			System.out.println(salaryIncrement+salary);
			
		}else {
			System.out.println("Invalid rating");
			
		}
		//switch case
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current salary: ");
		double currSalary = sc.nextDouble();
		System.out.println("Enter Rating: ");
		int rating1 = sc.nextInt();
		double hikePercentage = 0.0;
		switch(rating1) {
		case 5:
			hikePercentage = 0.20;
			break;
		case 4:
			hikePercentage = 0.15;
			break;
		case 3:
			hikePercentage = 0.10;
			break;
		case 2:
			hikePercentage = 0.05;
			break;
		case 1:
			hikePercentage = 0.0;
			break;
		default: 
			System.out.println("Invalid Rating");
			break;
			
		}
		double newSalary = currSalary + (currSalary*hikePercentage);
		System.out.println(newSalary);
		sc.close();

	}

}
