package Practice5_OldTopics;

public class CalculatingTax {
	public static void main(String[] args) {
		
		double apples=1.5;
		double tomatoes=3.6;
		double carrots=4.2;
		
		double totalBeforeTax=apples+tomatoes+carrots;
		double tax=totalBeforeTax*0.06;
		
		System.out.println("Total tax is "+tax);
		double grandTotal=totalBeforeTax+tax;
		System.out.println("Grand total is "+grandTotal);
		
		
		
		
		
		
		
	}

}
