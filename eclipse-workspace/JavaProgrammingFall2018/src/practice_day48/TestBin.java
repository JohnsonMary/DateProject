package practice_day48;

public class TestBin {
	public static void main(String[] args) {
		
		Bin yourBin=new Bin();
		System.out.println(yourBin.toString());
		
		yourBin.add("book");
		yourBin.add("pencil");
		yourBin.add("Notebook");
		System.out.println(yourBin.toString());
		
		yourBin.remove("book");
		System.out.println(yourBin.toString());

		RecycleBin rBin=new RecycleBin();
		rBin.add("hello");
		rBin.add("Hi");
		System.out.println(rBin.toString());

		
		
		
	}

}
