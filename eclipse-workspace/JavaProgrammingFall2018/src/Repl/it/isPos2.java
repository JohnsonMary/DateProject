package Repl.it;
import java.util.*;

public class isPos2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("size?");
		int size=scan.nextInt();
		
		int[] arr=new int[size];
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("Array "+i);
			arr[i]=scan.nextInt();
			
		}
		
		isPos(arr);
		
		
		
		
		
	}

	public static void  isPos(int [] array) {
		
		for(int a:array) {
			if(a>0) {
				System.out.println("positive");
				
			}else {
				System.out.println("not positive");
			}

			
		}

		
		
	}
}
