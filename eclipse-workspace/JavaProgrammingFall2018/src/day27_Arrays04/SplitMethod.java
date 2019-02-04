package day27_Arrays04;

public class SplitMethod {
	public static void main(String[] args) {
		
String words= "java-selenium-cucumber-testng-junit-eclipse-maven-git-github";
		
		String []splittedWords=words.split("-");
		
		System.out.println(splittedWords.length);
		
		System.out.println(splittedWords[0]);
		for(String n:splittedWords) {
			System.out.println(n);
		}

		String searchResults="All categories  “wooden spoon” 13,623 Results.";

        String [] arrResults=searchResults.split(" ");		
		System.out.println("Words count "+arrResults.length);
		
		
		
		
		
		
		
	}

}
