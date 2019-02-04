package day42_encapsulation02_constructors;

public class EtsyRegistrationPage {
	public static void main(String[] args) {
		
		Etsy account1=new Etsy();
		account1.setEmail("Jack@hotmail.com");
		account1.setFirstName("Jack");
		account1.setPassword("a12345");
		
		Etsy account2=new Etsy();
		account2.setEmail("Sandy@gmail.com");
		account2.setFirstName("Sandy");
		account2.setPassword("6abcde");
		
		
		System.out.println("Firstname -> "+account1.getFirstName());
		System.out.println("Email -> "+account1.getEmail());
		System.out.println("Password -> "+account1.getPassword());
		
		System.out.println("=========================");
		System.out.println("Firstname -> "+account2.getFirstName());
		System.out.println("Email -> "+account2.getEmail());
		System.out.println("Password -> "+account2.getPassword());
		
		
		Etsy myAccount=new Etsy();
		
		myAccount.setAccountInfo("aba@gmail.com", "Jack", "poeiue6");
		
		
		System.out.println(myAccount.getEmail()+"|"+myAccount.getFirstName()+"|"+myAccount.getPassword());
		
		myAccount.setEmail(myAccount.getEmail().replaceAll("gmail", "yahoo"));
		System.out.println(myAccount.getEmail()+"|"+myAccount.getFirstName()+"|"+myAccount.getPassword());

		System.out.println(myAccount.getAccountInfo());
		
		System.out.println("============================");
		
		Etsy yourAccount=new Etsy();
		
		yourAccount.setAccountInfo("youremail@hotmail.com","Apple","sgehey6");
		
		String accountInfo=yourAccount.getAccountInfo();
		System.out.println(accountInfo);
		
		
	}

}
