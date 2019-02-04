package Repl.it;
import java.util.*;

public class PositiveOrNotPositive {
	 public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int size=scan.nextInt();
			
			int [] arr=new int [size];
			
			
			for(int i=0; i<arr.length;i++) {
				
				arr[i]=scan.nextInt();
				
			}

			plus_minus(arr);
			
			
			
			
			
		}

		public static void plus_minus (int [] arr) {
			int pcounter=0;
			int ncounter=0;
			int zcounter=0;
			
			for(int a:arr) {
				
		
		    if(a>0) {
		    	pcounter++;
		    }else if(a<0) {
		    	ncounter++;
		    	
		    }else {
		    	zcounter++;
		    } 	

	 }       System.out.println("positives:"+pcounter+","+"negatives:"+ncounter+","+"zeros:"+zcounter);
	     }
	}
