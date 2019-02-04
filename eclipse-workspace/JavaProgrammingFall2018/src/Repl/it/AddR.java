package Repl.it;
import java.util.*;

public class AddR {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt(),n = inp.nextInt();
	    int[] arr = new int[size];
	    
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
		
		
		add_to_arr(arr,n);
		
	}
 
	public static void add_to_arr(int[] r,int n) {
		
		int [] new_r=Arrays.copyOf(r, r.length);
	    System.out.print("[");
		for(int i=0;i<new_r.length-1;i++) {
			
			System.out.print(new_r[i]+", ");
			
		}System.out.print(new_r[new_r.length-1]);
		System.out.print(", "+n+"]");

		

		
		
	}
}
