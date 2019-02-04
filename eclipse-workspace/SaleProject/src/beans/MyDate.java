package beans;

public class MyDate {
	
	private int month;
	private int date;
	private int year;
	
	public String toString() {
		
		return month+"/"+date+"/"+year;
	}
	
	public MyDate(int month, int date, int year) {
		super();
		this.month = month;
		this.date = date;
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	

}
