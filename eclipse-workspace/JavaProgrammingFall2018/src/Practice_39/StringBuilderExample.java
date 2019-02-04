package Practice_39;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		
		StringBuilder stb=new StringBuilder ("Halloween");
		StringBuilder stb2=new StringBuilder();
        stb2.append("Java");
        stb2.append(", Selenium").append(", C#, ");
        stb2.append(100);
        System.out.println(stb2);
        
        String s="aaa";
        s=s+100;
        s=s+true;
        s=s+'@';
        System.out.println(s);
        
        StringBuilder builder1=new StringBuilder ("java");
        StringBuilder builder2=new StringBuilder ("java");
        
        System.out.println(builder1==builder2);
        
        boolean equal=builder1.toString().equals(builder2.toString());
        System.out.println(equal);
        
        StringBuilder builder3=builder1;
        System.out.println(builder3==builder1);
        System.out.println(builder3.equals(builder1));
        System.out.println(builder3.toString().equals(builder1.toString()));
        
        System.out.println(builder1);
        System.out.println(builder3);
        
        builder3.append(" programming");
        
        StringBuilder builder4=new StringBuilder(builder1);
        System.out.println(builder4);
        
        builder1.append("!!!");
        System.out.println(builder4);
        System.out.println(builder1);
        
        StringBuilder letters=new StringBuilder ("ABCDEFGHIJKLM");
        
        letters.append("KKK WWW");
        System.out.println(letters);
        System.out.println();
        
        letters.delete(0, 4);
        System.out.println(letters);
        
        String str2="aabbaajj";
        str2=str2.replace("b", "RRR");
        System.out.println(str2);
        
        char ch='A';
        ch++;
        	System.out.println(ch);
        	
        	StringBuilder alphabet=new StringBuilder();
        	String str="";
        	for(char i='A'; i<='Z';i++) {
        		
        		alphabet.append(i);
    
        		
         	}System.out.println(alphabet);
		
		
		
	}
	

}
