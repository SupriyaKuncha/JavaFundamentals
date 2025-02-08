package EmployeeManagementSystem;
 
import java.util.Scanner;
 
public class EMSApplication {
 
    private static Employee[] employeeList;
    public static int totalEmployees = 0;
    public static int maxEmployees = 5;
 
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        employeeList = new Employee[5];
        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("Employee management ");
            System.out.println("Press 1: To create employee");
            System.out.println("Press 2: Display employees info");
            System.out.println("Press 3: To display payroll info");
            System.out.println("Press 4: Request leaves");
            System.out.println("Press 5: Exit");
            
          //try-catch block to handle exceptions
            try { 
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        createEmployee(scanner);
                        break;
                    case 2:
                        displayEmployee(scanner);
                        break;
                    case 3:
                        displayPayrollInfo(scanner);
                        break;
                    case 4:
                        requestLeaves(scanner);
                        break;
                    case 5:
                        System.out.println("Exiting");
                        
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input from the scanner
            } catch (EmployeeLimitException e) {
                System.out.println(e.getMessage());
            } catch (InvalidEmployeeTypeException e) {
                System.out.println(e.getMessage());
            }
        }
 
    }
 
    // Custom Exception 1: EmployeeLimitException
    public static class EmployeeLimitException extends Exception {
        public EmployeeLimitException(String message) {
            super(message);
        }
    }
 
    // Custom Exception 2: InvalidEmployeeTypeException
    public static class InvalidEmployeeTypeException extends Exception {
        public InvalidEmployeeTypeException(String message) {
            super(message);
        }
    }
 
 
 
    // create employee####################################################################################################
    public static void createEmployee(Scanner scanner) throws EmployeeLimitException, InvalidEmployeeTypeException {
        if (totalEmployees >= maxEmployees) {
            throw new EmployeeLimitException("Maximum employee limit reached. Cannot add more employees.");
        }
 
        System.out.println("Enter Employee Name: ");
        String empName = scanner.next();
        System.out.println("Enter Employee ID: ");
        int empId = scanner.nextInt();
        System.out.println("Enter Department: ");
        String department = scanner.next();
        System.out.println("Type of Employement: ");
        System.out.println("1. Full Time");
        System.out.println("2. Part Time");
        System.out.println("3. Intern");
        System.out.println("4. Manager");
        System.out.println("5. Exit");
        int option = scanner.nextInt();
        double baseSalary;
        int leaveBalance;
        double bonus;
        switch (option) {
            case 1:
                System.out.println("Enter base salary");
                baseSalary = scanner.nextDouble();
                System.out.println("Enter your Bonus: ");
                bonus = scanner.nextDouble();
                leaveBalance = 5;
 
                employeeList[totalEmployees] = new FullTimeEmployee(empName, empId, department, baseSalary, leaveBalance, bonus);
                employeeList[totalEmployees].displayInfo();
                break;
            case 2:
                System.out.println("Enter number of hours you will work: ");
                int hours = scanner.nextInt();
                System.out.println("Enter rate per hour: ");
                double salPerHour = scanner.nextDouble();
                employeeList[totalEmployees] = new PartTimeEmployee(empName, empId, department, hours, salPerHour);
                employeeList[totalEmployees].displayInfo();
                break;
            case 3:
                leaveBalance = 5;
                employeeList[totalEmployees] = new Intern(empName, empId, department, leaveBalance);
                employeeList[totalEmployees].displayInfo();
                break;
            case 4:
                System.out.println("Enter your base salary: ");
                baseSalary = scanner.nextDouble();
                leaveBalance = 5;
                System.out.println("Enter your Bonus: ");
                bonus = scanner.nextDouble();
                employeeList[totalEmployees] = new ManagerEmployee(empName, empId, department, baseSalary, leaveBalance, bonus);
                employeeList[totalEmployees].displayInfo();
                break;
            case 5:
                System.out.println("Exiting..");
                break;
            default:
                throw new InvalidEmployeeTypeException("Invalid employee type selected.");
        }
        System.out.println("Empployee added successfully.");
        totalEmployees++;
    }
  //FindEmployee#########################
  	public static Employee findEmployee(int empId) {
  		for(int i = 0;i<totalEmployees;i++) {
  			if(employeeList[i].getEmpId()==(empId)) {
  				return employeeList[i];
  			}
  		}
  		return null;
  	}
  	//DISPLAY #################################################################################################
  	public static void displayEmployee(Scanner scanner) {
  		if(totalEmployees==0) {
  			System.out.println("No employee created");
  			return;
  		}
  		System.out.println("######## Employee details ########");
  		for(int i =0;i<totalEmployees;i++) {
  			employeeList[i].displayInfo();
  			System.out.println("#################");
  		}
  	}
  	//Pay roll ######################################################################
  	public static void displayPayrollInfo(Scanner scanner) {
  		if(totalEmployees==0) {
  			System.out.println("No employees created to display");
  		}
  		System.out.println("----------------------");
  		for(int i=0;i<totalEmployees;i++) {
  			PayrollManager.generatePayroll(employeeList[i]);
  		}
  	}
  	//Request leaves#####################################################################
  	public static void requestLeaves(Scanner scanner) {
  		if(totalEmployees==0) {
  			System.out.println("no employees aviable to request leave");
  			return;
  		}
  		System.out.println("Enter the id:");
  		int id =scanner.nextInt();
  		System.out.println("Enter the leave days:");
  		int days =scanner.nextInt();
  		for(int i=0;i<totalEmployees;i++) {
  			if(employeeList[i].getEmpId()==id) {
  				employeeList[i].requestLeaves(days);
  				return;
  			}
  		}
  		System.out.println("Employee with id"+id+"not found:");

  	}

 
 
    
}
