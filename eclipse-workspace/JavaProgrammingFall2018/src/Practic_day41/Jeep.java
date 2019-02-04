package Practic_day41;

public class Jeep {
	
	private String brand,color;
	private int Year;
	
	
	public String getBrand() {
		return brand;
		
	}
	
	public void setBrand(String newBrand) {
		
		brand=newBrand;
		
	}
	
	public String getColor() {
		
		return color;
	}
	public void setColor(String newColor) {
		
		color=newColor;
	}
	public int getYear() {
		
		return Year;
	}
	public void setYear(int newYear) {
		
		Year=newYear;
	}
	public static void main(String[] args) {
		
		Jeep car1=new Jeep();
		
		car1.setColor("White");
		car1.setBrand("Mercedes");
		car1.setYear(2018);
		
		System.out.println("Brand -> "+car1.getBrand());
		System.out.println("Color -> "+car1.getColor());
		System.out.println("Year -> "+car1.getYear());
		
		Jeep car2=new Jeep();
		
		car2.setBrand("BMW");
		car2.setColor("Black");
		car2.setYear(2016);
		
		System.out.println("=================");
		
		System.out.println("Brand -> "+car2.getBrand());
		System.out.println("Color -> "+car2.getColor());
		System.out.println("Year -> "+car2.getYear());
		
		
		
	}

}
