package day57_Exceptions;

public class UserManagement {
	/*
	 * // Task 1 


Exception : 


create a class called UserManagement

create main method 

create static method called CreateUserName
take one string as name and return nothing

 the logic : 
 		print first letter of the name 
 		print 10th letter of the name
 		turn your name into char[] then access 4th character 
 		turn first letter into Integer 
 			hint -> you can use Integer.parseInt(arg)

 call your method in main
 	 -- by passing few different arguments 

 // and try to create multi try catch block 
 			inside method to catch exceptions at run time and print sth useful


	 */
	public static void main(String[] args) {
		
		
		try{
			
			createUserName("gulluogluuuu");

		}catch(NumberFormatException  | ArrayIndexOutOfBoundsException e ) {
			
			System.out.println("Caught NumberFormatException");
			
		}catch(NullPointerException n) {
			
			System.out.println("Caught NullPointerException");
			
		}
		System.out.println("========================");
		// TODO Auto-generated method stub
		
				//CreateUserName("6 Ibrahim CyberTek");
				CreateUserName("Ib HASHDASHDGASJHDGA");
				String str = null ; 
				CreateUserName(str);

			}
			
			public  static void CreateUserName(String name) {
			
				try {
					System.out.println(name.charAt(0));
					System.out.println(name.charAt(3));
					
					char[] nameChars = name.toCharArray();
					System.out.println(nameChars[9]);
					
					String[] arrName=name.split("");
					Integer i = Integer.parseInt(arrName[0]);
					System.out.println(i);
					
					throw new Exception();
					
				}catch(NullPointerException e) {
					System.out.println("caught NullPointerException ");
				}catch(StringIndexOutOfBoundsException e) {
					System.out.println("caught StringIndexOutOfBoundsException ");
				}catch(NumberFormatException e) {
					System.out.println("caught NumberFormatException ");
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("caught ArrayIndexOutOfBoundsException ");  
				
				}catch(Exception e) {
					System.out.println("caught Exception ");  
				
				}finally {
					System.out.println(" this is finally block");
				}
			}

	
	public static void createUserName(String name) {
		
		char splittedName[] = name.toCharArray();
		
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(9));
		
		char[] charArray = name.toCharArray();
		
		System.out.println(charArray[9]);
		System.out.println(Integer.parseInt(name.substring(0,1)));
		
	
		
		
	}
	
	


}
