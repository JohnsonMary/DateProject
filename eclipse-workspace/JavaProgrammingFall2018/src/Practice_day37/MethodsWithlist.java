package Practice_day37;
import java.util.*;

public class MethodsWithlist {
	public static void main(String[] args) {
		
		List <Integer> numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("Numbers: "+numbers);
		
		List<Integer>numbers2=new ArrayList<>(numbers);
		numbers2.add(50);
		numbers2.add(60);

		System.out.println(sumList(numbers));
		System.out.println("Numbers2: "+numbers2);
		System.out.println("The sum of 2 arraylists are: "+sum2Lists(numbers,numbers2));
		
		
		System.out.println(buildInList(5));
		System.out.println(buildInList(9));
		System.out.println(sumList(buildInList(100)));
		
		
	}
	public static int sumList(List<Integer> numbers) {
		
		int sum=0;
		for(int n:numbers) {
			
			sum+=n;
		}return sum;

		
	}
	
	public static int sum2Lists(List<Integer>nums1,List<Integer>nums2) {
		
		int sum1=0;
		for(int n:nums1) {
			
			sum1+=n;
		}

		int sum2=0;
		for(int n:nums2) {
			
			sum2+=n;
		}

		return sum1+sum2;
		
	}
	public static List<Integer> buildInList(int count){
		
		List<Integer>numbers=new ArrayList<>();
		Random random=new Random();
		
		for(int i=1; i<=count; i++) {
			
			numbers.add(random.nextInt(101));
			
		}return numbers;

		
	}
	
	

}
