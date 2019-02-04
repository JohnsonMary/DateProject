package day34_methods03;

public class VarArgs {
	public static void main(String[] args) {
		
		shoppingList("rice","tomato","grapes","beef","mango");
		shoppingList("Headphones","MacBookPro","wooden spoon");
		sum(10,20);
		sumAll(12,112,2,333,21,2);
		
	}
	
	public static void sumAll(int... nums) {
		
	}

	public static void sum(int n1,int n2) {
		
		System.out.println(n1+n2);
	}
	
	public static void shoppingList(String ...list ) {
		
		System.out.println("Shopping list: ");

		for(String a:list) {
			
			System.out.print(a+" ");
			
		}System.out.println();
	}
}
