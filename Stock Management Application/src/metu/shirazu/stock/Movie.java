package metu.shirazu.stock;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Çaðri Emre AKIN
 *
 */


public class Movie extends Product{



	private String [] actors;
	private String [] directors;
	private String studio;
	private String movieGenre;
	
	Movie(String[] actors, String []directors,String studio, String movieGenre ){
		super();
		this.actors = actors;
		this.directors = directors;
		this.studio = studio;
		this.movieGenre = movieGenre;		
	}
	
	

	public String[] getActors() {
		return Arrays.copyOf(actors,actors.length);
	}


	public void setActors(String[] actors) {
		actors = Arrays.copyOf(actors,actors.length);
	}


	public String[] getDirectors() {
		return Arrays.copyOf(directors, directors.length);
	}


	public void setDirectors(String[] directors) {
		directors = Arrays.copyOf(directors, directors.length);
	}


	public String getStudio() {
		return studio;
	}


	public void setStudio(String studio) {
		this.studio = studio;
	}


	public String getMovieGenre() {
		return movieGenre;
	}


	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	
	
	public int getPhysicalSize(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type movie lenght in minutes: ");
		int movieLength=input.nextInt();
		
		System.out.println("Type kbps: ");
		int kbps= input.nextInt();
		
			int totalLength= movieLength * 60 * kbps / 8192;
		
		System.out.print("In MB: ");
		return totalLength;
		
	}
	
}
