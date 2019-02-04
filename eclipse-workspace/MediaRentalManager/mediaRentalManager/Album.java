package mediaRentalManager;

/*
 * create getters/setters
 * constructors
 */
public class Album extends Media {
	
	public Album(String title, int copiesAvailable) {
		super(title, copiesAvailable);
		// TODO Auto-generated constructor stub
	}


	private String artist;
	private String songs;
	
	
	public void setArtist(String artist) {
		this.artist=artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setSongs(String songs) {
		this.songs=songs;
	}
	
	public String getSongs() {

		return songs;
	}
	
	
	/*
	 *return format: Title: Bad, Copies Available: 2, Artist: Mike J, Songs: Mirror, Far Away
	 */
	@Override
	public String toString() {
		
		return "Title: "+getTitle()+" Copies Available: "+getCopiesAvailable()+" Artist: "+getArtist()+" Songs: "+getSongs();
	}

}
