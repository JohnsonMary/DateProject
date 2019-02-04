package salesmanagement;

import java.io.IOException;
import java.util.Arrays;

import beans.Location;
import beans.MyDate;
import beans.Payment;
import beans.Product;
import beans.Visa;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		//1/2/09 4:53,Product1,1200,Visa,Betina,Parkville,MO,United States
		
		
		
		Payment payment1 = new Visa();
		payment1.setTransactionDate(new MyDate(1,2,2009));
		payment1.setProduct(new Product("Product1"));
		payment1.setPrice(1200);
		payment1.setPaymentType("Visa");
		payment1.setName("Betina");
		payment1.setLocation(new Location("Parkville","MO","United States"));
		
		System.out.println(payment1.toString());
		
		PaymentController p = new PaymentController();
		p.loadDataFromCSVFile("/Users/maryjohnson/Downloads/SalesJan2009.csv");
		
		for(Payment payment : p.payments) {
			System.out.println(payment.toString());
		}
		
		
		
		
		
	}
	
	

}
