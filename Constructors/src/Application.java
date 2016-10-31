class Machine {
	private String name;
	private int code;
	
	public Machine(){
		this("Arnie",5);
		System.out.println("Constructor running!");
		
		
		
	}
	
	public Machine (String name){
		
		this (name,5);
		System.out.println("2nd Constructor is running!");
		this.name = name;
	
	}
	
	public Machine (String name,int code){
		
		System.out.println("3rd Constructor is running!");
		this.name = name;
		this.code = code;
	}
	
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine machine1 = new Machine();
		
		//Machine machine2 = new Machine("Ali");
		
		//Machine machine3 = new Machine("veli",24);
	}

}
