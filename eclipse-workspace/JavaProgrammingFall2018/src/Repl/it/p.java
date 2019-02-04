package Repl.it;
import java.util.Scanner;

public class p {
	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    System.out.println("How many");
		    int size = inp.nextInt();
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++)
		    {
		    	System.out.println("numbers");
		        arr[i]=inp.nextInt();
		    }
		    
		    plus_minus(arr);
		  }
		public static void plus_minus(int[] arr) {
			int zeros=0;
			int negatives=0;
			int positives=0;
			for(int i=0 ;i<=arr.length-1;i++){
		    	if(arr[i]>0) {
		    		positives++;
		
		    	}else if(arr[i]<0) {
		    		negatives++;

		    	}else if(arr[i]==0) {
		    		zeros++;
		    		
		    	}
		    }
			System.out.println("positives:"+positives+", "+
		    			"negatives:"+negatives+", "+"zeros:"+zeros);
		}
	}

