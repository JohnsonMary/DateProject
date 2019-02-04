package Practice_day42;

public class EtsyAccount {
	
	private String email;
	private String firstName;
	private String password;
	
	public String getEmail(){
		
		return email;
	}
	public void setEmail(String email) {
		
		this.email= email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName ) {
		
		this.firstName=firstName;
		
	}
	public String getPassword() {
		
		return password;
	}
	
	public void setPassword(String password) {
		if(password.length()<6) {
			
			System.out.println("Password should have at least 6 characters");
			return;
		}
        
		this.password=password;
		
	}
	public void setAccountInfo(String email,String firstName,String password) {
		
		
		this.email=email;
		this.firstName=firstName;
		setPassword(password);
		
	}
	public String getAccountInfo() {
		
		
		
		return firstName+"|"+email+"|"+password;
	}
	
    public EtsyAccount() {
		
		this.email="unknown";
		this.firstName="unknown";
		this.password="unknown";
		
		
	}
	public EtsyAccount (String email,String firstName,String password) {
		
		this.email=email;
		this.firstName=firstName;
		this.password=password;
		
		
		
		
		
	}
	
	
	
	
	
	

}
