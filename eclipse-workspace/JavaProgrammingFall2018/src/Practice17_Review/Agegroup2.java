package Practice17_Review;
import java.util.Scanner;

public class Agegroup2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How many months?");
		double months=input.nextDouble();
		
		int years=(int)months/12;
		String ageGroup="";
		int remainingMonths=(int)months%12;
		
		if(years<1) {
			ageGroup="Infant";
			
		}else if(years<=3) {
			ageGroup="Toddler";
			
		}else if(years<=6) {
			ageGroup="Pre-school child";
			
		}else if(years<=41) {
			if(years<=13) {
				ageGroup="School aged child";
			}else if(years<=19) {
				ageGroup="Adolescent";
				
			}else {
                ageGroup="Young adult";

			}
		}else if(years<=65) {
			ageGroup="Middle age adult";
		}else if(years>65) {
			ageGroup="Older adult";
			
		}System.out.println("Age group: "+ageGroup);
		 System.out.println("Years: "+years);
		 System.out.println("Months: "+remainingMonths);
		
		
		
		
		
		
	}

}
