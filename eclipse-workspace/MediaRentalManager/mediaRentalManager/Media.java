package mediaRentalManager;

public abstract class Media {
	//Generate getters and setters
	//generate constructor
	
	private String title;
	private int copiesAvailable;
	
	public Media(String title, int copiesAvailable) {
		this.title=title;
		this.copiesAvailable=copiesAvailable;
		
	}
	
	public void setTitle(String title) {

		this.title=title;
    }  
	
	public String getTitle() {
		return title;
	}
	
	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable=copiesAvailable;
	}
	
	public int getCopiesAvailable() {
		return copiesAvailable;
	}
	
	
}
