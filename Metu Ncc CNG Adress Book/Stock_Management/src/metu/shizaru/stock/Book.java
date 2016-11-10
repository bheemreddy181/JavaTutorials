
package metu.shizaru.stock;

import java.util.Scanner;
/**
 * 
 * @author MERVE
 *
 */

public class Book extends Product{

	


	private String isbn;
	private String author;
	private String publisher;
	private String bookGenre;

	
	




	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}



	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}



	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}



	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}



	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	/**
	 * @return the bookGenre
	 */
	public String getBookGenre() {
		return bookGenre;
	}



	/**
	 * @param bookGenre the bookGenre to set
	 */
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}



	
	public int getPhysicalSize(){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Type height ");
		int a=sc.nextInt();
		System.out.print("Type width ");
		int b=sc.nextInt();
		System.out.print("Type lenght ");
		int c=sc.nextInt();
		int size=a*b*c;
		System.out.print("In volume");
		return (size);
		
	}







	
	
	
}
