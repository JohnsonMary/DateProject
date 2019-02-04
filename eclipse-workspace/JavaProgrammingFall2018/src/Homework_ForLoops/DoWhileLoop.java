package Homework_ForLoops;
import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		
		int n=-100;
		
		do {
			System.out.print(n+" ");
			n++;
			
		}while(n<=100);
		
		System.out.println("--Question 8--");
		
		Scanner scan=new Scanner(System.in);
		String str="";
	    
		do {
			System.out.println("Write something");
		    str=scan.nextLine();
		    
		    if(str.equals("exit")) {
				break;
					
				}	
			System.out.println("You wrote "+str);
			
			
		}while(!str.equals("exit"));
		
		System.out.println("--Question 9--");
		
		int treeSize=0;
		int yearGrowth=0;
	
		 for(int year=1; year<=10; year++) {
			
			if(year>=1 && year<=3) {
				yearGrowth=1;
				treeSize=year;
					
			}else if(year>=4 && year<=10) {
				yearGrowth=2;
				if(year==4) {
				treeSize=5;
					
			}else if(year==5) {
				treeSize=7;
				
			}else if(year==6) {
				treeSize=9;
				
			}else if(year==7) {
				treeSize=11;
				
			}else if(year==8) {
				treeSize=13;
				
			}else if(year==9) {
				treeSize=15;
				
			}else if(year==10) {
				treeSize=17;
				
			}
				
			}System.out.println("Year "+year+" growth "+yearGrowth+" cm.");
			System.out.println("Tree size: "+treeSize+" cm.");
			
			
		 }			
				
			System.out.println("--Question 10--");
			
			  
	
		
		}	
		
	}


