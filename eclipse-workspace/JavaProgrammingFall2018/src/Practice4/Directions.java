package Practice4;
import java.util.Scanner;

public class Directions {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Starting point?");
		char start=scan.next().charAt(0);
		System.out.println("Ending point?");
		char end=scan.next().charAt(0);
		
		
		if (!(start>='A'&& start<='D')&&(end>='A' && end<='D')) {
			System.out.println("Invalid start and end");
			
		}else if(start==end) {
			System.out.println("Already there");
			
		}else if(start=='A' ) {
			  if(end=='B') {
				  System.out.println("Turn right");
				  
			 }else if(end=='C') {
				 System.out.println("Turn right,down");
				 
			 }else if(end=='D') {
				 System.out.println("Turn right,down,left");
				 
			 }
			
		}else if(start=='B') {
			  if(end=='A') {
				  System.out.println("Go down,turn left,go up");
				  
			  }else if(end=='C') {
				  System.out.println("Go down");
				  
			  }else if(end=='D') {
				  System.out.println("Go down,turn left");
				  
			  }
			
		}else if(start=='C') {
			  if(end=='A') {
				  System.out.println("Go left,up");
				  
			  }else if(end=='B') {
				  System.out.println("Go left,up,turn right");
				  
			  }else if(end=='D') {
				  System.out.println("Go left");
				  
			  }
			
		}else if(start=='D') {
			   if(end=='A') {
				   System.out.println("Go up");
				   
			   }else if(end=='B') {
				   System.out.println("Go up'turn right");
				   
			   }else if(end=='C') {
				   System.out.println("Go left");
				   
			   }
			
		}
		
		
		
		
		
		
	}

}
