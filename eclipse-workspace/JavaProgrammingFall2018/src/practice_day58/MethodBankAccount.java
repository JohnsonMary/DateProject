package practice_day58;

public class MethodBankAccount {
	
	public static void main(String[] args) throws RuntimeException{
		
		
		BankAccount a1 = new SavingAccount(373663, "Visa", 100) ;
		BankAccount a2 = new CheckingAccount(73636, "MasterCard", 600);
		a1.withdraw(300);
		a2.withdraw(700);
		
		a1.setCardName("Amex");
		a2.deposit(300);
		
		

		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
	
		
	}

}
