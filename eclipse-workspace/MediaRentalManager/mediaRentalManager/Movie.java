package mediaRentalManager;

//Generate getters and setters
//generate constructor
public class Movie extends Media {
	public Movie(String title, int copiesAvailable) {
		super(title, copiesAvailable);
		// TODO Auto-generated constructor stub
	}

	private String rating;
	
      
	
	
	/*
	 * Title: Gone with the Wind, Copies Available: 2, Rating: PG
	 */
	
	@Override
	public String toString() {
		
		return "Title: "+getTitle()+"Copies Available: "+getCopiesAvailable()+"Rating: "+getRating();
	}


    public void setrating(String rating) {
			this.rating=rating;
		}
		
    public String getRating() {
			return rating;
		}

}
