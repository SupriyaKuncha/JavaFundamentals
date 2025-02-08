package OOPSconcepts;
import java.util.Scanner;
public class BankApplicationNew {
	
	
private static BankAccount[] accounts;

public static int totalAccounts = 0;
public static int maxAccounts = 5;



	public static void main(String[] args) {
		//array of objects
		Scanner scanner  = new Scanner(System.in);
		accounts = new BankAccount[5];
		
		while(true) {
			System.out.println("Bank Application Menu");
			System.out.println("Press 1: To create an account");
			System.out.println("Press 2: Display all accounts");
			System.out.println("Press 3: To Deposit money");
			System.out.println("Press 4: With Draw");
			System.out.println("Press 5: To Transfer");
			System.out.println("Press 6: To buy stocks");
			System.out.println("Press 7: To sell stocks");
			System.out.println("Press 8: To Exit");
			int choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1: 
				createAccount(scanner);
				break;
			case 2: 
				displayAllAccounts();
				break;
			case 3: 
				depositMoney(scanner);
				break;
			case 4: 
				withdrawMoney(scanner);
				break;
			case 5: 
				transferMoney(scanner);
				break;
			
			case 6:
				buyStocks(scanner);
				break;
			case 7:
				sellStocks(scanner);
				
			case 8: 
				System.out.println("Thank you, Exiting from system");
				scanner.close();
				break;
			default: 
				System.out.println("Invalid choice, choose from above menu");
			
			}
		}
		
		
	}
	public static void createAccount(Scanner scanner) {
		if(totalAccounts>=maxAccounts) {
			System.out.println("Cannot create accounts");
			return;
		}
		
		System.out.print("Enter Account Holder Name: ");
		String accountName = scanner.next();
		System.out.print("Enter Account Number: ");
		String accountNumber = scanner.next();
		System.out.print("Enter Initial balance: ");
		double accountBalance = scanner.nextDouble();	
	
		System.out.println("Type of account to create: ");
		System.out.println("1. Current Account");
		System.out.println("2. Savings Account");
		System.out.println("3. Premium Savings Account");
		System.out.println("4.  Demat Account");
		int option = scanner.nextInt();
		switch(option) {
		case 1: {
			accounts[totalAccounts]=new BankAccount(accountName,accountNumber,accountBalance);
			accounts[totalAccounts].displayDetails();
			break;
			
		}
		case 2: {
			System.out.println("Enter interest rate: ");
			double interestRate = scanner.nextDouble();
			accounts[totalAccounts]=new SavingsbankAccount(accountName,accountNumber,accountBalance,interestRate);
			accounts[totalAccounts].displayDetails();
			break;
			
		}
		case 3:{
			System.out.println("Enter Bonus interest rate: ");
			double bonusInterestRate = scanner.nextDouble();
			accounts[totalAccounts]=new PremiumSavingsAccount(accountName,accountNumber,accountBalance,bonusInterestRate);
			accounts[totalAccounts].displayDetails();
			break;
			
		}
		case 4: {
			System.out.print("Enter Stock holdings: ");
			int stockHoldings = scanner.nextInt();
			DematAccount demat = new DematAccount(accountName,accountNumber,accountBalance,stockHoldings);
			accounts[totalAccounts]=demat;
			accounts[totalAccounts].displayDetails();
			break;
			
		}
		default: 
			System.out.println("Invalid choice, choose again.");
			break;
		
		}
		System.out.println("Account created successfully.");
		totalAccounts++;		
}
	
	
	public static void displayAllAccounts() {
		if(totalAccounts==0) {
			System.out.println("No account to display");
			return;
		}
		System.out.println("######## Bank Account details ########");
		for(int i =0;i<totalAccounts;i++) {
			accounts[i].displayDetails();
			System.out.println("#################");
			
		}
	}
	
	public static void depositMoney(Scanner scanner) {
		System.out.print(" Enter account Number: ");
		String accNum= scanner.next();
		System.out.print("Enter the amount to be deposited: ");
		double amount = scanner.nextDouble();
		
		BankAccount account = findAccount(accNum);
		if(account!=null) {
			account.deposit(amount);
		}else {
			System.out.println("Account not found");
		}
	}
	
	
	public static BankAccount findAccount(String accountNumber) {
		for(int i = 0;i<totalAccounts;i++) {
			if(accounts[i].getAccountNumber().equals(accountNumber)) {
				return accounts[i];
			}
		}
		return null;
	}
	
	
	//case withDrawn
	//accNum-->how much amt to withdraw
	public static void withdrawMoney(Scanner scanner) {
		System.out.print("Enter the account Number: ");
		String accNum= scanner.next();
		System.out.print("Enter the amount to be withdrawn: ");
		double amount = scanner.nextDouble();
		BankAccount account = findAccount(accNum);
		if(account!=null) {
			account.withDraw(amount);
		}else {
			System.out.print("Account not found");
		}
		
	}
	
	//case 5
	//senders accNum--->receiver accNum, transfer amt
	public static void transferMoney(Scanner scanner) {
		System.out.print("Enter the senders account number: ");
		String accNum= scanner.next();
		System.out.print("Enter the target account number: ");
		String targetAccount = scanner.next();
		System.out.print("Enter the amount to be transfered: ");
		double amount = scanner.nextDouble();
		BankAccount senderAcc = findAccount(accNum);
		BankAccount recieverAcc = findAccount(targetAccount);
		
		
		if(senderAcc!=null && recieverAcc!=null) {
					senderAcc.withDraw(amount);
					recieverAcc.deposit(amount);
			
		}else {
			System.out.print("Account not found");
		}
		
	}
	
	public static void buyStocks(Scanner scanner) {
		System.out.print(" Enter account Number: ");
		String accNum= scanner.next();
		BankAccount account = findAccount(accNum);
		if(account!=null) {
	System.out.print("Enter how many stock to buy: ");
		int numStocksToBuy = scanner.nextInt();
		System.out.println();
		System.out.println("Enter the price of each stock: ");
		double 	pricePerStock = scanner.nextDouble();
		if(numStocksToBuy>0) {
			((DematAccount)account).buyStocks(numStocksToBuy,pricePerStock);	
			
		}else {
			System.out.println("Invalid number of stocks");
		}
		
		}else {
			System.out.println("Demat Account not found");
		}
		
		
		
	}
	public static void sellStocks(Scanner scanner) {
		System.out.print(" Enter account Number: ");
		String accNum= scanner.next();
		
		BankAccount account = findAccount(accNum);
		if(account!=null) {
	System.out.print("Enter how many stock to sell: ");
		double numStocksToSell = scanner.nextDouble();
		System.out.println();
		System.out.println("Enter the price of each stock: ");
		double 	pricePerStock = scanner.nextDouble();		
		if(numStocksToSell>0) {
           ((DematAccount)account).sellStock(numStocksToSell,pricePerStock);	
			
		}else {
			System.out.println("Invalid number of stocks");
		}
		
		}else {
			System.out.println("Demat Account not found");
		}
		
	}
	
	
}
