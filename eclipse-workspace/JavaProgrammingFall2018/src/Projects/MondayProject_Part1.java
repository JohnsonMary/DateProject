package Projects;

public class MondayProject_Part1 {
	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++) {
			
			System.out.print(i+" ");
			
				
			}
			
		System.out.println("--Question 1--"); 
		
		for(int k=1; k<=20; k++) {
			
			if(k%2==0) {
				System.out.print(k+" ");
				
			}
		}System.out.println("--Question 2--");

		int t=1;
		while(t<=20) {
			
			if(t%3==0) {
				
				System.out.print(t+" ");
				
			}t++;

		}System.out.println("--Question 3--");
		
		for(int n=1; n<=20; n++) {
			int n1=n*n;
			
			if(n%2==1) {
				System.out.print(n1+" ");
				
			}
			
		}System.out.println("--Question 4--");
		
		for(int s=1; s<20; s++) {
			
			
			System.out.print(s+" + ");
			
		}System.out.println(20);
		
		
		System.out.println("--Question 5--");
		
		
		int sum=0;
		for(int m=1; m<=20; m++) {
			sum=sum+m;
			
		}System.out.print(sum);
		System.out.println("--Question 6--");
		
		
		int total=0;
		for(int h=1; h<=20; h++) {
			
			if(h%2==0) {
				total=total+h;
				
			}
			
		}System.out.print(total);
		 System.out.println("--Question 7--");
		 
		 int sum1=0;
		 for(int num=1; num<=19; num++) {
			 
			 if(num%2==1) {
				 sum1=sum1+num;
				 System.out.print(sum1+" ");
				 
			 }
			 
		 }
     
		
		
	}

}
