package Practice_day42;

import java.util.ArrayList;

public class Bag {
	
	private String brand;
	private String type;
	private String color;
	private double price;
	
	
	public String getBrand() {
		
		return brand;
	}
	public void setBrand(String brand) {
		
		this.brand=brand;
	}
	public String getType() {

		return type;
	}
	public void setType(String type) {
		this.type=type;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		
		this.price=price;
		
	}
	
	public Bag() {
		
		this.brand="unknown";
		this.type="unknown";
		this.color="unknown";
		this.price=0;
		
	}
	
	public Bag(String brand,String type,String color,double price) {
		
		this.brand=brand;
		this.type=type;
		this.color=color;
		this.price=price;
		
		
		
	}
	public void setBagInfo(String brand,double price) {
		
		this.brand=brand;
		this.price=price;
		
		
	}
	public String getBagInfo() {
		
		return "I got a "+this.brand+" bag.Its price is $"+this.price;

	}
	
	public String twoChar(String str, int index) {

	      if(str.length()>=2){
	           if(index<=str.length()-2){
	            str=str.substring(index,index+1);
	           }else{
	            str=str.substring(0,2);
	          } 
	      
	    }return str;
	    
	  }
	  
		  
		  
		  
	  } 

	  
	  
	
	


