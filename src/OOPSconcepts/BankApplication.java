package OOPSconcepts;
import java.util.Scanner;
public class BankApplication {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter your Name: ");
//		String name = sc.next();
//		System.out.print("Enter your Account Number: ");
//		String AccNum = sc.next();
//		System.out.print("Enter your balance: ");
//		double bal = sc.nextDouble();	
		
//		/////////////////////////////////////////
//		BankAccount account1 = new BankAccount(name, AccNum, bal);
//		account1.displayDetails();
//		account1.checkBalance();
//		account1.deposit(5000);
//		account1.checkBalance();
//		account1.withDraw(3000);
//		System.out.println("-------------------");
//		SavingsbankAccount account2 = new SavingsbankAccount("Alice", "HDFC6744775", 10000, 10);	
//		account2.displayDetails();
//		account2.checkBalance();
//		account2.deposit(5000);
//		account2.checkBalance();
////		account2.withDraw(3000);
//		System.out.println("--------------------");
//		BankAccount account3 = new SavingsbankAccount("Brad", "HDFC243667",10000,10);
//		account3.displayDetails();
//		account3.deposit(-10000);
//		account3.checkBalance();
//		((SavingsbankAccount)account3).setInterestRate(5);
//		System.out.println("------------Type casting----------------------");
//		account3.displayDetails();
//		account3.deposit(-10000);
//		account3.checkBalance();
//		/////////////////////////////////////////
//		//Transfer
//		System.out.println("-----------Transfer-------------");
//		BankAccount p1 = new BankAccount("Sender", "HDFC174768775", 50000);
//		BankAccount p2 = new BankAccount("Receiver", "HDFC2356586", 80000);
//		p1.transfer(200000, p2);
//		System.out.println("----------Details of p1 after transfer--------");
//		p1.displayDetails();
//		p1.checkBalance();
//		System.out.println("----------Details of p2 after transfer--------");
//		p2.displayDetails();
//		p2.checkBalance();
//		
//		/////SAVINGS ACCOUNT
//		BankAccount p3 = new SavingsbankAccount("Receiver", "HDFC564356", 20000, 5);
//		
//		System.out.println("----------Details of p3 after transfer--------");
//		p1.transfer(10000, p3);
//		p3.displayDetails();
//		p3.checkBalance();
//		
		//buy stock
		
		DematAccount account2 = new DematAccount("supriya", "HDFC12345", 20000, 5);
		account2.buyStocks(3,150);
		account2.sellStock(2,100);
		account2.displayDetails();
		
		
//		
//		sc.close();
		
		
		
		

	}

}
