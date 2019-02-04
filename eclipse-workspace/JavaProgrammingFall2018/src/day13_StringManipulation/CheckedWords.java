package day13_StringManipulation;
import java.util.Scanner;

public class CheckedWords {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the first name");
		String mom=scan.nextLine();
		System.out.println("Please enter the second name");
		String son=scan.nextLine();
		System.out.println("Please enter the third name");
		String d=scan.nextLine();
		
		
int name1=mom.length();
int name2=son.length();
int name3=d.length();

 if(name1==name2&&name2==name3) {
	 System.out.println("All words are same length");
	 
 }else if (((name1==name2)&& (name2!=name3))||((name1==name3) && (name3!=name2))||((name2==name3)&&(name3!=name1))||((name3==name2)&&(name3!=name1))){
	 System.out.println("Not same nor different length");
	 
 }else if(!(name1==name2&&name2==name3)) {
	 System.out.println("All different length");
	 
 }
		
		
		
		
	}

}
