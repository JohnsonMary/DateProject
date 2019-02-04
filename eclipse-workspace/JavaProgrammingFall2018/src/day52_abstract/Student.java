package day52_abstract;

public abstract class Student {
	
	 int age ; 
	  
	  public Student(int age) {
	    this.age = age ; 
	  }
	  
	  public abstract void attendClass();
	  
	  
	}

	abstract class LocalStudent extends Student{
	  //int age ; 
	  int seatID ; 
	  
	  public LocalStudent(){
	    super(100);
	  }
	  
	  public void attendClass() {
	    System.out.println("abc ");
	 }
	  
	  
	  public abstract void study();

	}

	//  Student <--- LocalStudent <---- UENStudent

	class UENStudent extends LocalStudent{

	  @Override
	  public void study() {
	    // TODO Auto-generated method stub
	    
	  }

	

	  
	}