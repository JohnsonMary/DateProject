package day19_Loops02;

public class SnackTime {
	public static void main(String[] args) {
		
		boolean hungry=true;
		int apples=1;
		
		while(hungry) {
			System.out.println("Eating an apple");
			
			if(apples==5) {
				hungry=false;
			}apples++;
			
		}System.out.println("No longer hungry");
		
		
		
		
	}

}
