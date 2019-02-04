package Repl.it;

public class Carpet {
	// width, length, unitPrice, totalPrice
	
	double width;
	double length;
	double totalPrice;
	double unitPrice;
	boolean isPersian;

	public Carpet () {
		//Size is 300 x 300 and totalPrice for that is 200. And also it is not a Persian carpet. unitPrice is set as 0.

		this.width=300;
		this. length=300;
		this. totalPrice=200;
		this.unitPrice=0;
		isPersian=false;
		
		
	}
	public Carpet(double width,double length,double unitPrice,boolean isParsian) {
		
		this.width=width;
		this.length=length;
		this.unitPrice=unitPrice;
		this.isPersian=isParsian;
		this.totalPrice=totalPrice;
		
		if(isParsian==false) {
			 totalPrice=(width+length)*2;

		}else {

		 totalPrice=((width+length)*2)+200;
		}
		
				
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getTotalPrice() {
		
		
		return  totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		
		 totalPrice=(width+length)*unitPrice;
		this.totalPrice = totalPrice;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public boolean isParsian() {
		return isPersian;
	}
	public void setParsian(boolean isParsian) {
		
	}
}
