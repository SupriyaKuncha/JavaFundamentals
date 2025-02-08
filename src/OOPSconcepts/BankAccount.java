package OOPSconcepts;

public class BankAccount {
	String accountHoldeName;
	String accountNumber;
	double balance;

	//parameterized constructor
	public BankAccount(String name, String AccNum, double balance) {
		this.accountHoldeName = name;
		this.accountNumber = AccNum;
		this.balance = balance;
	}
	//.......................................................
	//getter and setter
	

	//Account holder name........................
	public String getAccountHoldeName() {
		return accountHoldeName;
	}
	public void setAccountHoldeName(String name) {
		this.accountHoldeName = name;
		
	}
	//Account number..............................
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String AccNum) {
		this.accountNumber = AccNum;
		
	}
	//balance.....................................
	public double balance() {
		return balance;
	}
	public void balance(double bal) {
		this.balance = bal;
		
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//.............................................
	//deposit
	public void deposit(double... amounts) {
		double totalDeposit = 0.0;
		for(double amount : amounts) {
			if(amount > 0) {
				totalDeposit += amount;
			}else {
				System.out.println("Negative amount is not permissible");
			}
		}
		balance += totalDeposit;
		System.out.println("Updated balance : " + balance);
		
	}
	
	
	//withdraw
	public void withDraw(double amount) {
		if(balance>=amount) {
		balance-=amount;
		System.out.println("Updated balance: " + balance);			
		}else {
			System.out.println("Insufficiant balance");
		}

		
	}
	//transfer
	public void transfer(double amount , BankAccount targetAccount) {
		if(amount<=0) {
			System.out.println("Amount cannot be negative or 0");
			
		}
		else if(amount>balance) {
			System.out.println("****Insufficent balance*******");
			
		}
		else {
		balance -=amount;
		targetAccount.deposit(amount);
		System.out.println("Transfered amount: " + amount + " to account " +targetAccount.getAccountNumber());			
		}

	}
	//buy
//	public void buyStocks(double quantity,  double pricePerStock) {
//		double totalCost = quantity * pricePerStock;
//		if(getBalance()>=totalCost) {
//			
//			setBalance(getBalance()- totalCost);
//			stockHoldings += quantity;
//			
//			
//		}else {
//			System.out.println("Insufficient balance to buy stocks");
//		}
//		
//	}
	//sell
	
	//check balance
	public void checkBalance() {
		
		System.out.println("Current balance for Account Number "+ accountNumber + " is " + balance);
		
	}
	public void displayDetails() {
		System.out.println("Account Holder name: " + accountHoldeName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Balace: " + balance);
		System.out.println("................................");
	}



	






	
}
