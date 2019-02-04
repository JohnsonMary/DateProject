package day13_StringManipulation;


public class Login {
	public static void main(String[] args) {
		
		
		
		String secretUserName="admin";
		String secretPassword="abc123";
		
		String userName="vdmin";
	    String password="Abc123";
		
		
		if(userName.equals(secretUserName) && password.equals(secretPassword)) {
			System.out.println("You logged in succesfully!");
			
		}else if(!userName.equals(secretUserName)&& password.equals(secretPassword)) {
		    	 System.out.println("ERROR:Invalid Username!");
		    	 
		}else if(!(password.equals(secretPassword))&& userName.equals(secretUserName)) {
		    	 System.out.println("ERROR:Invalid Password");
		    	 
		}else{
		    
		     System.out.println("ERROR:Invalid Username and password");

		}
		
		
		
		
		
	}

}
