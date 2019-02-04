package Repl.it;

public class Calc {
	
	private int x;
	private int y;
	private int result;

	  
public int getX(){
	    
	    return x;
	  }
public void setX(int x){
	    
	    this.x=x;
	  
	}
	public int getY(){
	  
	  return y;
	}
	public void setY(int y){
	  
	  this.y=y;

	}
	public void plus(){
		
	  Calc a=new Calc();
	  
	result= x+y;
	}
	public void minus(){
	  
	  Calc a=new Calc();
	  
	 result= x-y;
	  
	}

	  public int getResult(){
	    
		  
	    return result;
	  }
	  public void setResult(int x,int y) {
		  
		  this.x=x;
		  this.y=y;
		  
		  
		  
	  }
	  
}
