package Practice6;

public class ForLoop {
	public static void main(String[] args) {
		
	
		
		for (int n=5; n<=10; n++) {
			System.out.println(n+",");
		}
	
		int[] num= {1,2,4,5,7};
		
		for(int number:num) {
			System.out.println("Numbers"+number);
			
		}
		
		int [] s= {1,2,3,4,5,6,7};
		
		for(int m:s) {
			if(m%2==0) {
				System.out.print(m+",");
				
			}
			
		}
		
		int []m= {3,5,6,8,9};
		for(int t:m) {
			System.out.println("Number "+t);
			
		}
		
		String[] l= {"aaa","bbb","ccc"};
		
		for(String letters:l) {
			System.out.println("Letter "+letters);
			
		}
		
		int [] ints= {1,2,3,4,5,11,6,123};
		
		for(int item:ints) {
			if(item%2==0) {
				System.out.println("Even number: "+item+",");
		}else {
			    System.out.println("Odd number: "+item+",");
		}

			
		}
		
		String [] strs= {"aaa","bb","cafd"};
		
		for(String letters:strs) {
			if(letters.indexOf("b")>-1) {
				System.out.println(" found b, getting out");
				break;
			}
			System.out.print("letters "+letters);
		}
		
		
		
		
	}

}
