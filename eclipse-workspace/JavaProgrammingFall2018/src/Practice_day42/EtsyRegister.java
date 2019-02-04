package Practice_day42;

public class EtsyRegister {
	public static void main(String[] args) {
		
		Etsy account1=new Etsy();
		
		account1.setEmail("John@hotmail.com");
		account1.setFirstName("John");
		account1.setPassword("ag3432");
		
		Etsy account2=new Etsy();
		
		account2.setEmail("Mariahotmail.com");
		account2.setFirstName("Maria");
		account2.setPassword("123456");
		
		
		System.out.println(account1.getFirstName()+"|"+account1.getEmail()+"|"+account1.getPassword());
		System.out.println(account2.getFirstName()+"|"+account2.getEmail()+"|"+account2.getPassword());

		Etsy account3=new Etsy();
		
		account3.setAccountInfo("Mary@gmail.com","Mary","123456");
		System.out.println(account3.getAccountInfo());
		
		Etsy account4=new Etsy("Kathy@hotmail.com","Kathy");
		System.out.println(account4.getEmail()+"|"+account4.getFirstName());
		
		
		
	}

}
