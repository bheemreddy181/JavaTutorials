
package metu.shizaru.stock;

import java.util.Scanner;
/**
 * 
 * @author MERVE
 *
 */
public class Music extends Product{

	/**
	 * IMPLEMENT PHYSICAL SIZE DÝFFERENT WAY
	 */
	//public Music() {
		
	//}

	
	private String artist;
	private String recordCompany;
	private String musicGenre;
	


	//Ýmplement THIS
	
/**
	 * @param artist
	 * @param recordCompany
	 * @param musicGenre
	 */
	public Music(String artist, String recordCompany, String musicGenre) {
		super();
		this.artist = artist;
		this.recordCompany = recordCompany;
		this.musicGenre = musicGenre;
		
	}
	public Music() {
		super();
		this.artist = null;
		this.recordCompany = null;
		this.musicGenre = null;
	}


public int getPhysicalSize(){
	int sum=0;
	Scanner sc= new Scanner(System.in); 
	System.out.println("1 for dvd, 2 for cd");
	String in= sc.next();
	 
	 if (in.equalsIgnoreCase("dvd"))
		sum=4700;
	else if (in.equalsIgnoreCase("cd"))
	sum=700;
	
	System.out.print("In MB: ");
		return sum;
	
}


/**
 * @return the artist
 */
public String getArtist() {
	return artist;
}

/**
 * @param artist the artist to set
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
 * @return the musicGenre
 */
public String getMusicGenre() {
	return musicGenre;
}

/**
 * @param musicGenre the musicGenre to set
 */
public void setMusicGenre(String musicGenre) {
	this.musicGenre = musicGenre;
}





}
