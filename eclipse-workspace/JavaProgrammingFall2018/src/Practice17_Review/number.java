package Practice17_Review;

public class number {
	public static void main(String[] args) {
		int number=10;
		
		System.out.println(number);
		
		System.out.println(++number); 
		number++;
		System.out.println(number);
		
		int num2=number++;
		System.out.println(num2);
		System.out.println(number);
		
		 num2=++number + number++;
		System.out.println(num2);
		System.out.println(number);
		
		int zipCode=22099;
		
		if(zipCode>=22000 && zipCode++ <=22200) {
			System.out.println("Mclean");
			
		}else {
			System.out.println("Not Mclean");
		}
		
		System.out.println(zipCode);
		
		
	}

}
