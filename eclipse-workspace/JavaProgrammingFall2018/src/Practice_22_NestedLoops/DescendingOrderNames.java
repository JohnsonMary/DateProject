package Practice_22_NestedLoops;
import java.util.Scanner;

public class DescendingOrderNames {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		String name="";
		String str1="";
		String str2="";
		String str3="";
	
		
		for( int i =1; i <= 3; i++ ) {
			
			System.out.println("Enter name "+i+" please");
			name=scan.next();
			
			if(i==1) {
				str1=name;
					
			}else if(i==2) {
				str2=name;
				
			}else if(i==3) {
				str3=name;
				
			}
			
			for(int h = 1; h <= 3; h++) {
				  
			}
			
			for ( int n = 1; n <=name.length()-1; n++ ) {
				
			if(str1.charAt(n)> str2.charAt(n) && str1.charAt(n)> str3.charAt(n)) {
			     
				System.out.println(str1);
				
		    }else if(str2.charAt(n) > str1.charAt(n)&& str2.charAt(n)>str3.charAt(n)) {
				  
		    	System.out.println(str2);
			
		    }else if(str3.charAt(n) > str1.charAt(n)&& str3.charAt(n)>str2.charAt(n)) {
			
		    	System.out.println(str3);
			
			}
			}
			
			
		}System.out.println();
		
		
		
		
		
		
	}

}
