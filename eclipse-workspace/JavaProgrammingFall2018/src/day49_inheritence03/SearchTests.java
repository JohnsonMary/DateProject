package day49_inheritence03;

public class SearchTests {
	public static void main(String[] args) {
		
		SearchEngine srch = new SearchEngine();
		srch.search("iphone charger");
		
		Google google = new Google();
		google.search("Java overriding rules");
		
		Etsy etsy = new Etsy();
		etsy.search("Wooden spoon");
	}

}
