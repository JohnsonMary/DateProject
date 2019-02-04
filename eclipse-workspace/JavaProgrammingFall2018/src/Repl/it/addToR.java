package Repl.it;
import java.util.*;

public class addToR {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("size?");
		int size=scan.nextInt();
		int n=scan.nextInt();
		
		int [] arr=new int[size];
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("Array "+i);
			arr[i]=scan.nextInt();
			
		}
		add_to_r(arr,n);
		
		
		
	}
	
	public static void add_to_r(int[] arr,int num) {
		
	int j=0;
	int [] nArr=new int [arr.length+1];
		
    for(int i=0; i<arr.length; i++) {
    	
    	nArr[j]=arr[i];
    	j++;
    	
    	
    }	nArr[nArr.length-1]	=num;
		
		System.out.println(Arrays.toString(nArr));
		
	}

}
