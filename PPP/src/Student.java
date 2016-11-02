
/* Access Levels               Class			Package				Subclass			World	
 * 			 
 * Public						Y					Y					Y				  Y
 * 	
 * Protected					Y					Y					Y				  N
 * 
 * Private						Y					N					N				  N
 * 
 * No modifier					Y					Y					N				  N
 */
public class Student {
	
	String name1;  // no modifier
	int age1;	  // no modifier
	
	public String name2;
	public int age2;
	
	protected String name3;
	protected int age3;
	
	private String name4 ;
	private int age4;
	
	public String getName4() {
		return name4;
	}
	public void setName4(String name4) {
		this.name4 = name4;
	}
	public int getAge4() {
		return age4;
	}
	public void setAge4(int age4) {
		this.age4 = age4;
	}
	
	

}
