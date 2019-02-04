package Practice_day42;

public class EtsyRegistrationPage {
	public static void main(String[] args) {
		
		EtsyAccount register1=new EtsyAccount();
		
	    register1.setEmail("jack@gmail.com");
	    register1.setFirstName("Jack");
	    register1.setPassword("a12345");
	    
	    System.out.println(register1.getEmail());
	    
	    EtsyAccount register2=new EtsyAccount();
	    
	    register2.setEmail("mary@gmail.com");
	    register2.setFirstName("Mary");
	    register2.setPassword("12345s");
	    
	    EtsyAccount register3=new EtsyAccount();
	    
	    register3.setEmail("naomi@hotmail.com");
	    register3.setFirstName("Naomi");
	    register3.setPassword("123456");
	    
	    System.out.println(register3.getFirstName()+"'s email: "+register3.getEmail());
	    System.out.println(register2.getFirstName()+"'s email: "+register2.getEmail());
		System.out.println(register1.getFirstName()+"'s password is: "+register1.getPassword());
		System.out.println(register1.getFirstName()+" | "+register1.getEmail()+" | "+register1.getPassword());
		System.out.println(register2.getFirstName()+" | "+register2.getEmail()+" | "+register2.getPassword());
		System.out.println(register3.getFirstName()+" | "+register3.getEmail()+" | "+register3.getPassword());

		
		EtsyAccount register4=new EtsyAccount();
		
		register4.setAccountInfo("abc@yahoo.com","William","123456");
		System.out.println(register4.getAccountInfo());
		
		System.out.println(register4.getEmail());
		System.out.println(register1.getEmail().replace("gmail","hotmail"));
		
		EtsyAccount register5=new EtsyAccount();
		register5.setAccountInfo("maria@gmail.com", "Maria", "sdhsjkaa");
		System.out.println(register5.getAccountInfo());
		
		EtsyAccount account1=new EtsyAccount("jason@hotmail.com","Jason","peydhs");
		System.out.println(account1.getEmail());
		System.out.println(account1.getFirstName());
		System.out.println(account1.getPassword());

		
		
		
	}

}
