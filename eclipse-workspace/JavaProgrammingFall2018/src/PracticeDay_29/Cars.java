package PracticeDay_29;

import java.util.Arrays;

public class Cars {
	public static void main(String[] args) {
		
		String[][]cars= {{"Honda","Lexus","Toyota","Acura"},
				        {"Audi","BMW","Porche","VW","Mercedes"},
				        {"Dodge","Ford","Tesla"},
				        {"Ferrari","Fiat","Maserati","Alfa","Lacia"}};
		
		
		for(int i=0; i<cars.length; i++) {
			
			switch(i) {
			case 0:
				System.out.println("Japanese: ");
				break;
			case 1:
				System.out.println("German: ");
				break;
			case 2:
				System.out.println("American: ");
				break;
			case 3:
				System.out.println("Italian: ");
				break;
			default:
				System.out.println("Unknown group");
				break;
				
			
		}
			
			for(int j=0; j<cars[i].length; j++) {
				
				System.out.print(cars[i][j]+" ");
				
				
			}
			    System.out.println();
		}


		
		
		
		
		
		
	}

}
