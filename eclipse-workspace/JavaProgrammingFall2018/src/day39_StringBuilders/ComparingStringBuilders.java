package day39_StringBuilders;

public class ComparingStringBuilders {
	public static void main(String[] args) {
		
		StringBuilder builder1=new StringBuilder("java");
		StringBuilder builder2=new StringBuilder("java");
		
		System.out.println(builder1==builder2);
		System.out.println(builder1.equals(builder2));
		
		boolean equal=builder1.toString().equals(builder2.toString());
		System.out.println(equal);
		
		StringBuilder builder3=builder1;
		System.out.println(builder3==builder1);
		
		
		
		
		
		
	}

}
