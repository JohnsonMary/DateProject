package HomeWork;

public class EvenNumbers {
	public static void main(String[] args) {
		
		
		int [] numbers= {2,1,2,3,4};
		int counter=0;
		
		for(int n:numbers) {
			
			if(n%2==0) {
				counter++;
				
			}

		}System.out.println(counter);

		
	}

}
