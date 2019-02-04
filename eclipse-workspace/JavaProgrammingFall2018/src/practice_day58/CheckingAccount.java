package practice_day58;

public class CheckingAccount extends BankAccount{
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

	public CheckingAccount(long cardNum, String cardName, int balance) {
		
		super(cardNum, cardName);
		this.balance = balance;
	}
	
	@Override 
	public String toString() {
		
		return "[ Card number: "+getCardNum()+" | Card name: "+getCardName()+" | Balance: "+getBalance()+"]";
	}
	
	@Override
    public void deposit(int amount) {
		
		this.balance+=amount;
		
			
	}
	
	@Override
	public  void withdraw(int amount) throws RuntimeException{
		
		this.balance -= amount;
		
		if(balance<0) {
			
			throw new RuntimeException("Your balance is about to below zero");
		}

	}
	
	
	

}
