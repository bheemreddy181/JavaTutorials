import java.util.ArrayList;

class Machine{
	
	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start(){
		System.out.println("Machine Started");
	}
}

class Camera extends Machine{
	
	@Override
	public String toString() {
		return "I am a camera";
	}
	
	public void snap(){
		System.out.println("Camera snapped");
	}
}


public class App {

	
	public static void main(String[] args) {
	
		ArrayList <Machine> list = new ArrayList<>();
		//passing list to a method as a parameter
		list.add(new Machine());
		list.add(new Machine());
		
		ArrayList <Camera> list2 = new ArrayList<>();
		//passing list to a method as a parameter
		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list);
		showList(list2);
		
		showList2(list);
		showList2(list2);
		
		
	}
	//	public static void showList(ArrayList<Machine> list){ // we cannnot use this function cause camera extends 
	//														// machine so use second 
	//		for(Machine value:list){
	//			System.out.println(value);
	//		}
	//	}
	
	
		public static void showList(ArrayList<? extends Machine> list){ 
			for(Machine value:list){
			System.out.println(value);
			value.start();
			
			}
		}
		
		public static void showList2(ArrayList<? super Camera> list){ 
			for(Object value:list){
			System.out.println(value);
			}
		}
}
