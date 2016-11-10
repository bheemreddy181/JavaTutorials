package metu.shirazu.stock;


import java.util.Scanner;

/**
 * @author Çaðri Emre AKIN
 *
 */


public class Music extends Product {

	private String artist;
	private String recordCompany;
	private String musicGenre;
	
	public Music(String artist, String recordCompany, String musicGenre){
		super();
		this.artist = artist;
		this.recordCompany = recordCompany;
		this.musicGenre = musicGenre;
		
	}
	
	/**
	 * @return the artists
	 */
	public String getArtist() {
		return artist;
	}
	
	/**
	 * @param artists the artists to set
	 */
	public void setArtist(String artist) {
			this.artist = artist;
			}
	
	/**
	 * @return the recordCompany
	 */
	public String getRecordCompany() {
		return recordCompany;
	}
	
	/**
	 * @param recordCompany the recordCompany to set
	 */
	public void setRecordCompany(String recordCompany) {
		this.recordCompany = recordCompany;
	}
	
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return musicGenre;
	}
	
	/**
	 * @param genre the genre set
	 */
	
	
	public void setGenre(String genre) {
		this.musicGenre = genre;
	}
	
	
	
	
	/**
	 * @return physical size of the movie
	 */
	public int getPhysicalSize(){
		
		int total = 0;
		Scanner input= new Scanner(System.in); 
		System.out.println("Please choose 'dvd' or  'cd':");
		String type= input.next();
		 
		 if (type.equalsIgnoreCase("dvd"))
			 total = 4700;
		 else if (type.equalsIgnoreCase("cd"))
			total = 700;
		
		System.out.print("In MB: ");
		return total;
		
	}
	
}
