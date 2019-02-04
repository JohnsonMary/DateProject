package day10_Conditionals4;

public class TernaryOperator {
	public static void main(String[] args) {
		
		int score=50;
				
		String status;
		
		if(score>=60) {
			status="pass";
			
		}else { 
			status="Fail";
		}System.out.println(status);
		
	


///

     status=(score>=60)?"pass":"fail";
     System.out.println(status);
   
     boolean express=true;
     int shipping;
     
     System.out.println((express)?25:15);
      shipping=(express) ? 25:15;  
      
      System.out.println(shipping);
      
   
   
   
   
   
   
   
   
	}      	
	
	
}