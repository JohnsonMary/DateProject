package day58_Exceptions;

import java.util.ArrayList;
import java.util.List;

public class method {
	public static void main(String[] args) {
		
		System.out.println();

		List<BankAccount> accounts = new ArrayList<>();

		BankAccount s1 = new CheckingAccount(6467465, "Linda", 1000);
		BankAccount s2 = new CheckingAccount(567585, "Mary", 6700);
		BankAccount b1 = new SavingAccount(46464,"Visa",27266);
		BankAccount b2 = new SavingAccount(3737, "Mastercard", 983873);

		s1.withdraw(100);
		s2.withdraw(100);
		b1.withdraw(100);
		b2.withdraw(100);

	}

}


