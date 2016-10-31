
class Frog {

	private String name;
	private int age;
	
	public  String getName(){
		return name;
		
	}
	
	public int getAge(){
		
		return age;
	}
	
	public void setName (String name){
	    this.name = name;
	}
	
	public void setAge (int age){
		this.age = age;
	}
}
public class Application {
	public static void main(String[] args) {
		
		Frog frog1 =  new Frog();
		
		frog1.setName("Emre");
		frog1.setAge(25);
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		
	}
}
