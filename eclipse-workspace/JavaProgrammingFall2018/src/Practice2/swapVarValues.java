package Practice2;

public class swapVarValues {
	public static void main(String[] args) {
		int apples=1;
		int oranges=2;
		
		int tempContainer=apples;
		apples=oranges;
		oranges=tempContainer;
		
		System.out.println(oranges+" oranges "+apples+" apples ");
		
		int birds=3;
		int roses=4;
		
		int temp=birds;
		birds=roses;
		roses=temp;
		System.out.println(birds+" birds "+roses+" roses ");
		
		double water=5.4;
		double coke=6.3;
		
		double cont=water;
		water=coke;
		coke=cont;
		
		System.out.println(water+" water "+coke+" coke ");
		
		
		
	}
	
	
	
	

}
