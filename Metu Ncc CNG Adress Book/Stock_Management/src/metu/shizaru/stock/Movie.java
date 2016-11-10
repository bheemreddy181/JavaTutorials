
package metu.shizaru.stock;



import java.util.Scanner;
/**
 * 
 * @author MERVE
 *
 */
public class Movie extends Product{

//	public Movie() {
		// TODO Auto-generated constructor stub
//	}
  
	private String[] actors;
	private String[] directors;
	private String studio;
	private String movieGenre;
	
	
	






	//implement this
	public int getPhysicalSize(){
		 Scanner sc=new Scanner(System.in);
		System.out.println("Type movie lenght in minutes: ");
		int MovieLengthinmunutes=sc.nextInt();
		System.out.println("Type kbps: ");
		int kbps= sc.nextInt();
		
			int sum= MovieLengthinmunutes * 60 * kbps / 8192;
		
		System.out.print("In MB: ");
		return sum;
		
		
	}

	



	/**
	 * @return the actors
	 */
	public String[] getActors() {
		return actors;
	}



	/**
	 * @param actors the actors to set
	 */
	public void setActors(String[] actors) {
		this.actors = actors;
	}



	/**
	 * @return the directors
	 */
	public String[] getDirectors() {
		return directors;
	}



	/**
	 * @param directors the directors to set
	 */
	public void setDirectors(String[] directors) {
		this.directors = directors;
	}



	/**
	 * @return the studio
	 */
	public String getStudio() {
		return studio;
	}



	/**
	 * @param studio the studio to set
	 */
	public void setStudio(String studio) {
		this.studio = studio;
	}


	/**
	 * @return the movieGenre
	 */
	public String getMovieGenre() {
		return movieGenre;
	}



	/**
	 * @param movieGenre the movieGenre to set
	 */
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}





}








	

	
	
	
	
	




















