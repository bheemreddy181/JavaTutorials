

class Plant {
	
	public static final int id =7;
	private String name;
	
	public String getData(){
		String data =" some stuff"+ calcGrowth();
		return data;
	}
	
	public int calcGrowth(){
		
		return 8;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class App {
	public static void main(String[] args) {
		
	}
}
