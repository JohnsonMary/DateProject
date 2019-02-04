package practice_day58;

public abstract class BankAccount {
	
	private long cardNum;
	private String cardName;
	
	
	public BankAccount(long cardNum, String cardName) {
		super();
		this.cardNum = cardNum;
		this.cardName = cardName;
	}
	public long getCardNum() {
		return cardNum;
	}
	public void setCardNum(long cardNum) {
		this.cardNum = cardNum;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	@Override
	public  String toString() {
		
		return "Card number: "+cardNum+", card name: "+cardName;
	}
	
	public abstract void deposit(int amount) ;
	
	public abstract void withdraw(int amount) throws RuntimeException;
	
	
    

}
