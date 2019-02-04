package day19_Loops02;
import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scan.nextLine();
		char w2=word.charAt(0);
        String w1=word.substring(word.indexOf(w2),1).toUpperCase();

		
		
		System.out.println(w1+word.substring(1,word.length()));
		
		int num=1;
		while(num<=10) {
			System.out.print(num+" ");
			num++;
		}
		 System.out.println("Num value: "+num);
		
		int n=10;
		while(n>=1) {
			System.out.print(n+" ");
			n--;
			
		}
		
		
		
		
		
		
		
		
	}

}
