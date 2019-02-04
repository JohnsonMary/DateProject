package mediaRentalManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaRentalManager implements MediaRentalManagerInt{
	
	private List<Customer> customers = new ArrayList<>();
	private List<Media> media = new ArrayList<>();
	private int limitedPlanLimit;
	
	
	/**
	 * Adds the specified customer to the database. The address is a physical address (not e-mail).
	 * The plan options available are: <b>LIMITED</b> and <b>UNLIMITED</b>.  LIMITED 
	 * defines a default maximum of two media that can be rented.
	 * @param name
	 * @param address
	 * @param plan 
	 */
	@Override
	public void addCustomer(String name, String address, String plan) {
		//create Customer Object then add to customers list;
		
		
		customers.add(new Customer(name, address, plan));
		
	}	
		

	@Override
	public String getAllCustomersInfo() {
		
		StringBuilder stb = new StringBuilder("***** Customers' Information *****");
		//This line will sort Customers by name
		Collections.sort(customers,(a,b) -> a.getName().compareTo(b.getName()) );
		
		//TODO add each customer info to stb. separate by new line
		
	    for(int i=0; i<customers.size();i++) {
	    	
	    	stb.append(customers.get(i).getName());
	    	
	    }

		
		return stb.toString();
	}
	/**
	 * Adds the specified movie to the database.  The possible values for rating are
	 * "PG", "R", "NR".
	 * @param title
	 * @param copiesAvailable
	 * @param rating
	 */
	
	@Override
	public void addMovie(String title, int copiesAvailable, String rating) {
		//create Movie Object then add to media list	
		
		
		
	}

	@Override
	public void addAlbum(String title, int copiesAvailable, String artist, String songs) {
		//create Album Object then add to media list	
	}
	
	@Override
	public String getAllMediaInfo() {
		StringBuilder stb = new StringBuilder("***** Media Information *****\n");
		//This line will sort media by name
		Collections.sort(media, (a,b) -> a.getTitle().compareTo(b.getTitle()));
		//TODO add each media info to stb. separate by new line

		return stb.toString();
	}

	@Override
	public void setLimitedPlanLimit(int limitedPlanLimit) {
		// TODO assign to limitedPlanLimit.
		//Customers with LIMITED plan can only rent that many media
		
	}

	@Override
	public boolean addToQueue(String customerName, String mediaTitle) {
		//TODO find the customer by name and add mediaTitle
		//return true if customer is found and media added otherwise false
		return false;
	}

	@Override
	public boolean removeFromQueue(String customerName, String mediaTitle) {
		//TODO find the customer by name and remove media from Queue
		//return true if customer is found and media is also in queue and
		//was removed otherwise false
		return false;
	}

	@Override
	public String processRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean returnMedia(String customerName, String mediaTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<String> searchMedia(String title, String rating, String artist, String songs) {
		// TODO Auto-generated method stub
		return null;
	}

}
