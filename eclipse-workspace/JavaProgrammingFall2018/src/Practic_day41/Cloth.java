package Practic_day41;

public class Cloth {
	
	String type,color,size;
	int howMany;

	public static void main(String[] args) {
		
		Cloth cloth1=new Cloth();
		
		cloth1.type="Skirt";
		cloth1.color="red";
		cloth1.size="medium";
		cloth1.howMany=2;
		
		ClothInfo(cloth1);
		
		Cloth clothes=buyACloth("shirt","yellow","large",1);
		System.out.println(clothes.type);
		System.out.println(clothes.color);
		System.out.println(clothes.size);
		System.out.println(clothes.howMany);

		
	}
	public static void ClothInfo(Cloth clothes) {
		
		System.out.println("It's a "+clothes.type);
		System.out.println("It's color is "+clothes.color);
		System.out.println("It's size is "+clothes.size);
		System.out.println("Count -> "+clothes.howMany);
		
	}
	public static Cloth buyACloth(String type,String color,String size,int howMany) {
		
		Cloth cloth2=new Cloth();
		
		cloth2.type=type;
		cloth2.color=color;
		cloth2.size=size;
		cloth2.howMany=howMany;
		
		return cloth2;
		
		
	}
}
