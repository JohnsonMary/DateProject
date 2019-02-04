package Pratice7;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please write a word");
		String w=scan.nextLine();
		
		String w1=w.substring(0,1).toUpperCase();
		String w2=w.substring(1).toLowerCase();
		
		System.out.println(w1+w2);
		
		
		
		for(int i = 0; i < 20; i++){
			if(i % 2 == 0){
					System.out.println(i*2);
					}
				}
		System.out.println();
		int mysteryInt = 100;
		for(int i = 5; i > 0;i-- ){
			mysteryInt -= i;
			System.out.println(mysteryInt);
	}
		System.out.println();
		
		for(int i = 20; i > 0 ; i-- ){
			if(i % 2 == 0){
					System.out.println(i);
			}


		
		}	
		System.out.println();
		for(int i = 5; i > 0;i-- ){
			int mys = 100;
			mys -= i;
		System.out.println(mys);
		}
		System.out.println();
		int mystery = 1;
		int counter=1;
		while(mystery <  3 ) {
				mystery = mystery* counter;
				counter++;
				}
		System.out.println(mystery);
		
		
		
		
		
	}

}
