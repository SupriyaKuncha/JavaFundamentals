package OOPSconcepts;

public class PremiumSavingsAccount extends SavingsbankAccount{
	
	private double bonusInterest;
	
	public PremiumSavingsAccount(String name, String AccNum, double balance, double bonusInterest) {
		super(name, AccNum, balance);
		this.bonusInterest = bonusInterest;
	}

	public double getBonusInterest() {
		return bonusInterest;
	}

	public void setBonusInterest(double bonusInterest) {
		this.bonusInterest = bonusInterest;
	}
	
	//@Override
	public void deposit(double amount) {
		if (amount > 0) {
			super.deposit(amount);
			double extraBonus = (amount * bonusInterest) / 100;
			double balance = super.getBalance();
			balance += extraBonus;
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}
	@Override
	public void deposit(double... amounts) {
		double totaldeposit = 0.0;
		for (double amount : amounts) {
			if (amount > 0) {
				totaldeposit += amount;
			} else {
				System.out.println("Negative number is not permissiable" + amount);
			}
		}
		if (totaldeposit > 0) {
			super.deposit(totaldeposit);
			double bonusOnTotal = (totaldeposit * bonusInterest) / 100;
			double bal = super.getBalance();
			bal += bonusOnTotal;
			System.out.println("Bonus interset of " + bonusOnTotal + "added on total deposit");
		} else {
			System.out.println(" No valid deposit amounts");
		}
	}

	//@Override
	public void display() {
		super.displayDetails();
		System.out.println("Bonus interset rate:" + bonusInterest + "%");
	}

	

}
