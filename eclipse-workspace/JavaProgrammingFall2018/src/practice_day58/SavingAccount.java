package practice_day58;

public class SavingAccount extends BankAccount {
	
	private int balance;
	private double penaltyPercentage;
	
	
	public SavingAccount(long cardNum, String cardName, int balance) {
		
		super(cardNum, cardName);
		this.balance = balance;
		
		if(balance<0) {
			throw new RuntimeException("Can not create saving account with zero balance");
			
		}
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getPenaltyPercentage() {
		return penaltyPercentage;
	}
	public void setPenaltyPercentage(double penaltyPercentage) {
		this.penaltyPercentage = penaltyPercentage;
	}
	
	@Override
	public void deposit(int amount) {

		this.balance = (int)(amount*1.1)+this.balance;
		
		
	}
	
	@Override
	public void withdraw(int amount) throws RuntimeException {
		
		this.balance =(int) (this.balance-(amount*1.1));
	
		
	}
	
	@Override
	public String toString() {
		
		return "[ Card number: "+getCardNum()+" | Card Name: "+getCardName()+" | Balance: "+
		                         getBalance()+"]";
	}
	
	
	
	

}
