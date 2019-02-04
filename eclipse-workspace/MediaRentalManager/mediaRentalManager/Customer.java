package mediaRentalManager;

import java.util.ArrayList;
import java.util.List;

/*
 * Create getters/setters
 * constructors
 */
public class Customer {
	
	private String name;
	private String address;
	private String plan;
	
	private List<String> rented = new ArrayList<>();
	private List<String> queued = new ArrayList<>();
	
	
	public Customer() {

	}
	public Customer(String name, String address, String plan) {
        this.name = name;
        this.address = address;
        this.plan = plan;       
    }
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {

		return name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {

		return address;
	}
	
	public void setPlan(String plan) {
		this.plan=plan;
	}
	
	public String getPlan() {

		return plan;
	}
	

	public void addToQueuedList(String mediaTitle) {
		//add mediaTitle to queued list
	}
	
	public void addToRentedList(String mediaTitle) {
		//add mediaTitle to rented list
	}
	
	public void removeFromQueuedList(String mediaTitle) {
		//remove mediaTitle from queued list
	}
	
	public void removeFromRentedList(String mediaTitle) {
		//remove mediaTitle from rented list
	}
	
	//return object info in this format:
	/*Name: Albert, Mike, Address: 11 Apple Mount VA, Plan: LIMITED
	  Rented: []
	  Queue: []
	*/
	@Override
	public String toString() {
		return null;
	}

	


	
}
