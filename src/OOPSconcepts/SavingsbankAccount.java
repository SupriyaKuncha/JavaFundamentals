package OOPSconcepts;

public class SavingsbankAccount extends BankAccount{
	private double interestRate;
	public SavingsbankAccount(String name, String AccNum, double balance) {
	super(name, AccNum, balance);
}
	public SavingsbankAccount(String name, String AccNum, double balance, double interestRate) {
		super(name, AccNum, balance);
		this.interestRate = interestRate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void displaySbAcct() {
		super.displayDetails();
	}

 
	@Override
	public void deposit(double... amounts) {
		double totalDeposit = 0.0;
		for(double amount : amounts) {
			if(amount > 0) {
				totalDeposit += amount;
			}else {
				System.out.println("Negative amount is not permissible");
			}
		}
		super.deposit(amounts);
		double interest = totalDeposit * interestRate/100;
		setBalance(getBalance()+ interest);
		System.out.println("Interest Added: " + interest);
		System.out.println("Updated balace after Interest: " + getBalance());
}
		
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Interest rate is : " + interestRate);		
		System.out.println("---------------------------");
		
	}


}

