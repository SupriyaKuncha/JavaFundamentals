package OOPSconcepts;

public class DematAccount extends BankAccount{
	private int stockHoldings;
//	public DematAccount() {
//		super();
//		
//	}
	//constructor
	public DematAccount(String name, String AccNum, double balance, int stockHoldings) {
		super(name, AccNum, balance);
		this.stockHoldings = stockHoldings;
	}
	
	//buy stocks
	public void buyStocks(int quantity, double pricePerStock) {
		double totalCost = quantity * pricePerStock;
		if(getBalance()>=totalCost) {
			
			setBalance(getBalance()- totalCost);
			stockHoldings += quantity;
			
			
		}else {
			System.out.println("Insufficient balance to buy stocks");
		}
		
	}
	
	//sell stocks
	//check quantity > 0
	//quantity, earnings
	//add to balance
	// update quantity
	
	public  void sellStock(double numStocksToSell, double pricePerStock) {
		if(numStocksToSell>0) {
			double totalCost = numStocksToSell * pricePerStock;
			setBalance(getBalance() + totalCost);
			stockHoldings -= numStocksToSell;
			
		}else {
			System.out.println("Insufficient quantity");
		}
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Total stocks available : " + stockHoldings);
	}
	

}
