package Practice4;

public class Login2 {
	public static void main(String[] args) {
		
		String secretUserName="admin";
		String secretPassword="bc123";
		
		String userName="admin";
		String password="abc123";
		
		if(!secretUserName.equals(userName)&& !secretPassword.equals(password)) {
			System.out.println("Invalid username and password");
			
  }else if(!secretUserName.equals(userName)) {
	        System.out.println("Invalid username");
			
  }else if(!secretPassword.equals(password)) {
	        System.out.println("Invalid password");
	        	
  }else if(secretUserName.equals(userName)&& secretPassword.equals(password)){
	        System.out.println("You logged in successfully!");
  }
		
		
		
		
		
		
		
		
	}

}
