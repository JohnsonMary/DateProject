package practic_day_27;

public class Split {
	public static void main(String[] args) {
		
		
String words="java-selenium-cucumber-testing-junit-eclipse-maven";

String[] w=words.split("-");

System.out.println(w.length);
System.out.println(w[0]);

for(String i:w) {
	System.out.print(i+" ");
}
System.out.println();
String searchResults="All categories wooden spoon 13,623 Results.";

String [] s=searchResults.split(" ");

System.out.println(s.length);
System.out.println(searchResults.split(" ").length);
System.out.println(searchResults.split(" ")[0]);

System.out.println(s[4]);




		
		
		
		
		
		
	}

}
