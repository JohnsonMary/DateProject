package day42_encapsulation02_constructors;

public class Etsy {
	
	private String firstName;
	private String email;
	private String password;
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		
		if(password.length()<6) {
			System.out.println("Password - Must be at least 6 characters");
			return;
		}
		this.password = password;
	}
	
	public  void setAccountInfo(String email,String firstName,String password) {
		
		this.email=email;
		this.firstName=firstName;
		this.password=password;
		
		System.out.println("Email: "+this.getEmail());
		System.out.println("FirstName: "+this.getFirstName());
		System.out.println("Password: "+this.getPassword());
		
	}
	public String getAccountInfo() {
		
		
		
		return (this.email+"|"+this.firstName+"|"+this.password);
		//return getEmail()+"|"+getFirstName()+"|"+getPassword();	
	
	}

	
	
	
	
	
	
}
