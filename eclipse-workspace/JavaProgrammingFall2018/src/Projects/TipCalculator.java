package Projects;
import java.util.Scanner;

public class TipCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double totalTip=0;
	    
		System.out.println("How many people?");
		int numberOfPeople=scan.nextInt();
		
		System.out.println("What is the check amount?");
		double checkAmount=scan.nextDouble();
		
		System.out.println("Are you going to split?Choose a number: 1.Yes 2.No");
		int split=scan.nextInt();
	    System.out.println("How is the service quality?Please choose a number \n1.Poor \n2.Fair \n3.Good \n4.Excellent");
	    int serviceQuality=scan.nextInt();  
	    
	    double totalToPay=checkAmount+totalTip;
		double totalPerPerson=totalToPay/numberOfPeople;
		double tipPerPerson=totalTip/numberOfPeople;
		
		if(split==1) {
			System.out.println(numberOfPeople+" people to split");
			
		}else {
			System.out.println("No split");
		}
		    System.out.println(numberOfPeople+" number of people entered");
		
		    
		if(serviceQuality==1){
		    totalTip=checkAmount*0.05;
			
		}else if(serviceQuality==2) {
			totalTip=checkAmount*0.1;
			
		}else if(serviceQuality==3) {
			totalTip=checkAmount*0.15;
			
		}else if(serviceQuality==4) {
			totalTip=checkAmount*0.20;
			
		}else if(serviceQuality==5) {
			totalTip=checkAmount*0.25;
			
		}else {
			System.out.println("Invalid entry");
		} 
		     
		    System.out.println("Total to pay: "+(checkAmount+totalTip));
		    System.out.println("TotalTip: "+totalTip);
		    System.out.println("TotalPerPerson: "+totalPerPerson);
		    System.out.println("Tip per person: "+(totalTip/numberOfPeople));
		    
		
		
		
		
		
		
		
	}

}
