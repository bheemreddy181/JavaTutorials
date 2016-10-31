
class Frog{
	
	public String name;
	private int id;
	public Frog (int id, String name){
		
		this.id = id;
		this.name = name;
	}
	public String toString(){
		
		return String.format("%d: %s",id,name);
//		StringBuilder sb = new StringBuilder();
//		sb.append(id).append(": ").append(name);
//		return sb.toString();
	}
	
}

public class App {
	public static void main(String[] args) {
		
	Frog frog1 = new Frog(7,"Bob");
	
	
	System.out.println(frog1);
	}
}
