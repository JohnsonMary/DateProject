package PtacticeD_day_34;

public class VarArgs {
	public static void main(String[] args) {
		
		sumAll(12,45,33,7,8);
		shoppingList("tomatoes","blueberry","cabbage","orange","pepper");
		
		
	}

	public static void sumAll(int... nums) {
		
		int sum=0;
		for(int n:nums) {
			sum+=n;
			
		}System.out.println("The sum is "+sum);
		
		
		
		
	}

	public static void shoppingList(String... list) {
		
		System.out.println("The shopping list: ");
		for(String l:list) {
			
			System.out.print(l+" ");
			
		}
		
		
	}
		
}
