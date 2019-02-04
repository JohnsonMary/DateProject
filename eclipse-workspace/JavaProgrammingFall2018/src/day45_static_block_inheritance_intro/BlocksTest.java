package day45_static_block_inheritance_intro;

public class BlocksTest {
	public static void main(String[] args) {
//		System.out.println(Blocks.num);//1100
//		System.out.println(Blocks.str);//Hello
//		
//		System.out.println(Blocks.num);//1100
//		System.out.println(Blocks.str);//Hello
		
		Blocks b1 = new Blocks();//3200
		Blocks b2 = new Blocks();//7400
		
		System.out.println(b1.num); 
		System.out.println(b1.str);
		
		System.out.println(b2.num);
		System.out.println(b2.str);
		
		
	}
}


