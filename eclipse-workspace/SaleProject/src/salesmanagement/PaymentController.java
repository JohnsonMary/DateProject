package salesmanagement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import beans.Amex;
import beans.Diners;
import beans.Location;
import beans.MasterCard;
import beans.MyDate;
import beans.Payment;
import beans.Product;
import beans.Visa;

public class PaymentController {
	
	List <Payment> payments = new ArrayList<>();
	
	
	//1/2/09 13:08,Product1,1200,Mastercard,Federica e Andrea,Astoria,OR,United States
	
	
     public MyDate parseDate(String str) {
		
		// String str = "1/2/09  4:53 ";
		
		String [] array = str.split("/");
		array[2]=array[2].substring(0,2);
		
		return new MyDate (Integer.parseInt(array[0]),
				           Integer.parseInt(array[1]),
				           Integer.parseInt(array[2]));
		
	}
	
	public void addAPaymentRecord(String data) {
		
		String array[] =data.split(",");
		if(data.isEmpty()) {
			
			System.out.println("Exception: Empty data is passed");
			return;
			
		}
		
		if(data.length()!=8) {
			
			System.out.println("Exception: Some data is missing");
			return;
			
		}
		
		Payment tempPayment = null;
		
		switch(array[3].trim()) {
		case "Visa":
			tempPayment = new Visa();
			break;
		case "Mastercard":
			tempPayment = new MasterCard();
			break;
		case "Diners":
			tempPayment = new Diners();
			break;
		case "Amex":
			tempPayment = new Amex();
			break;
		default:
			System.out.println("Exception: Invalid payment - "+array[3].trim());
			return;
		
		
		
		
		}
		
		tempPayment.setTransactionDate(parseDate(array[0]));
		tempPayment.setProduct(new Product(array[1]));
		tempPayment.setPrice(Double.parseDouble(array[2]));
		tempPayment.setName(array[3].trim());
		tempPayment.setLocation(new Location(array[3],array[4],array[5]));
		
		payments.add(tempPayment);
		
	}
	
	public void loadDataFromCSVFile(String path) throws IOException {
		
		BufferedReader br =new  BufferedReader(new FileReader("/Users/maryjohnson/Downloads/SalesJan2009 (1).csv"));

		String line = br.readLine();	
		
		while((line = br.readLine()) != null) {
			
			addAPaymentRecord(line);
		}
		
	}

	
	
	

	
	
	

}
