package HomeWork;

public class SplitMethod {
	public static void main(String[] args) {
	
		
		
		String email="info@cybertekschool.com";
        int counter=0;
		int idxi=email.indexOf("@");
		int idxk=email.indexOf("@");
		String []splittedEmail=email.split("@");
		
		
       for(int i=0;i<email.length();i++) {
			
			for(int k=0; k<email.length();k++) {
				
				
				if(email.charAt(i)==email.charAt(k)&& i!=k) {
					if(email.charAt(i)=='@'&& counter==0) {
						counter++;
						
						System.out.println("Invalid email");	
						
			   }
					
				}
				
			} 
				
				   
		   }if(!(email.contains("@"))) {
				System.out.println("Invalid email");
				
			    
       
			
		   } else if(idxi==idxk && counter==0) {
				System.out.println("Email id: "+splittedEmail[0]);
				System.out.println("Email domain: "+splittedEmail[1]);
    

		
		
		
	
		
	
	}
	}
}	

